package in.ashokit;

public class Car {
    private IEngine eng;
    
	public IEngine getEng() {
		return eng;
	}
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	public Car() {
		System.out.println("Car 0-param constructor");
	}
	public Car(IEngine eng) {
		super();
		this.eng = eng;
		System.out.println("Constructor Injection");
	}
	public void drive()
	{
		int status =eng.start();
		if(status>=1)
		{
			System.out.println("journey started...");
		}
		else
		{
			System.out.println("Engine Trouble..");
		}
	}

}
