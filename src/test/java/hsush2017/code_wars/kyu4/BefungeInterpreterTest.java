package hsush2017.code_wars.kyu4;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class BefungeInterpreterTest {
    private BefungeInterpreter sut;

    @Before
    public void setUp() throws Exception {
        sut = new BefungeInterpreter();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.interpret(">987v>.v\nv456<  :\n>321 ^ _@")).isEqualTo("123456789");
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.interpret(">25*\"!dlroW olleH\":v\n                v:,_@\n                >  ^")).isEqualTo("Hello World!\n");
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.interpret("08>:1-:v v *_$.@ \n  ^    _$>\\:^  ^    _$>\\:^")).isEqualTo("40320");
    }
}