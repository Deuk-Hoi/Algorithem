package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//숫자 카드 게임
public class NumberCardGame {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int [][] matrix = new int[n][m];

        List<Integer> chooseNum = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = s.nextInt();
            }
            OptionalInt min =  Arrays.stream(matrix[i]).min();
            if(min.isPresent()){
                chooseNum.add(min.getAsInt());
            }

        }
        Collections.sort(chooseNum);
        System.out.println(chooseNum);
        System.out.println(chooseNum.get(chooseNum.size() -1));


    }
}
