
public class Array {

	
	public static void main(String[] args) {
		int array[]= new int[7];
		for (int count=0;count<7;count++){
			array[count]=count+1;
		}
		for (int count=0;count<7;count++){
			System.out.print("array["+count+"] = " +array[count]);
			System.out.print('\n');

		}
		System.out.print("array length = " +array.length);


	}

}
