package in.ashokit;

public class Student {
	private int sid;
	private String sname;
	private Double marks;
	
	
   public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

public Student() {
		super();
		System.out.println("Constructor::Student");
	}

public String rank()
   {
	   String st;
	   if(marks>=80)
	   {
		   st="Grade A";
	   }
	   else if(marks>60 && marks<80)
	   {
		   st="Grade B";
	   }
	   else if(marks>45 && marks<50)
	   {
		   st ="Grade C";
	   }
	   else if(marks>35 && marks<45)
	   {
		   st="Grade D";
	   }
	   else
	   {
		   st="Grade E";
	   }
	   return st;
   }
}
