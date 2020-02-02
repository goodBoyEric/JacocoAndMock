package mock;

public class MockOtherClass {
    public Integer mockThisClass1(int a, int b, int c, Mock mock2){
        int x = mock2.mock1(a, b);
        int y = x + c;
        System.out.println("x:" + x);
        System.out.println("y:" + y );
        return y;
    }
}
