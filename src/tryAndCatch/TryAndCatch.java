package tryAndCatch;
public class TryAndCatch {

	
	public static void main(String[] args) {
int d=0;
int a=20;

     try{
        int fraction=a/d;
        System.out.println("This line of code never excuted");
        }
     catch(ArithmeticException e){
         System.out.println("In Catch block due to exception" +e);

     }
     System.out.println("End of Main");
	}

}
