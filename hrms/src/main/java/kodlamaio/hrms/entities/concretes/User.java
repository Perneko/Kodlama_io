package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","Candidate"})
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
	private int userId;
	
	@Email
	@NotBlank
	@NotNull
	@Column(name="email")
	private String email;
	
	@NotBlank
	@NotNull
	@Column(name="password")
	private String password;
	
	@Column(name="verify")
	private boolean verify;
	
	
}
