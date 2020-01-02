package com.cihankurban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cihankurban.entity.Issue;

public interface IssueRepository extends  JpaRepository<Issue , Long> {

}
