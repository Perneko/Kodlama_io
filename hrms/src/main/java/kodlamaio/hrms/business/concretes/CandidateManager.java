package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.validation.EmailValidataion;
import kodlamaio.hrms.core.validation.FakeMernis;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;
	private FakeMernis mernis;
	private EmailValidataion emailValidataion;
	
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao,FakeMernis mernis,EmailValidataion emailValidataion) {
		super();
		this.candidateDao = candidateDao;
		this.mernis=mernis;
		this.emailValidataion=emailValidataion;
	}
	

	@Override
	public DataResult<List<Candidate>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Başarıyla listelendi");
	}


	@Override
	public Result add(Candidate candidate) {
		if(!mernis.isRealPerson(candidate)) {
			return new ErrorResult("Gerçek bir kullanıcı değil");
		}
		if(this.candidateDao.findByIdentificationNumber(candidate.getIdentificationNumber()) != null) {
			return new ErrorResult("Aynı TC kimlik no ya ait kayıt var");
		}
		if(this.candidateDao.findByEmail(candidate.getEmail()) != null) {
			return new ErrorResult("Aynı emaile ait kayıt var");
		}
		this.candidateDao.save(candidate);
		return new SuccessResult("Başarıyla eklendi");
	}

}
