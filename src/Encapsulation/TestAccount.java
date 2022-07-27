package Encapsulation;

public class TestAccount {
	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAcc_no(1234765l);
		ac.setName("Haneef");
		ac.setEmail("Haneef@gmail.com");
		ac.setAmoutn(5000.00f);
		System.out.println(ac.getAcc_no()+" ");
		System.out.println(ac.getName()+" ");
		System.out.println(ac.getEmail()+" ");
		System.out.println(ac.getAmount()+" ");
		
		//System.out.println(ac.amount);-> we can't private data members outside
		//we need to use getter method
		
	}

}
