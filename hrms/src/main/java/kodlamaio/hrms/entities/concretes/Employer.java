package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;

@Entity
@Table(name="employers")
@Data
@PrimaryKeyJoinColumn(name="user_id", referencedColumnName="user_id")
public class Employer extends User {
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_site_name")
	private String webSiteName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	

	public Employer() {}
	
	public Employer(int userId,String email, String password,String companyName, String webSiteName, String phoneNumber) {
		super(userId,email,password);
		this.companyName = companyName;
		this.webSiteName = webSiteName;
		this.phoneNumber = phoneNumber;
		
	}
	
	
	
}
