package org.example.kyu5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeCheckerTest {
    private TicTacToeChecker sut;

    @Before
    public void setUp() {
        sut = new TicTacToeChecker();
    }

    @Test
    public void notFinished() {
        int[][] board = {
                {0, 0, 1},
                {0, 1, 2},
                {2, 1, 0}
        };

        assertEquals(-1, sut.isSolved(board));
    }

    @Test
    public void winnerX() {
        int[][] board = {
                {1, 1, 1},
                {0, 2, 2},
                {0, 0, 0}
        };

        assertEquals(1, sut.isSolved(board));
    }

    @Test
    public void winnerO() {
        int[][] board = {
                {1, 1, 2},
                {0, 2, 0},
                {2, 1, 1}
        };

        assertEquals(2, sut.isSolved(board));
    }

    @Test
    public void draw() {
        int[][] board = {
                {1, 2, 1},
                {1, 1, 2},
                {2, 1, 2}
        };

        assertEquals(0, sut.isSolved(board));
    }
}