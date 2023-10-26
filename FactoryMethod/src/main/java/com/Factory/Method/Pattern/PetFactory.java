package com.Factory.Method.Pattern;

public class PetFactory {

	public PetInterface getPet(String sound)
	{
		if (sound==null) {
			return null;

		}
		if (sound.equalsIgnoreCase("Dog")) {
			return new Dog();
		}else if (sound.equals("Cat")) {
			return new Cat();
		}
		return null;
	}
}
