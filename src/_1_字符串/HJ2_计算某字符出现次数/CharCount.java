package _1_字符串.HJ2_计算某字符出现次数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) throws IOException {
        // 1 Scanner
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine().toLowerCase();
//        String c = sc.next().toLowerCase();
//        System.out.println(getCount(str, c));

        // 2 IO
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chs = br.readLine().toLowerCase().toCharArray();
        char[] c = br.readLine().toLowerCase().toCharArray();
        int count = 0;
        for (char cs : chs) {
            count = count + (cs == c[0] ? 1 : 0);
        }
        System.out.println(count);
    }

    public static int getCount(String str, String c) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) + "").equals(c)) {
                ans++;
            }
        }
        return ans;
    }

}
