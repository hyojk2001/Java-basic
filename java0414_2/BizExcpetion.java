public class BizExcpetion extends RuntimeException{
    public BizExcpetion(String msg){
        super(msg);
    }

    public BizExcpetion(Exception ex){
        super(ex);
    }
    
}
