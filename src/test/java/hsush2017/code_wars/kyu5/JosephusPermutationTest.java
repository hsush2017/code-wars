package hsush2017.code_wars.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class JosephusPermutationTest {
    private JosephusPermutation sut;

    @Before
    public void setUp() throws Exception {
        sut = new JosephusPermutation();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.josephusPermutation(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 1))
                .isEqualTo(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.josephusPermutation(Arrays.asList('C', 'o', 'd', 'e', 'W', 'a', 'r', 's'), 4))
                .isEqualTo(Arrays.asList('e', 's', 'W', 'o', 'C', 'd', 'r', 'a'));
    }
}