package _1_字符串.HJ1_字符串最后一个单词的长度;

import java.util.Scanner;
// ACM模式
public class LastWordLen {
    public static void main(String[] args) {
        // 1. 直接split
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] splits = str.split(" ");
//        System.out.println(splits[splits.length-1].length());

        // 2. indexOf
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.length()-1-str.lastIndexOf(' '));

    }
}
