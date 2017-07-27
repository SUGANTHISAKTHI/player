package player;
import java.util.*;
public class CalculateMins {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the two times");
	double time1=s.nextDouble();
	double time2=s.nextDouble();
	double n=Math.abs(time1-time2);
	System.out.println(String.format("%.2f", n));
	
	
}
}
