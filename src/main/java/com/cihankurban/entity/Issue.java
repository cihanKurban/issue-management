package com.cihankurban.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Entity oluşturmak istiyorsak kesinlikle Entity anotasyonunu eklememiz
		// gerekli.
@Table(name = "issue")
@Data // field'larımızın getter setter metodlarını otomatik oluşturur.
@NoArgsConstructor
@AllArgsConstructor
public class Issue extends BaseEntity {

	@Id // Benzersiz id olmasını sağlar
	@GeneratedValue(strategy = GenerationType.AUTO) // Veritabanında id numarsının otomatik artmasını sağlar
	private Long id;

	@Column(name = "description", length = 1000)
	private String description;

	@Column(name = "details", length = 4000)
	private String details;

	@Column(name = "date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@Column(name = "issue_status")
	@Enumerated(EnumType.STRING)
	private IssueStatus issueStatus;
	// Enum type'ı string yaptık veritabında id olarak değilde string olarak tutmak
	// daha sağlıklı, ilerleyen zamanlarda ortadan bir yere değer eklendiğinde,
	// tablodaki verilerin index değerleri değişir.

	@JoinColumn(name = "assignee_user_id")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private User assignee;

	@JoinColumn(name = "project_id")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Project project;
}
