package tryAndCatch;

public class JavaException {

public static void main(String[] args) {
	
	try{
		int d=1;
		int a=20;
		int fraction=a/d;
		int g[]={1};
		g[20]=100;    
    }
	 catch(Exception e){
	     System.out.println("In Catch block due to exception" +e);

	 }
 /*catch( ){
     System.out.println("In Catch block due to exception" +e);

 }
 System.out.println("End of Main");*/
}

}
