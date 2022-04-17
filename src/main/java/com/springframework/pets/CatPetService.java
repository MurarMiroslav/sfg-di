package com.springframework.pets;

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
