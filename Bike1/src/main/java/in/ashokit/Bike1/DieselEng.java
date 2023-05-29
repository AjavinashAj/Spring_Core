package in.ashokit.Bike1;

public class DieselEng implements IEngine{
	

	public DieselEng() {
		super();
		System.out.println("Constructor::Diesel");
	}

	public int start() {
		System.out.println("Diesel Engine Start");
		return 1;
	}

}
