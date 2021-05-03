package game.Concrete;

import game.Abstract.CampaignService;
import game.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Ekendi :"+campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya Güncellendi :"+campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi :"+campaign.getName());
		
	}

}
