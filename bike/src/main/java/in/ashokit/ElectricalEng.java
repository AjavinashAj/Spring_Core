package in.ashokit;

public class ElectricalEng implements IEngine{
	

	public ElectricalEng() {
		super();
		System.out.println("Constructor::Electrical");
	}

	public int start() {
		System.out.println("Electrical Engine Start");
		return 1;
	}

}
