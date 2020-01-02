package com.cihankurban.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cihankurban.dto.IssueDto;

public interface IssueService {

	IssueDto save(IssueDto issue);

	IssueDto getById(Long id);

	Page<IssueDto> getAllPageable(Pageable pageable);

	Boolean delete(IssueDto issue);
}
