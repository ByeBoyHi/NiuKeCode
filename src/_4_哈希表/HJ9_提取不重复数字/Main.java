package _4_哈希表.HJ9_提取不重复数字;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * <输入一串字符串，输出字符串中的不重复数字>
 * Time: 2022/6/6
 * User: HeyBoy
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=line.length()-1; i>=0; i--){
            if(sb.lastIndexOf(line.charAt(i)+"")!=-1){
                sb.append(line.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void test() throws IOException {
        InputStream is = System.in;
        int len = is.available()-1; // 减去最后一个换行
        char[] chs = new char[len];
        while (len-- > 0){
            chs[len] = (char) is.read();  // 反着读的
        }
        System.out.println(new String(chs));
        StringBuilder sb = new StringBuilder();
        for (char ch : chs) {
            if (sb.lastIndexOf(ch + "") != -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
