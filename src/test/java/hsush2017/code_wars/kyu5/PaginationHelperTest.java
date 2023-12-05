package hsush2017.code_wars.kyu5;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class PaginationHelperTest {
    private PaginationHelper<Character> sut;

    @Before
    public void setUp() {
        sut = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
    }

    @Test
    public void testPageCount() {
        Assertions.assertThat(sut.pageCount()).isEqualTo(2);
    }

    @Test
    public void testItemCount() {
        Assertions.assertThat(sut.itemCount()).isEqualTo(6);
    }

    @Test
    public void testPageItemCount() {
        Assertions.assertThat(sut.pageItemCount(0)).isEqualTo(4);
        Assertions.assertThat(sut.pageItemCount(1)).isEqualTo(2);
        Assertions.assertThat(sut.pageItemCount(2)).isEqualTo(-1);
    }

    @Test
    public void testPageIndex() {
        Assertions.assertThat(sut.pageIndex(5)).isEqualTo(1);
        Assertions.assertThat(sut.pageIndex(2)).isEqualTo(0);
        Assertions.assertThat(sut.pageIndex(20)).isEqualTo(-1);
        Assertions.assertThat(sut.pageIndex(-10)).isEqualTo(-1);
    }

    @Test
    public void emptyCollection() {
        PaginationHelper<?> empty = new PaginationHelper<>(Collections.emptyList(), 10);

        Assertions.assertThat(empty.itemCount()).isEqualTo(0);
        Assertions.assertThat(empty.pageCount()).isEqualTo(0);
        Assertions.assertThat(empty.pageIndex(0)).isEqualTo(-1);
        Assertions.assertThat(empty.pageIndex(1)).isEqualTo(-1);
        Assertions.assertThat(empty.pageIndex(-1)).isEqualTo(-1);
        Assertions.assertThat(empty.pageItemCount(0)).isEqualTo(-1);
        Assertions.assertThat(empty.pageItemCount(1)).isEqualTo(-1);
    }
}