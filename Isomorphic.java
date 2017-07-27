package player;
import java.util.*;
public class Isomorphic {
	void display(String string1,String string2){
		int flag=0;
		for(int i=0;i<string1.length()-1;i++){
		char ch1=string1.charAt(i);
		char ch2=string2.charAt(i);
		for(int j=i+1;j<string1.length();j++){
			char ch3=string1.charAt(j);
			char ch4=string2.charAt(j);
			if(ch1==ch3){
				if(ch2==ch4){
					flag=1;
					break;
				}
			}
		}
		}
		if(flag==1){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
			
		
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string for equal length");
	String str1=s.next();
	String str2=s.next();
	Isomorphic i=new Isomorphic();
	i.display(str1, str2);

	}

}
