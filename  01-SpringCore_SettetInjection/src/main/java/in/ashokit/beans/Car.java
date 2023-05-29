package in.ashokit.beans;

public class Car {
	private IEngine eng;
	
	
	public Car() {
		System.out.println("0-para constructor");
	}
	public void setEng(IEngine eng)
	{
		System.out.println("SetEng() method call");
		this.eng=eng;
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
