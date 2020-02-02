package jacoco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class TestJacocoTest {

    TestJacoco testJacoco = new TestJacoco();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testjacoco1() {

        assertThat(testJacoco.jacoco1(0,1), equalTo(null));
    }

    @Test
    public void testjacoco2() {

        assertThat(testJacoco.jacoco1(1,2), equalTo(0));
    }

    @Test
    public void testjacoco3() {

        assertThat(testJacoco.jacoco1(8,2), equalTo(4));
    }
}