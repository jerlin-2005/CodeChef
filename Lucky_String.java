import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void luckyStr(int n, int k, String[] lstr, String[] str ){
        for(int i = 0; i < n; i++){
            String curr = str[i];
            if (curr.length() >= 47) {
                System.out.println("Good");
                continue;
            }
            int t=0;
            for(int j = 0; j < k; j++){
                if(curr.contains(lstr[j])){
                    t = 1;
                    break; 
                }
            }
            if(t==1) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        String[] lstr = new String[k];
        for(int i = 0; i < k; i++){ 
            lstr[i] = sc.next();
        }
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        luckyStr(n, k, lstr, str);
        sc.close();
    }
}
