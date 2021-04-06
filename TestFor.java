import java.util.ArrayList;

public class TestFor {
    public static void main(String[] args) {
        /*
        String[] numbers = {"one", "two", "three"};
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        */

        /*
        int[] marks = {90,25,67,45,80};
        for(int i=0; i<marks.length; i++){
            // if(marks[i] >= 60){
            //     System.out.println((i+1)+"번 학생은 합격입니다.");
            // }else{
            //     System.out.println((i+1)+"번 학생은 불합격입니다.");
            // }
            if(marks[i] < 60){
                continue;
            }
            System.out.println((i+1)+"번 학생은 합격입니다.");
        }
        */

        /*
        // 2중 for문
        for(int i=2; i<10; i++){
            for(int j=1; j<10; j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
        */

        /*
        //for each 문
        String[] numbers = {"one", "two", "three"};
        for(String number : numbers){
            System.out.println(number);
        }
        */

        ArrayList<String> numbers = new ArrayList<String>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        for(String number : numbers){
            System.out.println(number);
        }
        //ArrayList 는 add 메소드를 사용 가능하지만, String[]과 같은 경우에는 add 메소드 등을 사용 못한다.
    }
}
