
public class Sample_String {

	
	public static void main(String[] args) {
    String str1 = "Anju";
    String str2 = "Rawat";
    //concat
    String str3 = str1.concat(str2);
    System.out.println(str3);
    ;
    //length
    int str4 = str1.length();
    System.out.println(str4);
    
    //indexing
    System.out.println("Charachter at 3 " +str1.charAt(2));
    
    //String contain
     System.out.println("Contains sequence 'nj' " +str1.contains("nj"));
     
     //endwith
     System.out.println("EndsWith character 'u' " +str1.endsWith("u"));
     
     //replace with
     
     System.out.println("Replace 'Rawat' with 'Singh' " +str2.replace("Rawat", "Singh"));
     
     //To uppercase
     System.out.println("Convert 'Anju'to upper case : " +str1.toUpperCase());
     //To Lowercase
     System.out.println("Convert 'Anju'to lower case : " +str1.toLowerCase());
 
	}

}
