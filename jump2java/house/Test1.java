package jump2java.house;

public class Test1 {
    public void sayNick(String nick){
        if("fool".equals(nick)){
            return;     //nick이 "fool" 이면 아무것도 일어나지 않는다
        }
        System.out.println("당신의 별명은 " + nick + " 입니다.");
    }
    
    public static void main(String[] args) {
        Test1 test = new Test1();
        test.sayNick("fool");
        test.sayNick("genious");
    }
    
}
