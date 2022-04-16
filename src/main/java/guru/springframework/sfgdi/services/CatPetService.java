package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Primary
@Profile("cat")
@Service
public class CatPetService implements PetService {

	@Override
	public String getPetType() {
		return "Cats are best";
	}
}
