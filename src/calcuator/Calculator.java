package calcuator;

//import java.util.Scanner;

public class Calculator {

	int a;
	int b;
	int c;
	void Display(){
		System.out.println("Value is");
	}
	
	void sum(){
		System.out.println("Enter value for a");
		System.out.println("Enter value for a");

      //  a=Scan.Nextfloat();
        c=a+b;
		System.out.println("Value is c = " +c);
	}
	public static void main(String[] args) {
      Calculator cal= new Calculator();
      cal.sum();
	}

}
