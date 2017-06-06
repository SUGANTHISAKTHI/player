package prime2;

import java.util.Scanner;

public class prime2 {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int flag=0,i,j;
	for(i=a;i<=b;i++){
		//System.out.print(a);
		for(j=2;j<i;j++){
			if(i%j==0){
				flag=1;
				break;
			}else
				flag=0;
		}
		if(flag==0){
			System.out.print(i);
		}
	}
}
}
