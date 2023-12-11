package hsush2017.code_wars.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class PickPeaksTest {
    private PickPeaks sut;

    @Before
    public void setUp() throws Exception {
        sut = new PickPeaks();
    }

    @Test
    public void test1() {
        Assertions.assertThat(sut.getPeaks(new int[]{1, 2, 3, 6, 4, 1, 2, 3, 2, 1}))
                .containsEntry("pos", Arrays.asList(3, 7))
                .containsEntry("peaks", Arrays.asList(6, 3));
    }

    @Test
    public void test2() {
        Assertions.assertThat(sut.getPeaks(new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3}))
                .containsEntry("pos", Arrays.asList(3, 7))
                .containsEntry("peaks", Arrays.asList(6, 3));
    }

    @Test
    public void test3() {
        Assertions.assertThat(sut.getPeaks(new int[]{3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1}))
                .containsEntry("pos", Arrays.asList(3, 7, 10))
                .containsEntry("peaks", Arrays.asList(6, 3, 2));
    }

    @Test
    public void test4() {
        Assertions.assertThat(sut.getPeaks(new int[]{9, 9, 15, 9, 14, 3, -1, 6, 8, 11, -5, 18, 17, 11, -4, 3, 4, 12, -1, 19, 7}))
                .containsEntry("pos", Arrays.asList(2, 4, 9, 11, 17, 19))
                .containsEntry("peaks", Arrays.asList(15, 14, 11, 18, 12, 19));
    }

    @Test
    public void test5() {
        Assertions.assertThat(sut.getPeaks(new int[]{6, 13, 14, 0, -5, 16, -4, -1, -5, 14, 7, 0, 5, 18, 10, 8, -4, -1, 14, 17, -3, 3, 11, 4}))
                .containsEntry("pos", Arrays.asList(2, 5, 7, 9, 13, 19, 22))
                .containsEntry("peaks", Arrays.asList(14, 16, -1, 14, 18, 17, 11));
    }

    @Test
    public void test6() {
        Assertions.assertThat(sut.getPeaks(new int[]{-4, 12, 14, 1, -1, 7, 17, 19, 10, 0, -5, -1, -1, -2, 14, 10, 8, 14}))
                .containsEntry("pos", Arrays.asList(2, 7, 11, 14))
                .containsEntry("peaks", Arrays.asList(14, 19, -1, 14));
    }

    @Test
    public void test7() {
        Assertions.assertThat(sut.getPeaks(new int[]{19, 5, -4, 0, 0, 10, 14, 11, 14, 1, 8, 3, 12, 4, -3}))
                .containsEntry("pos", Arrays.asList(6, 8, 10, 12))
                .containsEntry("peaks", Arrays.asList(14, 14, 8, 12));
    }
}