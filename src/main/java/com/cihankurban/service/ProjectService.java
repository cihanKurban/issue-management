package com.cihankurban.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cihankurban.dto.ProjectDto;
import com.cihankurban.entity.Project;

public interface ProjectService {

	Project save(Project project);

	ProjectDto getById(Long id);

	List<Project> getByProjectCode(String projectCode);

	List<Project> getByProjectCodeContains(String projectCode);

	Page<Project> getAllPageable(Pageable pageable);

	Boolean delete(Project project);
}
