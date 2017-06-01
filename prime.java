package prime;
import java.util.Scanner;
public class prime {
	public static void main(String[] args){
	int flag=0,i;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(i=2;i<=n/2;i++){
		if(n%i==0){
			flag=1;
			break;
		}
	}
	if(flag==0){
		System.out.println("prime number");
	}
	System.out.println("not an prime number");
	
	}
}
