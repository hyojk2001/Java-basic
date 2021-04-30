import java.util.*;

public class quiz10_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x값:");
        int a = sc.nextInt();
        System.out.print("y값:");
        int b = sc.nextInt();
        System.out.print("z값:");
        int c = sc.nextInt();
        System.out.println("x,y의 최소값 : " + min(a,b));
        System.out.println("x,y,z의 최소값 : " + min(a,b,c));
        System.out.println("x,y의 최대값 : " + max(a,b));
        System.out.println("x,y,z의 최대값 : " + max(a,b,c));
    }
    
    public static int min(int a, int b){
        return a < b ? a : b;
    }
    public static int max(int a, int b){
        return a < b ? b : a;
    }
    public static int min(int a, int b, int c){
        int[] arr = {a,b,c};
        int min = a;
        for (int i=0; i<3; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static int max(int a, int b, int c){
        int[] arr = {a,b,c};
        int max = a;
        for (int i=0; i<3; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int[] minIndexArr(int[] a) {
        int min = min(a);
        int count = 0;
        for(int i = 0 ; i < a.length ; i++){
          if(a[i] = min)
          count++;
        }
        int[] c = new int[count--];
        for (int i = a.length-1; count >=0;i--){
          if (a[i]== min){
            c[count--]= i;
          }
        }
        return c;
      }
    
}
