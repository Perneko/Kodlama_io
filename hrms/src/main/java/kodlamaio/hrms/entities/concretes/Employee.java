package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.Data;

@Entity
@Table(name="employees")
@Data
@PrimaryKeyJoinColumn(name="user_id", referencedColumnName="user_id")
public class Employee extends User {
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	public Employee() {}

	public Employee(int userId,String email, String password,String firstName, String lastName) {
		super(userId,email,password);
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
}
