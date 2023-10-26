package com.Second.Factory.Method;

public class AllTheProfession {

	public Profession getProfession(String duty) {
		if (duty==null)
		{
			return null;
		}
		if(duty.equalsIgnoreCase("ENGINEER")) {
			return new Enginner ();
		}
		else if(duty.equals("Painter")) {
			return new Painter();
		}
		return null;
	}
}
