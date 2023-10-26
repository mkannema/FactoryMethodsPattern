package com.Factory.Method.Pattern;

public class Main {
	
	
public static void main(String[] args) {
	PetFactory pt=new PetFactory ();
	
	PetInterface doc = pt.getPet("Cat");
    doc.Speak();
}

}
