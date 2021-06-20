package kodlamaio.hrms.core.validation;

public class FakeEmailValidation implements EmailValidataion{

	@Override
	public boolean isConfirmedEmail(String email) {
		return true;
	}

}
