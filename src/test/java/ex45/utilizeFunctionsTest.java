package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class utilizeFunctionsTest {

    @Test
    void parseFile() {
        String s1 = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".\n";
        String s2 = utilizeFunctions.parseFile();
        assertEquals(s1,s2);
    }

    @Test
    void returnS() {
        String s1 = "uses and utilizes";
        String s2 = utilizeFunctions.returnS(s1);
        String s3 = "uses and uses";
        assertEquals(s2, s3);
    }
}