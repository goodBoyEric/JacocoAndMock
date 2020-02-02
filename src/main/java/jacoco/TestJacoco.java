package jacoco;

public class TestJacoco {
    public Integer jacoco1(int a, int b){
        if(a==0){
            return null;
        }else if(a==b){
            return 1;
        }else if(a<b){
            return 0;
        }else {
            return a/b;
        }
    }
}
