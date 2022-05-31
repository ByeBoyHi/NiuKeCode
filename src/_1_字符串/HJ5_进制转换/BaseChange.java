package _1_字符串.HJ5_进制转换;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <转为16进制并输出> <br>
 * Time: 2022/5/31 <br>
 * User: HeyBoy <br>
 */
public class BaseChange {

    private static final int[] DIGIT = {
            10,11,12,13,14,15,
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();
        System.out.println(OneToOther(inputs));
    }

    public static String OneToOther(String old){
        if (old==null || old.equals("")) return "";
        int num = 0;
        int cur = 0;
        int len = old.length();
        for (int i=len-1; i>1; i--){
            char c = old.charAt(i);
            if (c >='0' && c <='9'){
                num+=(c-'0')*Math.pow(16,cur);
            }else if (c>='A' && c<='F'){
                num+=DIGIT[c-'A']*Math.pow(16,cur);
            }
            cur++;
        }
        return num+"";
    }
}
