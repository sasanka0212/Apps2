//InputStreamReader & BufferedReader in Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class stringexp4 {
    public static void main(String args[]) throws Exception
    {
        System.out.println("enter a number:");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int i = Integer.parseInt(br.readLine());
        System.out.println(i);
    }
}