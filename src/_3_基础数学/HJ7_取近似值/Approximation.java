package _3_基础数学.HJ7_取近似值;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * <取近似值> <br>
 * Time: 2022/5/31 <br>
 * User: HeyBoy <br>
 */
public class Approximation {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strs = line.split("\\.");
        if(strs.length==1){
            System.out.println(strs[0]);
            return;
        }
        String point = strs[1];
        if(point.charAt(0)<'5'){  // 不进位
            System.out.println(strs[0]);
        }else{  // 进位
            System.out.println(Integer.parseInt(strs[0])+1+"");
        }
    }
}
