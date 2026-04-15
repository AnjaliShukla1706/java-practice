package inheritenceprograms;


class Teacher
{
	int marks()
	{
		return 100;
	}
}
class topper extends Teacher
{
	int marks()
	{
		return 99;
	}
}
class fusaddi extends Teacher
{
	int marks()
	{
	return 30;
	}
}

public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fusaddi fs=new fusaddi();
		System.out.println(fs.marks());

	}

}
