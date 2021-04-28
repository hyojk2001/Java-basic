import java.util.*;

public class question06_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학급 수 : ");
        int num = sc.nextInt();
        System.out.println();

        int[] class_sum = new int[num]; //반 합계
        double[] class_avg = new double[num]; //반 평균
        int total_sum = 0;  //전체 합계
        double total_avg = 0;  //전체 평균
        int cnt = 0;    //전체합 / 학생 수 = 전체평균을 구하기 위해 학생 수 구하기

        //입력부 생성
        for (int i=0; i<num; i++){
            System.out.printf("%d반의 학생 수 : ",i+1);
            int student = sc.nextInt();
            int[][] info = new int[num][student];   //반의 개수와 학생수만큼 2중배열
            for(int j=0; j<student; j++){
                System.out.printf("%d반%d번의 점수 : ",i+1,j+1);
                info[i][j] = sc.nextInt();
                class_sum[i] += info[i][j];
            }
            System.out.println();
            cnt += student;     //입력받는 student를 계속 학생수에 더해서 전체학생수 구하기
            class_avg[i] = class_sum[i] / (double)student;
        }

        for(int k=0; k<class_sum.length; k++){      //전체합을 반합의 합으로 구하기
            total_sum += class_sum[k];
        }

        total_avg = total_sum / (double)cnt;                //전체평균은 전체합 / 학생수

        
        
        //출력부 만들기
        System.out.println();

        System.out.println(" 반 | 합계    평균");
        System.out.println("-----+------------");
        for(int i=0; i<num; i++){
            System.out.printf("%d반 | %d    %.1f\n", i+1, class_sum[i], class_avg[i]);
        }
        System.out.println("-----+------------");
        System.out.printf(" 합 | %d    %.1f", total_sum, total_avg);

    }
}
