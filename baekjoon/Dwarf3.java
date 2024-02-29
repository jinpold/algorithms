package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dwarf = new int[9];
        int sum = 0; // 9명 키 합산 담는 용도
        for(int i=0; i<dwarf.length;i++){
            dwarf[i] = sc.nextInt();
            sum += dwarf[i];
        }

        int fake1 = 0; // 가짜1
        int fake2 = 0; // 가짜2
        for(int i=0; i<dwarf.length-1;i++){
            for (int j = i+1; j < dwarf.length; j++) {
                if (sum - dwarf[i] - dwarf[j] == 100){
                    fake1 = dwarf[i];
                    fake2 = dwarf[j];
                }
            }
        }
        Arrays.sort(dwarf);
        for(int j =0; j< dwarf.length; j++){
            if(dwarf[j] != fake1 && dwarf[j] !=fake2){
                System.out.println(dwarf[j]+ " ");
            }
        }

    }
}
