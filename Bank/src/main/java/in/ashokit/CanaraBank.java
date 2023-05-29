package in.ashokit;

public class CanaraBank implements RBI{
     RBI rbi;
	public CanaraBank(RBI rbi) {
		super();
		this.rbi = rbi;
	}

	public CanaraBank() {
		super();
		System.out.println("Constructor::CanaraBank");
	}

	public void cash() {
		System.out.println("Canara Bank cash");
		
	}

	public int CashSend() {
		int rs=rbi.CashSend();
		return rs;
	}

}
