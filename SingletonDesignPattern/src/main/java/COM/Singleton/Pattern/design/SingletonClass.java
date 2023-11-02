package COM.Singleton.Pattern.design;

public class SingletonClass {
	
	private static SingletonClass singletonIntance =new SingletonClass();
	
	private SingletonClass() {
		
	}
	public static SingletonClass getInstance() {
		return singletonIntance;
	}
  public void simpleMethod() {
	  System.out.println("Hash code of the single ton object " +singletonIntance);
  }
}
