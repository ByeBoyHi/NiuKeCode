package _3_基础数学.HJ6_质数因子;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <输出一个数字的所有质因子> <br>
 * Time: 2022/5/31 <br>
 * User: HeyBoy <br>
 */
public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = br.readLine())!=null){
            int number = Integer.parseInt(str);
            /*
                180 90  45  15  5  5
                2   2   3   3   4  5
                我们在进行循环的时候，取得是根号值，因此最后是到不了number的结尾的
             */
            for (int i=2; i<Math.sqrt(number)+1; i++){
                if (number%i==0){
                    System.out.print(i + " ");
                    number = number/i;
                    i--;  // 当前数字是它的一个因子，那么下次循环再次验证这个数字
                }
            }
            System.out.println();
//            f1(number, 2);
        }
    }

    // 递归要用到栈，能循环别递归，容易栈溢出
    public static void f1(int number, int k){
        if (number==1){
            return;
        }
        if (number%k==0){
            System.out.print(k+" ");
            f1(number/k, k);
        }else {
            f1(number, k+1);
        }
    }

}
