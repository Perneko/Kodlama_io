package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Employer extends User {
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_site_name")
	private String webSiteName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	
	@Column(name="user_confirm")
	private boolean userConfirm;

	
	
	
	
	
}
