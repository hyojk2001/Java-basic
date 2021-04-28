import java.util.*;

public class question06_18 {
    public static void main(String[] args) {
        
        int[][] a = new int[4][3];
        int[][] b = new int[3][4];
        int[][] c = new int[4][4];

        Scanner sc = new Scanner(System.in);
        // System.out.println(a[1].length);
        System.out.println("행렬 a의 요소를 입력하세요");
        for (int i=0; i<a.length; i++){         //행길이만큼 반복
            for(int j=0; j<a[i].length; j++){   //열길이만큼 반복
                System.out.printf("a[%d][%d] : ",i,j);
                int num = sc.nextInt();
                a[i][j] = num;    
            }
        }


        System.out.println("행렬 b의 요소를 입력하세요");
        for (int i=0; i<b.length; i++){         //행길이만큼 반복
            for(int j=0; j<b[i].length; j++){   //열길이만큼 반복
                System.out.printf("b[%d][%d] : ",i,j);
                int num2 = sc.nextInt();
                b[i][j] = num2;    
            }
        }

        
        for(int m=0; m<c.length; m++){
            for (int n=0; n<c[m].length; n++){
                c[m][n] = 0;
                for(int p=0; p<3; p++){
                    c[m][n] += a[m][p] * b[p][n];
                }
            }
        }

        for (int i=0; i<4; i++){
            System.out.printf(Arrays.toString(c[i]));
            System.out.println();
        }

    }
}
