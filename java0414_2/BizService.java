public class BizService {
    public void bizMethod(int i) throws BizExcpetion{
        System.out.println("start business method");
        
        if(i < 0){
            throw new BizExcpetion("매개변수 i는 0 이상이어야 합니다.");
        }

        System.out.println("end business method");
    }
}
