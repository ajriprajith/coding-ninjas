package java_code;

import java.util.*;
public class primenumber {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for( int i = 2; i <=n; i++ ){
        int flag = 0;
        for( int j =2;j<i ;j++){
            if (i%j==0 && j!=1)
                flag=1;
        }
        if (flag== 0){
            System.out.println(i);   
        }
        }    
        scanner.close();
    }
}