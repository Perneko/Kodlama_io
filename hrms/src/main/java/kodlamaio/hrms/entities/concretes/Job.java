package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="jobs")
@Data
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;
	
	public Job() {}

	public Job(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	}
	
	
}
