package constructorDemo;

public class ConstructorDemo {
     int value1;
     int value2;
     
     ConstructorDemo(){
    	 value1=10;
    	 value2=20;   	
    	 
    	 System.out.println("Inside 1st Constructor");
     }
     
     ConstructorDemo(int a, int b){
    	 value1=a;
    	 value2=b;   	
    	 System.out.println("Inside 2nd Constructor");
     }
     
     ConstructorDemo(float a){
    	 value1=(int) a;
    	// value2=(int) b;   	
    	 System.out.println("Inside 3rd Constructor");
     }
     
     void Display(){
    	 System.out.println("Value of value1 = " +value1);
    	 System.out.println("Value of value2 = " +value2);    	 
     }
     
	public static void main(String[] args) {
		ConstructorDemo cdemo = new ConstructorDemo();
		cdemo.Display();
		ConstructorDemo cdemo1 = new ConstructorDemo(100,200);
		cdemo1.Display();
		ConstructorDemo cdemo2 = new ConstructorDemo(1);
		cdemo2.Display();

		
	}

}
