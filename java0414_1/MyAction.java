public class MyAction extends Action {
    @Override
    public void exec(){
        Action action = new MyAction(){
        @Override
        public void exec(){
            System.out.println("exec");
        }
    };
    action.exec();
    }
}
