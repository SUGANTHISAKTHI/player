package reversee;
import java.util.Scanner;
public class reversee {
	public static void main(String[] args){
		int r=0,temp=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		while(n>0){
			r=n%10;
			temp=temp*10+r;
			n=n/10;
		}
		System.out.println("The reverse integer is"+temp);
	}

}
