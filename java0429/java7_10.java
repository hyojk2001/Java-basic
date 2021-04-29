import java.util.*;

public class java7_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("암산 훈련!!");
        
        do {
        
          //난수 발생
          int x = rand.nextInt(900) + 100;//3자리수
          int y = rand.nextInt(900) + 100;
          int z = rand.nextInt(900) + 100;
          int p = rand.nextInt(4);        //문제 유형
        
          int answer = 0;
          switch (p){
            case 0: answer = x + y + z; break;
            case 1: answer = x + y - z; break;
            case 2: answer = x - y + z; break;
            case 3: answer = x - y - z; break;
        
        }while(true){
          System.out.print(x + ((p<2) ? "+":"-")+y+((p%2==0) ? "+":"-")+z+"=");
          int k = sc.nextInt();
          if (k==answer)
            break;
          System.out.println("틀렸습니다.");
        }
        
        }while(retry());
          } // main end
        
        static boolean retry() {
          Scanner sc = new Scanner(System.in);
          int cond;
          do {
            System.out.print("다시 한 번?<Yes...1/No...0> :");
            cond = sc.nextInt();
          }while (cond != 0 && cond != 1);
          return cond == 1;
        }
        

}
