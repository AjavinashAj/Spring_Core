package in.ashokit.Bike1;

public class PetrolEng implements IEngine {
	

	public PetrolEng() {
		super();
		System.out.println("Constructor::Petrol");
	}

	public int start() {
		System.out.println("Petrol Engine start...");
		return 1;
	}

}
