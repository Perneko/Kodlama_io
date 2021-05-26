package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;

@Entity
@Table(name="candidates")
@Data
@PrimaryKeyJoinColumn(name="user_id", referencedColumnName="user_id")
public class Candidate extends User{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identification_number")
	private String identificationNumber;
	
	@Column(name="birth_date")
	private LocalDate birthDate;
	
	private String passwordAgain;
	

	public Candidate() {}
	
	public Candidate(int userId,String email, String password,String firstName, String lastName, String identificationNumber, LocalDate birthDate, String passwordAgain) {
		super(userId,email,password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.identificationNumber = identificationNumber;
		this.birthDate = birthDate;
		this.passwordAgain=passwordAgain;
	}
	
	
	
	
}
