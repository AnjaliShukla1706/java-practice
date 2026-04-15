package Encapsulation;

public class accountmain {

	public static void main(String[] args) {
		account ac=new account();
		/*ac.setaccno(25001);
		System.out.println(ac.getaccno());*/
		
		ac.setAccno(239163);
		ac.setName("Anjali");
		ac.setAmount(90000000);
		System.out.println(ac.getAccno());
		System.out.println(ac.getName());
		System.out.println(ac.getAmount());
		
				

	}

}
