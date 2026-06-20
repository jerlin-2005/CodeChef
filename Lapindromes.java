import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static String sortString(String input){
        char[] st=input.toCharArray();
        Arrays.sort(st);
        return new String(st);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
		String S=sc.next();
		int n=S.length();
		int z=n/2;
		String a=S.substring(0,z);
		String b = (n % 2 != 0) ? S.substring(z + 1, n) : S.substring(z, n);
		String x=sortString(a);
		String y=sortString(b);
		 if(x.equals(y)){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
	    }
	    
sc.close();
	}
}
