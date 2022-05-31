package _2_数组.HJ3_明明的随机数;

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

    // 用StringBuilder拼接换行，最后删除最后一个换行，就可以直接输出了
    public static void test3() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();  // 把第一个数字的个数读掉
        boolean[] isOk = new boolean[1001];
        StringBuilder sb = new StringBuilder();
        String str;
        while((str=br.readLine())!=null){  // 读取所有数字，使他为true
            isOk[Integer.parseInt(str)]=true;
        }
        for(int i=0; i<1001; i++){
            if(isOk[i]){
                sb.append(i).append("\n");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
