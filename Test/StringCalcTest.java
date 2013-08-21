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
    @Test
    public void shouldReturn0ForEmptyString() {
        StringCalc calc = new StringCalc();
        assertThat(calc.add(""), is(0));
    }
}
