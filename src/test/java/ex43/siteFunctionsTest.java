package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class siteFunctionsTest {

    @Test
    void genSite() {
        String t1 = "Created: src\\main\\java\\ex43\\big\n" +
                "Created: src\\main\\java\\ex43\\big\\index.html\n" +
                "Created: src\\main\\java\\ex43\\big\\js\n" +
                "Created: src\\main\\java\\ex43\\big\\css\n";
        String t1_supp[] = {"big","daniel","y","y"};
        String t2 = siteFunctions.genSite(t1_supp);
        assertEquals(t1,t2);
    }
}