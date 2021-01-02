/*
	Encapsulation
		Is the methodology of binding code and data together into single unit
		to do so, we:
		- declare variables of a class as private
		- provide public setter and getter methods to modify & view variables values

		you can access the variables only through methods, not by doing myObject.attribute

		Data Hiding: the user will have no idea about the inner implementation of class
		Testing is easy
		Reusability: Easy to reuse and easy to change with new requirements
		Increased Flexibility: We can make vars and methods read-only or write-only as per requirement

*/
public class Main{
	public static void main(String[] args) {
		Capsule myCps = new Capsule();
		
		//error: secretKey has private access in Capsule
		//System.out.println(myCps.secretKey);

		System.out.println("We use getter to get the infos");
		myCps.getKeyAndPassword();

		System.out.println("We use setter to set (change) the infos");
		myCps.setKeyAndPassword(4444,"5555");

		System.out.println("Again we print the infos using getter.");
		myCps.getKeyAndPassword();
	}
}

class Capsule{
	private int secretKey = 1234;
	private String secretPass = "4321";

	public void setKeyAndPassword(int sk, String sp){
		this.secretKey = sk;
		this.secretPass = sp;
	}

	public void getKeyAndPassword(){
		System.out.println("The secret key: " + this.secretKey);
		System.out.println("The secret password: " + this.secretPass);
	}
}