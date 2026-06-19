import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.isEmpty()) return;
        int n = Integer.parseInt(line.trim());
        int[] globalCounts = new int[26];
        String firstString = br.readLine();
        if (firstString != null) {
            for (char c : firstString.toCharArray()) {
                globalCounts[c - 'a']++;
            }
        for (int i = 1; i < n; i++) {
            String s = br.readLine();
            if (s == null) continue;
            
            int[] currentCounts = new int[26];
            for (char c : s.toCharArray()) {
                currentCounts[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                globalCounts[j] = Math.min(globalCounts[j], currentCounts[j]);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (globalCounts[i] > 0) {
                result.append((char) ('a' + i));
                globalCounts[i]--;
            }
        }
        if (result.length() > 0) {
            System.out.println(result.toString());
        } else {
            System.out.println("no such string");
        }
    }
}
