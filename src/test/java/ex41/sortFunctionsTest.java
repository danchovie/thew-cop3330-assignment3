package ex41;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class sortFunctionsTest {

    @org.junit.jupiter.api.Test
    void sortList() {
        ArrayList<String> listPre = new ArrayList<>();
        ArrayList<String> listPost = new ArrayList<>();
        listPost.add("Johnson, Jim");
        listPost.add("Jones, Aaron");
        listPost.add("Jones, Chris");
        listPost.add("Ling, Mai");
        listPost.add("Swift, Geoffrey");
        listPost.add("Xiong, Fong");
        listPost.add("Zarnecki, Sabrina");
        listPre = sortFunctions.getNames();
        listPre = sortFunctions.sortList(listPre);
        String s1 = listPre.toString();
        String s2 = listPost.toString();
        assertEquals(s1,s2);
    }
}