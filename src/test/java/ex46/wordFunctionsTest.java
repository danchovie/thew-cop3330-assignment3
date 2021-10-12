package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class wordFunctionsTest {

    @Test
    void parseFile() {
        String[] s = wordFunctions.parseFile();
        String[] q = {"badger", "badger", "badger", "badger", "mushroom", "mushroom", "snake", "badger", "badger", "badger"};
        assertArrayEquals(s,q);
    }

    @Test
    void freq1() {
        String[] i = wordFunctions.parseFile();
        int[] j = wordFunctions.freq1(i);
        int[] l = {7,2,1,0,0,0,0,0,0,0};
        assertArrayEquals(j,l);
    }

    @Test
    void printFreq() {
        String x = "badger: *******\n" +
                "mushroom: **\n" +
                "snake: *\n";
        String[] i = wordFunctions.parseFile();
        int[] j = wordFunctions.freq1(i);
        String y = wordFunctions.printFreq(i,j);
        assertEquals(x,y);
    }
}