package service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import entity.User;
import repository.UserRepository;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User save(User user) {
		if (user.getEmail() == null) {
			throw new IllegalArgumentException("User mail cannot be null!");
		}
		user = userRepository.save(user);
		return user;
	}

	@Override
	public User getById(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public Page<User> getAllPageable(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	public User getByUserName(String username) {
		return userRepository.findByUser(username);
	}

}
