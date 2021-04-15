import java.util.Arrays;

public class Divisible{
    public int[] divisible(int[] array, int divisor){
        int num = 0;
        for (int i=0; i<array.length; i++){
            if(array[i] % divisor == 0){
                num++;
            }
        }
        
        int[] ret = new int[num];
        for (int j=0; j<ret.length; j++){
            if(array[j] % divisor == 0){
                for(int k=0; k<ret.length; k++){
                    ret[k] = array[j]; 
                }
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5,9,7,10};
        System.out.println(Arrays.toString(div.divisible(array, 5)));
    }
}