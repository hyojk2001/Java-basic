import java.util.*;

public class question06_19 {
    public static void main(String[] args) {
        // 6-19
        Scanner sc = new Scanner(System.in);

        System.out.println("6명의 국어, 수학 점수를 입력하세요");

        int[][] point = new int[6][2];
        int[] sumStudent = new int[6];
        int[] sumSubject = new int[2];

        for (int i = 0; i < 6; i++){
            System.out.print(i+1+"번 국어:");
            point[i][0] = sc.nextInt();
            System.out.print("    수학:");
            point[i][1] = sc.nextInt();

            sumStudent[i] = point[i][0] + point[i][1];//학생점수
            sumSubject[0] += point[i][0];   //국어점수합
            sumSubject[1] += point[i][1];   //수학점수합

        }

            System.out.println("No.\t국어\t수학\t평균");
            for (int i = 0; i < 6; i++) {
            System.out.print((i+1)+"\t"+point[i][0]+"\t\t"+point[i][1]+"\t\t"+(double)sumStudent[i]/2);
            System.out.println();
            }
            System.out.println("평균 "+(double)sumSubject[0]/6+"\t"+(double)sumSubject[1]/6);

    }
}
