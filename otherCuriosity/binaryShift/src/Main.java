public class Main{
	public static void main(String[] args){

	int a = 1;
		for(int i=0; i<10; i++){
			System.out.println("Loop: "+(i+1));
			a = a << 1; //shift binary number to left
			//1 (1)
			//10 (2) ...shift 1 pos to left
			//100 (3) ... and so on...
			System.out.println(a);
		}

	}
}
