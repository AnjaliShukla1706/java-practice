// this represent class variable

// get and set methods are used to access the private variables through methods

//main method can also be overloaded but only original main method is used to access the other methods/variables

package Encapsulation;

public class account {
	
	private int accno;
	private String name;
	private double amount;
	
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	/*void setaccno(int accno)
	{
		this.accno=accno;
		
	}
	int getaccno()
	{
		return accno;
	}*/
	

}
