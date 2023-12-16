import java.util.Scanner;

public class arrangearray {
     public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for(int i=1 ; i<=n;i++){
                int x = n;
                if(i%2!=0){
                    arr[i-1]=i;
                }
                else {
                    arr[x-1]=i;
                    x--;
                 }
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
