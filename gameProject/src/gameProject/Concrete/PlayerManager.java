package gameProject.Concrete;

import gameProject.Abstract.PlayerService;
import gameProject.Abstract.UserValidationService;
import gameProject.Entities.Player;

public class PlayerManager implements PlayerService {

	UserValidationService validationService;

	public PlayerManager(UserValidationService validationService) {
		super();
		this.validationService = validationService;
	}

	@Override
	public void add(Player entity) {
		if (validationService.validate(entity)) {
			System.out.println("Kayıt eklendi");
		} else {
			System.out.println("Doğrulanamadı. Kayıt başarısız");
		}
	}

	@Override
	public void delete(Player entity) {
		System.out.println("Kayıt silindi");
	}

	@Override
	public void update(Player entity) {
		System.out.println("Kayıt güncellendi");
	}

}
