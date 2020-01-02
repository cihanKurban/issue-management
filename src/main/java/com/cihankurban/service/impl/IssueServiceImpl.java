package com.cihankurban.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cihankurban.dto.IssueDto;
import com.cihankurban.entity.Issue;
import com.cihankurban.repository.IssueRepository;
import com.cihankurban.service.IssueService;

@Service
public class IssueServiceImpl implements IssueService {

	private final IssueRepository issueRepository;
	private final ModelMapper modelMapper;

	@Autowired
	public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
		this.issueRepository = issueRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public IssueDto save(IssueDto issue) {
		if (issue.getDate() == null)
			throw new IllegalArgumentException("Issue Date cannot be null!");

		Issue issueDb = modelMapper.map(issue, Issue.class);
		issueDb = issueRepository.save(issueDb);
		return modelMapper.map(issueDb, IssueDto.class);
	}

	@Override
	public IssueDto getById(Long id) {

		return null;
	}

	@Override
	public Page<IssueDto> getAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(IssueDto issue) {
		// TODO Auto-generated method stub
		return null;
	}

}
