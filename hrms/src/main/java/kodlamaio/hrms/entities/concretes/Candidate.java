package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidates")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "user_id")
public class Candidate extends User {
	
//	@Id
//  @Column(name="user_id")
//	@JoinColumn(name="userId")
//	private int userId;
	
	@NotBlank
	@NotNull
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank
	@NotNull
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank
	@NotNull
	@Column(name="identification_number")
	private String identificationNumber;
	
	@NotBlank
	@NotNull
	@Column(name="birth_date")
	private LocalDate birthData;
	
//	@OneToOne
//	private User user;
}
