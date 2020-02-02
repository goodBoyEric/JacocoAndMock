package mock;

public class MockThisClass {

    public Integer mockThisClass1(int a, int b) {
        return a/b;
    }

    public Integer mockThisClass2(int a, int b, int c){
        int x = mockThisClass1(a, b);
        int y = x + c;
//        System.out.println("x:" + x);
//        System.out.println("y:" + y );
        return y;
    }
}
