package JUnitPackage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testAddString {

    @Test
    public void addStrings() {
        JUnitTesting addString = new JUnitTesting();
        String result = addString.addStrings("Hello","Chinmay");
        assertEquals("HelloChinmay",result);
        result = addString.addStrings("Hello","SAhaj");
        assertEquals("Hellosahaj",result);
        result = addString.addStrings("Hello ","guys");
        assertEquals("Hellouys",result);



    }
}