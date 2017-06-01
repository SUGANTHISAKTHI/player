package even2;
import java.util.Scanner;
public class even2 {
	public static void main(String[] args){
		int i;
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		if(a%2==0){
			for(i=a;i<=b;i=i+2){
			System.out.println("tha even number"+i);
		}
		}
		if(a%2==1){
			for(i=a;i<=b;i=i+1){
			System.out.println("The even number is"+i);
			}
}
	}
}


