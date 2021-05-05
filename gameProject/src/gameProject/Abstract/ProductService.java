package gameProject.Abstract;

import gameProject.Core.RepositoryBase;
import gameProject.Entities.Product;

public interface ProductService extends RepositoryBase<Product> {
	void makeSale(Product product);
}
