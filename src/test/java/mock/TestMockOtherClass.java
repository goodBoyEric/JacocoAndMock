package mock;

import org.junit.Test;
import static org.mockito.Mockito.*;


public class TestMockOtherClass {

    @Test
    public void testMockTwo1() {
        Mock mockClass= mock(Mock.class);
        when(mockClass.mock1(anyInt(), anyInt())).thenReturn(111);

        MockOtherClass mockTwo = new MockOtherClass();
        System.out.println(mockTwo.mockThisClass1(1, 1, 3, mockClass));
    }
}