package player;
import java.util.*;
public class BikePinnumber {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String string1=s.nextLine();
char ch=string1.charAt(0);
String string2="";
int sum=0;
for(int i=0;i<string1.length();i++){
	string2="";
	string2=string2+ch;
	char ch2=string1.charAt(i);
	if(ch==ch2){
	for(int j=i+1;j<string1.length();j++){
		char ch1=string1.charAt(j);
		if(ch==ch1){
			break;
		}
		if(ch!=ch1){
		string2=string2+ch1;
	}
	}
}if(string2.length()>2){
	int len=string2.length();
	int num=0;
	//System.out.println(string2);
   num=num+Character.getNumericValue(string2.charAt(len-1))+Character.getNumericValue(string2.charAt(len-2))+Character.getNumericValue(string2.charAt(len-3))+Character.getNumericValue(string2.charAt(len-4));
	int num1=num;
	while(num1>9){
		sum=0;
		while(num!=0){
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		num1=sum;
		num=sum;
	}
	//System.out.println(num);
	if(num==5||num==7){
System.out.println(string2);
break;
	}
}

}
}
}
