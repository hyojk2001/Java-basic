public class TestSwitch {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";

        switch(month){
            case 12:
            case 1:
            case 2: monthString = "겨울";
                break;
            case 3:
            case 4:
            case 5: monthString = "봄";
                break;
            case 6:
            case 7:
            case 8: monthString = "여름";
                break;
            case 9 :
            case 10:
            case 11: monthString = "가을";
                break;
        }
        System.out.println(monthString);
    }    
}
