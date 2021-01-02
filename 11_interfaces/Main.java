/*

	Imagine: every remote wheter is a TV remote, gaming remote (player), AC remote, all of this
	have a common design pattern (power button, directional buttons ...)

	An interface contains all these specifications and can be used while creating a new remote
	Is what is common between different remotes, even if they are diverse from each other.

	An interface contains variables and methods
	the methods declared inside Interface are by default abstract methods
	from Java 8, we can have default and static methods

	Is used to achieve abstraction, loose coupling (it's like when you're not)
	binding everything into a class. To be a thing it must have the specs provided in the Interface

	In java you can't have Car which extends Vehicle and Locomotive,
	so Interface helps in having multiple inheritance, solving this problem.

	An interface can never be instantiate, No constructors (you don't istantiate an interface)
	Members of interface must be public
	implements keyword is used for inheritance, just like extends for classes
	
	Can't have instance fields.
	Fields that appear must be STATIC and FINAL
	
	soooo....

	class extends class
	class implements interface,(s)
	interface extends interface

	when an interface gets compiled, the compiler automatically adds acces modifiers to the code (public, abstract...)
*/

public class Main{
	public static void main(String[] args) {
		Money credit = new Credit();
		credit.Operation();
	}
}

interface Money {

	abstract void Operation();

}

class Debit implements Money{
	public void Operation(){
		System.out.println("Oh, there you have a debit of 0$");
	}
}

class Credit implements Money{
	public void Operation(){
		System.out.println("Oh, there you have a credit of 0$");
	}
}