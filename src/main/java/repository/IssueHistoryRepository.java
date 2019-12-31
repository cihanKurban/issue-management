package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long> {

	// Her bir entity'ye karşılık gelen bir repository oluşturuyoruz.
}
