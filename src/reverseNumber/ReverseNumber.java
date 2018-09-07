package reverseNumber;

public class ReverseNumber {

	int reverse(int num){
		int rev_num =0;
		while(num>0){
			int r=num%10;
			rev_num=(rev_num*10+r);
			num=num/10;
			System.out.println(rev_num);

		}
		return rev_num;
		
	}
	

	public static void main(String[] args) {
         ReverseNumber rm=new ReverseNumber();
         rm.reverse(425);
        

	}

}
