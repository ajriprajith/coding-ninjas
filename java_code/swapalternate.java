package java_code;

import java.util.Scanner;
public class swapalternate {
    public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            for(int i=0;i<arr.length;i+=2){
                if(i==arr.length-1)
                    continue;
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t -= 1;
        }
        sr.close();
    }
}
