public class FlowEx334{
    public static void main(String[] args) {
        Loopl : for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(j==5)
                    break Loopl;
                    break;
                    continue Loopl;
                    continue;
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}