import java.util.Scanner;
class addnumber {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), i = 1, sum=0;
        while(i<=n){
            int j=1;
            while(j<=i){
                if(j==1){
                    System.out.print(j);   
                }
                else{
                    System.out.print("+"+j);
                }
                j++;
        }
        System.out.print("="+ sum);
        System.out.println();
        i++;
        sum = sum + i;
    }
}
}

