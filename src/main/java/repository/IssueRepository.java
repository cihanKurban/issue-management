package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Issue;

public interface IssueRepository extends  JpaRepository<Issue , Long> {

}
