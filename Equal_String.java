import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String S=sc.next();
	    String T=sc.next();
	    int m=sc.nextInt();
	    if(S.length()!=T.length()){
	        System.out.println("Two Strings should be of Equal Length:");
	    }
	    else{
	        int len=S.length();
	        int e=m% len;
	        if(e!=0){
	            String l=S.substring(len-e);
	            String r=S.substring(0,len-e);
	        }
	        else{
	            r=S;
	        }
	            System.out.println(if((l+r)==T):"Yes"?"No");
	    }
		System.out.println("Hello World");
	}
}
