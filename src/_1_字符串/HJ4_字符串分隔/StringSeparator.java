package _1_字符串.HJ4_字符串分隔;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * <功能描述>
 * Time: 2022/5/31
 * User: HeyBoy
 */
public class StringSeparator {

    public static void main(String[] args) {

    }

    public static void process1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();
        StringBuilder sb = new StringBuilder();
        List<String> ret = new ArrayList<>();
        for (int i=0; i<inputs.length(); i++) {
            sb.append(inputs.charAt(i));
            if (sb.length()==8){
                ret.add(sb.toString());
                sb.setLength(0);
            }
        }
        if (sb.length()!=0){
            int len = sb.length();
            while (len<=8){
                sb.append("0");
                len++;
            }
            ret.add(sb.toString());
        }

        for (String s: ret){
            System.out.println(s);
        }
    }

    public static void process2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();

        if (inputs.length()==0) return;

        int num = 0;
        for (int i=0; i<inputs.length(); i++){
            System.out.print(inputs.charAt(i));
            num++;
            if (num==8){
                System.out.println();
                num=0;
            }
        }
        if (num!=0){
            while (num<8){
                System.out.print("0");
                num++;
            }
        }
    }
}
