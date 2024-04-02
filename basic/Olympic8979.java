package basic;
import java.util.*;
public class Olympic8979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 국가의 수
        int K = sc.nextInt(); // 등수를 알고 싶은 국가의 번호

        int[][] medals = new int[N][4]; // 각 국가의 번호와 메달 정보를 저장할 배열

        for (int i = 0; i < N; i++) {
            medals[i][0] = sc.nextInt(); // 국가 번호
            medals[i][1] = sc.nextInt(); // 금메달 수
            medals[i][2] = sc.nextInt(); // 은메달 수
            medals[i][3] = sc.nextInt(); // 동메달 수
        }

        // 메달 순으로 정렬
        Arrays.sort(medals, (a, b) -> {
            if (a[1] != b[1]) return b[1] - a[1];
            else if (a[2] != b[2]) return b[2] - a[2];
            else return b[3] - a[3];
        });

        int rank = 1; // 등수
        for (int i = 0; i < N; i++) {
            // 등수를 알고 싶은 국가를 찾았을 때
            if (medals[i][0] == K) {
                System.out.println(rank);
                break;
            }
            // 다음 국가와 메달 수가 다르면 등수를 업데이트
            if (i < N-1 && !(medals[i][1] == medals[i+1][1] && medals[i][2] == medals[i+1][2] && medals[i][3] == medals[i+1][3])) {
                rank = i + 2;
            }
        }
        sc.close();
    }
}
