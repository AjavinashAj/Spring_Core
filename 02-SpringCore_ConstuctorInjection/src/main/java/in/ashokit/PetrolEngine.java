package in.ashokit;

public class PetrolEngine implements IEngine {
   
	public PetrolEngine() {
		System.out.println("Petrol Constructor");
	}

	public int start() {
		System.out.println("Petrol engine started");
		return 1;
	}
	

}
