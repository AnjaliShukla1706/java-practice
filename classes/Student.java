package classes;

public class Student {
	
	int sid;
	String sname;
	char sgrade;
	
	
	void setstudentdata(int id, String name, char grade)
	{
			sid=id;
			sname=name;
			sgrade=grade;
	}
	
	void printstudentdata()
	{
		System.out.println(sid+" "+sname+" "+sgrade);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.sid=101;//using object reference
		s.sname="Anjali";
		s.sgrade='A';
		s.printstudentdata();
		//s.setstudentdata(101, "Anjali", 'A');//using method
		
		//s.printstudentdata();

	}

}
