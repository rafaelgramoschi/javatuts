public class Main {
	public static void main(String[] args){
		Main newObj = new Main();
		newObj.methodSum(3,5);
	}

	//public, visible everywhere in the app

	//int meaning it will return int type (return int)
	//if it was void, there was no return at the end

	//methods name are camel case starting with lowercase letter
	//(int a,int b) this method accepts two arguments
	public int methodSum(int a, int b){
		System.out.println( "Sum is: "+(a+b) );
		//return returns something to the caller of the method
		//and exits the method
		return a+b;
	}
}
