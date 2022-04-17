package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"default", "dog"})
//@Service
public class DogPetService implements PetService {

	@Override
	public String getPetType() {
		return "Dogs are best";
	}
}
