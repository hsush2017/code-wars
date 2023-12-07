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
        //0877665544332210
        Assertions.assertThat(sut.interpret(
                "08>:1-:v v *_$.@ \n" +
                        "  ^    _$>\\:^  ^    _$>\\:^")).isEqualTo("40320");
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.interpret(
                ">::9%\\9/v\n" +
                        " v*99:,g<\n" +
                        " >1-- v\n" +
                        " >9%v #\n" +
                        "^  <_91v\n" +
                        " : ^,+ <\n" +
                        " ^  +1_v\n" +
                        "  @,+19<\n" +
                        ":)")).isEqualTo("");
    }
}