package ex42;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class parseFunctionsTest {

    @Test
    void printList() {
        String s1 = "Ling      Mai       55900     \n" +
                "Johnson   Jim       56500     \n" +
                "Jones     Aaron     46000     \n" +
                "Jones     Chris     34500     \n" +
                "Swift     Geoffrey  14200     \n" +
                "Xiong     Fong      65000     \n" +
                "Zarnecki  Sabrina   51500     \n";
        ArrayList<String> list = parseFunctions.readFile();
        String s2 = parseFunctions.printList(list);
        assertEquals(s1, s2);
    }
}