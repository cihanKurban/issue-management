package dto;

import java.util.Date;

import entity.IssueStatus;
import lombok.Data;

@Data
public class IssueDto {

	// Client'a gönderebiliceğim fieldlar.Arayüzde kullanıcının görmesini
	// istediklerim.
	private Long id;
	private String description;
	private String details;
	private Date date;
	private IssueStatus issueStatus;
	private UserDto assignee; // User'dan sadece idnin kulanının görmesini istiyorum, bu yüzden UserDto
	private ProjectDto project; // class'ını ektradan ekledik.

}
