public class LblForLoop{
	public static void main(String[] args){
		//program enters aa for loop
		aa:
		for(int i=0; i<5; i++){
			//program enters bb for loop
			bb:
			for(int j=0; j<5; j++){
				//i=0, j=0, program prints j=0
				System.out.println("Printing j: "+j);
				//exit aa (which exits of cours bb since it is in aa)
				break aa;
			}
			//won't be printed since aa already exited! (break)
			System.out.println("Printing i: "+i);
		}
	}
}
