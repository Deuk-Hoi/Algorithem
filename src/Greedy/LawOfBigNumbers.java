package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//큰 수의 법칙
public class LawOfBigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> numbers = new ArrayList<>();
        st = null;
        st = new StringTokenizer(br.readLine());


        while(st.hasMoreTokens()){
            numbers.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(numbers);
        System.out.println(numbers);
        int sum = 0;

        /*for(int i = 0; i < m; i++){
            if((i + 1) % k ==0){
                sum += numbers.get(numbers.size() - 2);
            }else{
                sum += numbers.get(numbers.size() - 1);
            }
        }*/

        sum += (numbers.get(numbers.size() - 1) * k) * (m / k);
        sum += numbers.get(numbers.size() - 2) * (m % k);

        System.out.println(sum);

    }
}
