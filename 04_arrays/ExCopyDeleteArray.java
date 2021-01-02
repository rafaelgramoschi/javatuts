public class ExCopyDeleteArray {
	public static void main(String[] args){
		System.out.println("Copiare valori da un array ad un altro.\nEliminare un valore all'indice 3.(Shift degli indici)\n\n");
		char[] source = {'a','b','c','d','e','f'};
		char[] dest = new char[6];

		//copy elements from source to dest
		//(source array, start index, dest array, start index, how many elements to copy)
		System.arraycopy(source, 0, dest, 1, 5);
		System.out.println(new String(dest)); //print array

		//you can't delete something directly from
		//an array in Java. So we shift indexes.
		int del = 3; //let's delete index n. 3
		for(int i=0; i<source.length; i++){
			if(i==del){
				for(int j = i+1; i<source.length-1; j++){
					source[i]=source[j];
					i++;
				}
				System.out.println(source);
			}
		}
	}
}
