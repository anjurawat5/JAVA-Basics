
public class GarbageCollection_Student {
 int a;
 int b;
	
    public void setData(int c, int d){
    	a=c;
    	b=d;
    }
    
    public void showData(){
    	System.out.println("Value of a " +a);
    	System.out.println("Vlaue of b " +b);

    }
	public static void main(String[] args) {
		GarbageCollection_Student s1 = new GarbageCollection_Student();
		GarbageCollection_Student s2 = new GarbageCollection_Student();
		GarbageCollection_Student s3 = new GarbageCollection_Student();

        s1.setData(2, 4);
        s2.setData(5, 8);
        s1.showData();
        s2.showData();
		//s3;
        s3=s1;
        s3.showData();
        s2=null;
        s3.showData();
        s3=null;
        s3.showData();

	}

}
