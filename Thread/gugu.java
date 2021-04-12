public class gugu {
    public static void main(String[] args) {
        for(int i=2; i<10; i++){
            for(int j=1; j<10; j++){
                int k = i*j;
                String m = k + ",";
                if(j == 9){
                    m = k + "";
                }
                System.out.print(m);
            }
            System.out.println();
        }
    }
    
}
