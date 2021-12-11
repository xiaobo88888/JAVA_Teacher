package Chapter_9;


import java.io.PrintStream;
import java.util.Scanner;

public class file2 {
    public static void main(String[] args) {
        System.out.println("请输入十个整数");

        Scanner in = new Scanner(System.in);

        int[] num = new int[10];
        for(int i = 0; i < 10; i++){
            num[i] = in.nextInt();
        }
        
        for(int i = 0; i < num.length; i++){
            int min = i;
            for(int j = i + 1; j < num.length; j++){
                if(num[min] > num[j]){
                    min = j;
                }
            }
            if(min != i){
                int change = num[i];
                num[i] = num[min];
                num[min] = change;
            }
        }

        PrintStream ps = System.out;
        for(int i = 0; i < num.length; i++){
            ps.println(num[i]);
        }
    }
    
}
