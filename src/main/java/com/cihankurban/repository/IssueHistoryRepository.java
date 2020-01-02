package com.cihankurban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cihankurban.entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {

	// Her bir entity'ye karşılık gelen bir repository oluşturuyoruz.
}
