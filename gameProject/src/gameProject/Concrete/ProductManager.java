package gameProject.Concrete;

import gameProject.Abstract.ProductService;
import gameProject.Entities.Campaign;
import gameProject.Entities.Player;
import gameProject.Entities.Product;

public class ProductManager implements ProductService {

	Player player;
	Campaign campaign;

	public ProductManager() {
	}

	public ProductManager(Player player, Campaign campaign) {
		super();
		this.player = player;
		this.campaign = campaign;
	}

	@Override
	public void add(Product entity) {
		System.out.println("Oyun eklendi");
	}

	@Override
	public void delete(Product entity) {
		System.out.println("Oyun silindi");
	}

	@Override
	public void update(Product entity) {
		System.out.println("Oyun güncellendi");
	}

	@Override
	public void makeSale(Product product) {
		System.out.println("Satış işlemi başarıyla tamamlandı.");
		System.out.println("Fiyatı " + product.getUnitPrice() + " TL olan " + product.getProductName() + " oyunu "
				+ campaign.getCampaignName() + "le "
				+ (product.getUnitPrice() - (product.getUnitPrice() * campaign.getDiscount() / 100)) + " TL'ye "
				+ player.getFirstName() + " isimli kişiye satıldı.");
		System.out.println("Stokda " + (product.getStock() - 1) + " ürün kaldı");
		System.out.println();
	}

}
