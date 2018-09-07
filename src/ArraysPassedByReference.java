
public class ArraysPassedByReference {

	public static void passByReference(String a[]){
		a[0]="CHANGED";
	}
	
	public static void main(String[] args) {
     String [] b = {"Apple", "Mango", "Banana"};
     System.out.print("Before function call " +b[0] +b[1]);

     ArraysPassedByReference.passByReference(b);
     System.out.print('\n');

     System.out.print("After function call " +b[0]);

	}

}
