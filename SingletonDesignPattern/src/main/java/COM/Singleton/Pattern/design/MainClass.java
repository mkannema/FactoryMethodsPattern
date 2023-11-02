package COM.Singleton.Pattern.design;

import factory.pattern.Teacher;

public class MainClass {
	
	public static void main (String args[]) {
		SingletonClass singletonObject=SingletonClass.getInstance();
		singletonObject.simpleMethod();
		
		SingletonClass singletonObject2=SingletonClass.getInstance();
		singletonObject.simpleMethod();
		
		   Teacher teacher=new Teacher();
		   System.out.println(teacher);
		  
		  Teacher tech2=new Teacher();
		  
		  System.out.println(tech2);
		
	}

}
