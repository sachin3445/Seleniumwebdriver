package oppsConcepts;

public class encapsulationMain {

	public static void main(String[] args) {
		
		encapsulation account = new encapsulation();
		account.setAccountno(1236454);
		account.setAmount(15365.00);
		account.setName("Ram");
		
		System.out.println(account.getAccountno());
		System.out.println(account.getAmount());
		System.out.println(account.getName());
	
	}

}
