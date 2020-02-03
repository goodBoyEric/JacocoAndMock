package mock;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


public class TestMockOtherClass {

    @Test
    public void testMockTwo1() {
        MockClass mockClass= mock(MockClass.class);
        when(mockClass.mock1(anyInt(), anyInt())).thenReturn(111);

        MockOtherClass mockTwo = new MockOtherClass();
        assertThat(mockTwo.mockThisClass1(1, 1, 3, mockClass), equalTo(114));
    }
}