package gameProject;

import gameProject.Abstract.ProductService;
import gameProject.Concrete.CampaignManager;
import gameProject.Concrete.PlayerManager;
import gameProject.Concrete.ProductManager;
import gameProject.Concrete.UserValidationManager;
import gameProject.Entities.Campaign;
import gameProject.Entities.Player;
import gameProject.Entities.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("===================================== Kayıt işlemleri =====================================");

		Player player1 = new Player(1, 12345, "Engin", "Demiroğ", 1985);
		Player player2 = new Player(2, 123456, "Kamran", "Hashimov", 1995);
		Player[] players = new Player[] { player1, player2 };

		PlayerManager playerManager = new PlayerManager(new UserValidationManager());
		playerManager.add(player1);
		playerManager.add(player2);
		
		System.out.println();
		System.out.println("===================================== Kampanya işlemleri =====================================");
		
		Campaign campaign = new Campaign(1, "%50 indirim", "Kampanya 2021 Ekim sonunda sona erecek", 50);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		System.out.println();
		System.out.println("===================================== Oyun işlemleri =====================================");
		
		Product product = new Product(1, "Forza Horizon 4", 600, 50);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println();
		System.out.println("===================================== Satış işlemleri =====================================");
		
		for(Player player : players) {
			ProductService productService = new ProductManager(player, campaign);
			productService.makeSale(product);
		}
	}

}
