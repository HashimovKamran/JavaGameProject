package gameProject.Concrete;

import gameProject.Abstract.UserValidationService;
import gameProject.Entities.Player;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Player player) {
		if (player.getFirstName()=="Engin" && player.getLastName()=="Demiroğ" && player.getBirthYear()==1985 && player.getIdentityNumber()==12345)
        {
            return true;
        }
        else if (player.getFirstName()=="Kamran" && player.getLastName()=="Hashimov" && player.getBirthYear()==1995 && player.getIdentityNumber()==123456)
        {
            return true;
        }
        else
        {
            return false;
        }
	}
	
}
