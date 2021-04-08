public class Algorithm_0407 {
    public static void main(String[] args) {
        int[] dataArray = {4,2,3,5,1};
        int search = 5;

        int result = Lsearch(dataArray, search);

        if(result == -1){
            System.out.println("찾지 못했습니다. ");
        }else{
            System.out.println(result + "번째의 요소가 일치");
        }

    }

    public static int Lsearch(int[] arr, int search){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == search){
                return i;
            }
        }
        return -1;
            
    }

}
