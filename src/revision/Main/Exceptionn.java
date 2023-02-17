package revision.Main;

public class Exceptionn  extends  Exception {

    int getNum(int n) throws  Exception{
        if(n == 0){
            throw new Exception("no number chhosed");
        }
        return n;
    }
}
