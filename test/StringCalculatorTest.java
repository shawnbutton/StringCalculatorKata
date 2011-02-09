import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class StringCalculatorTest {

    @Test
    public void test_that_an_empty_string_returns_zero() {
        assertThat(Calculator.add(""), equalTo(0));
    }

    @Test
    public void test_that_single_number_returns_that_number() {
        assertThat(Calculator.add("1"), equalTo(1));
    }

    @Test
    public void test_that_larger_single_number_returns_that_number() {
        assertThat(Calculator.add("1234"), equalTo(1234));
    }

    @Test
    public void test_that_two_numbers_are_added() {
        assertThat(Calculator.add("1,2"), equalTo(3));
    }

    @Test
    public void test_that_multiple_numbers_are_added() {
        assertThat(Calculator.add("1,2,3,4,5,6"), equalTo(21));
    }


    @Test
    public void test_that_can_add_with_newline_characters_as_delimiter() {
        assertThat(Calculator.add("2,3\n4"), equalTo(9));
    }

    @Test
    public void test_that_can_add_with_arbitrary_delimiter() {
        assertThat(Calculator.add("//;2,3;4"), equalTo(9));
    }
}
