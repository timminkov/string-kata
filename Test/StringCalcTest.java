import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Thoughtworker
 * Date: 8/21/13
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalcTest {
    private StringCalc calc;

    @Before
    public void setUp() {
        calc = new StringCalc();
    }

    @Test
    public void shouldReturn0ForEmptyString() {
        assertThat(calc.add(""), is(0));
    }

    @Test
    public void shouldReturn1For1() {
        assertThat(calc.add("1"), is(1));
    }

    @Test
    public void shouldReturn3For1And2() {
        assertThat(calc.add("1,2"), is(3));
    }

    @Test
    public void shouldReturn5ForOneTwoAndTwo() {
        assertThat(calc.add("1,2,2"), is(5));
    }

    @Test
    public void shouldReturn6For123AndNewline() {
        assertThat(calc.add("1\n2,3"), is(6));
    }

    @Test
    public void changeDelimiterToPurple() {
        assertThat(calc.add("[Purple]\n1Purple2Purple"), is(3));
    }

}
