import java.util.*;

public class quiz7_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 a : ");
        int a = sc.nextInt();
        System.out.print("정수 b : ");
        int b = sc.nextInt();
        System.out.print("정수 c : ");
        int c = sc.nextInt();

        // int d = min(a,b,c);
        System.out.println("최소값은 " + min(a,b,c));
    }        

    static int min(int a, int b, int c){
        int[] arr = {a,b,c};
        int m = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < m){
                m = arr[i];
            }
        }
        return m;
    }
}