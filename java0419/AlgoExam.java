public class AlgoExam{
    public int euclid(int x, int y){
        int t = 0;
        if (x > y){
            t = x % y;
        }else if(x < y){
            t = y % x;
        }

        while(t != 0){
            x = y;
            y = t;
        }

        return y;
    }

    public static void main(String[] args) {
        AlgoExam c = new AlgoExam();
        int d = c.euclid(12, 8);
        int e = c.euclid(221, 143);
        System.out.println("euclid(12,8) : " + d);
        System.out.printf("euclid(221,143) : %d",e);
    }
}