package Log;

import Entity.Campaign;
import Interfaces.CampainService;

public class CampainManager implements CampainService {

	@Override
	public void Add(Campaign campain) {
		System.out.println("Kampanya Eklendi : " +campain.getCampaingName());
		
	}

	@Override
	public void Delete(Campaign campain) {
		System.out.println("Kampanya Silindi : " +campain.getCampaingName());
		
	}

	@Override
	public void Update(Campaign campain) {
		System.out.println("Kampanya Güncellendi : " +campain.getCampaingName());
		
	}

}
