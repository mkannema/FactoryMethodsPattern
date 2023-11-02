package DesignabstractPattern;

public class DeveloperAbstractPattern  extends AbstractFactory{

	@Override
	Developer getDeveloper(String typeOfDeveloper) {
		
		if(typeOfDeveloper==null) {
			return null;
		}
		
		else if(typeOfDeveloper.equalsIgnoreCase("Enginne")) {
			return new Enigneer ();
		}else if(typeOfDeveloper.equalsIgnoreCase("I am a trainee")) {
			return new ProgrammerTrinee();
		}
		return null;
	}

}

