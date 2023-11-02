package DesignabstractPattern;

public class AbstractTraineeDeveloper  extends AbstractFactory{

	@Override
	     public Developer getDeveloperString typeOfDeveloper) {
		
		
		
		if(typeofDeveloper==null) {
		return null;
		
		}
		else if(typeofDeveloper.equalsIgnoreCase("Developer")) {
			return new Developers();
			
		}else if (typeofDeveloper.equalsIgnoreCase("\"I am a Programmer Trinee\"")) {
			
		
		return new TraineeAnalyst();
	}
		
		return null;
	}

	
	}

