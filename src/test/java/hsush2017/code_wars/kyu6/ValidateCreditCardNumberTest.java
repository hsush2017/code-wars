package hsush2017.code_wars.kyu6;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ValidateCreditCardNumberTest {
    private ValidateCreditCardNumber sut;

    @Before
    public void setUp() throws Exception {
        sut = new ValidateCreditCardNumber();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.validate("891")).isFalse();
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.validate("12345")).isFalse();
    }
}