abstract class Mobile {
	Mobile(){
		System.out.println("Mobile is the base class.");
	}

	abstract void run();

	void dialNumber(){
		System.out.println("Number is dialing from mobile.");
	}
}

class Nokia extends Mobile {
	void run(){
		System.out.println("Nokia is the derived class.");
	}
}

public class AbstDemo {

	public static void main(String[] args) {
		Mobile tel = new Nokia();
		tel.run();
		tel.dialNumber();
	}

}