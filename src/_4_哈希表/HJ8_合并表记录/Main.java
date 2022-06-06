package _4_哈希表.HJ8_合并表记录;
import java.util.*;
import java.io.*;

/**
 * <功能描述>
 * Time: 2022/6/6
 * User: HeyBoy
 */
public class Main{
    public static void main(String[] args) throws Exception{
        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        st.nextToken();      // 分隔符
        int n = (int) st.nval;   // 强转

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            st.nextToken();
            int key = (int) st.nval;
            st.nextToken();
            int value = (int) st.nval;
            map.put(key, map.getOrDefault(key, 0)+value);
        }

        StringBuilder sb = new StringBuilder();

        map.forEach((key, value)->{
            sb.append(key).append(" ").append(value).append("\n");
        });

        System.out.println(sb);
    }

    public void test1() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
        String line = "";
        while((line = br.readLine())!=null){
            String[] kv = line.split(" ");
            map.put(Integer.parseInt(kv[0]), map.getOrDefault(Integer.parseInt(kv[0]), 0)+Integer.parseInt(kv[1]));
        }
        map.forEach((key, value)->{
            System.out.println(key+" "+value);
        });
    }
}
