public class AccessObj{
    public int p = 3;
    protected int p2 = 4;
    //protected가 붙으면 같은 패키지 내에서만 접근을 허용한다
    //단, 다른 패키지라고 해도 상속받은 경우면 접근을 허용

    private int i = 1;
    //private의 경우 자기 자신에만 접근 가능

    int k = 2;
    //아무것도 없으면 패키지 내에서는 접근 허용

    
}