package mock;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestMockOtherClass2 {
    @Mock
    private MockClass mockClass;

    @Before
    public void createMocks() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testMockOtherClass1() {
        when(mockClass.mock1(anyInt(),anyInt())).thenReturn(10);

        MockOtherClass mockTwo = new MockOtherClass();
        assertThat(mockTwo.mockThisClass1(1,1,13,mockClass), equalTo(23));
        // System.out.println(mockTwo.mockThisClass1(1, 1, 3, mockClass));
    }
}
