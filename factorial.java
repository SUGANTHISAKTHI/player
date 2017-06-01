package factorial;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args){
		int fact=1;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("fact"+fact);

}
}
