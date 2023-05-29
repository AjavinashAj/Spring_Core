package in.ashokit;

public class Car {
	IEngine eng;

	public Car() {
		super();
		System.out.println("Constructor::Car");
	}
	public Car(IEngine eng)
	{  
		super();
		this.eng=eng;
	}
	public void setEng(IEngine eng)
	{
		this.eng=eng;
	}
	public void drive()
	{
		int start=eng.start();
		if(start>=1)
		{
			System.out.println("Car driving");
		}
		else
		{
			System.out.println("fail to start..");
		}
	}
	

}
