package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "user_id")
public class Employer extends User {
	
	@NotBlank
	@NotNull
	@Column(name="company_name")
	private String companyName;
	
	@NotBlank
	@NotNull
	@Column(name="web_site_name")
	private String webSiteName;
	
	@NotBlank
	@NotNull
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="user_confirm")
	private boolean userConfirm;
}
