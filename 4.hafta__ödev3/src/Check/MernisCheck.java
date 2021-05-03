package Check;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Entity.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheck extends BaseCheck{
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();

	@Override
	public Boolean Checkking(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result= client.TCKimlikNoDogrula(
					Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	
	}
	
	
}
