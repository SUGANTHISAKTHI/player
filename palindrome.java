package palindrome;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args){
		int r,p=0,n1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		n1=n;
		while(n!=0){
			r=n%10;
			p=p*10+r;
			n=n/10;			
		}
		if(n1==p){
			System.out.println("it is palindrome");
		}else
		System.out.println("not palindrome");
		
	}
}
