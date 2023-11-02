package DesignabstractPattern;

public class AbstractFactoryProcuder {
	
	public static AbstractFactory getDeveloper(boolean isDeveloper) {
		if(isDeveloper) {
			return  new DeveloperAbstractPattern();
		}else {
			return new AbstractTraineeDeveloper ();
		}
		
		
	}

}
