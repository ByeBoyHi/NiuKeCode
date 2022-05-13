package _1_字符串.HJ3_明明的随机数;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class RandomNumber {
    public static void main(String[] args) throws IOException{

    }

    // 正常排序筛选
    public static void test1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){ // 取到数字
            arr[i] = Integer.parseInt(br.readLine());
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        int pre=0;
        System.out.println(arr[pre]);
        for(int i=1; i<N; i++){
            if(arr[i]!=pre){
                System.out.println(arr[i]);
                pre = arr[i];
            }
        }
    }

    // 消费者迭代输出
    public static void test2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i=0; i<N; i++){
            tree.add(Integer.parseInt(br.readLine()));
        }
        // FunctionalInterface
        // 等价于： x->System.out.println(x)
        tree.forEach(System.out::println);
    }
}
