package com.Second.Factory.Method;

public class Main {

	public static void main(String[] args) {
      AllTheProfession ap=new AllTheProfession ();
      Profession p=ap.getProfession("Engineer");
      p.study();
	}

}
