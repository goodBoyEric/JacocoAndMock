package mock;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;
import static org.mockito.Mockito.*;


public class TestMockThisClass {

    @Test
    public void testmockThisClass2(){
        MockThisClass thisClass = mock(MockThisClass.class);
        when(thisClass.mockThisClass2(anyInt(),anyInt(),anyInt())).thenCallRealMethod();

        when(thisClass.mockThisClass1(anyInt(),anyInt())).thenReturn(10);
        assertThat(thisClass.mockThisClass2(1,2,3),equalTo(13));

    }
}
