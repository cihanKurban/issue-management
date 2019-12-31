package service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import dto.IssueDto;

public interface IssueService {

	IssueDto save(IssueDto issue);

	IssueDto getById(Long id);

	Page<IssueDto> getAllPageable(Pageable pageable);

	Boolean delete(IssueDto issue);
}
