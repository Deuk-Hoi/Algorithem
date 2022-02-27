package Greedy;

import java.io.*;
import java.util.Arrays;
import java.util.List;

//거스름돈
public class Charge {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));

        int cost = Integer.parseInt(bufferedReader.readLine());

        List<Integer> coins = Arrays.asList(500, 100, 50, 10);

        int count = 0;

        for(int i = 0; i < coins.size(); i++){
            count += (cost / coins.get(i));
            cost %= coins.get(i);

        }

        System.out.println(count);
    }
}
