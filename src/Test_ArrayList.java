import java.util.ArrayList;

public class Test_ArrayList {

	
	public static void main(String[] args) {
       ArrayList<String> arLTest= new ArrayList<String>();
       System.out.println(+arLTest.size() );
       //Add
      arLTest.add("A");
      arLTest.add("N");
      arLTest.add("J");
      arLTest.add("U");
      System.out.println(arLTest);
      
      //Remove
      arLTest.remove("N");
      arLTest.remove(0);

      System.out.println(arLTest);
      System.out.println(arLTest.contains("J"));

	}

}
