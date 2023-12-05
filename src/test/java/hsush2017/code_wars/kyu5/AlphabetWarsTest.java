package hsush2017.code_wars.kyu5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabetWarsTest {
    private AlphabetWars sut;

    @Before
    public void setUp() throws Exception {
        sut = new AlphabetWars();
    }

    @Test
    public void test1() {
        assertEquals("ac", sut.alphabetWar("[a]#[b]#[c]"));
    }

    @Test
    public void test2() {
        assertEquals("d", sut.alphabetWar("[a]#b#[c][d]"));
    }

    @Test
    public void test3() {
        assertEquals("abc", sut.alphabetWar("[a][b][c]"));
    }

    @Test
    public void test4() {
        assertEquals("c", sut.alphabetWar("##a[a]b[c]#"));
    }

    @Test
    public void test5() {
        assertEquals("abdefghijk", sut.alphabetWar("abde[fgh]ijk"));
    }

    @Test
    public void test6() {
        assertEquals("fgh", sut.alphabetWar("ab#de[fgh]ijk"));
    }

    @Test
    public void test7() {
        assertEquals("", sut.alphabetWar("ab#de[fgh]ij#k"));
    }

    @Test
    public void test8() {
        assertEquals("", sut.alphabetWar("##abde[fgh]ijk"));
    }

    @Test
    public void test9() {
        assertEquals("", sut.alphabetWar("##abcde[fgh]"));
    }

    @Test
    public void test10() {
        assertEquals("abcdefgh", sut.alphabetWar("abcde[fgh]"));
    }

    @Test
    public void test11() {
        assertEquals("mn", sut.alphabetWar("##abde[fgh]ijk[mn]op"));
    }

    @Test
    public void test12() {
        assertEquals("mn", sut.alphabetWar("#abde[fgh]i#jk[mn]op"));
    }

    @Test
    public void test13() {
        assertEquals("abijk", sut.alphabetWar("[ab]adfd[dd]##[abe]dedf[ijk]d#d[h]#"));
    }

    @Test
    public void test14() {
        assertEquals("w", sut.alphabetWar("jt[w][w]#mot#[ph]xyn#"));
    }

    @Test
    public void test15() {
        assertEquals("trnyditzj", sut.alphabetWar("angjl[omb]####[xfb][trn][y]#[di][tzj]cbjrpq#t"));
    }
}