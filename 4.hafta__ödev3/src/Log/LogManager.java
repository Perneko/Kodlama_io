package Log;
import Check.BaseCheck;
import Entity.Gamer;
import Interfaces.LogService;

public class LogManager implements LogService {
	private BaseCheck check;
	
	
	public LogManager(BaseCheck check) {
		this.check = check;
	}

	@Override
	public void Add(Gamer gamer) {
		
		if(check.Checkking(gamer)) {
			System.out.println("Sisteme yüklendi :" + gamer.getFirstName());
			
		}
		else {
			System.out.println("geçersiz bilgiler");
		}
		
		
	}

	@Override
	public void Delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}
	
}
