package inhretence2;

public class LogManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("veritaban�na ba�land�");
		}else if(logType==2) {
			System.out.println("Dosyaya logland�");
		}else {
			System.out.println("Email g�nderildi");
		}
		
	}
}
