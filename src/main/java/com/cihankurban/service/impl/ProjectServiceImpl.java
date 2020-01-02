package com.cihankurban.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cihankurban.dto.ProjectDto;
import com.cihankurban.entity.Project;
import com.cihankurban.repository.ProjectRepository;
import com.cihankurban.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	private final ProjectRepository projectRepository;
	private final ModelMapper modelMapper;

	public ProjectServiceImpl(ProjectRepository projectRepository, ModelMapper modelMapper) {
		this.projectRepository = projectRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public Project save(Project project) {
		if (project.getProjectCode() == null) {
			throw new IllegalArgumentException("Project code cannot be null!");
		}
		return projectRepository.save(project);
	}

	@Override
	public ProjectDto getById(Long id) {
		Project p = projectRepository.getOne(id);
		return modelMapper.map(p, ProjectDto.class);// Project tipindeki p'yi mapleyip ProjectDto'ya çevirdik.
	}

	@Override
	public List<Project> getByProjectCode(String projectCode) {
		return null;
	}

	@Override
	public List<Project> getByProjectCodeContains(String projectCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Project> getAllPageable(Pageable pageable) {
		return projectRepository.findAll(pageable);
	}

	@Override
	public Boolean delete(Project project) {
		projectRepository.delete(project);
		return Boolean.TRUE;
	}

}
