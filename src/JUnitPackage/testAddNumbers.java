package JUnitPackage;
import static org.junit.Assert.assertEquals;

public class testAddNumbers {

    @org.junit.jupiter.api.Test
    void addNumbers() {
        JUnitTesting addNum = new JUnitTesting();
        int result = addNum.addNumbers(100, 200);
        assertEquals (300,result);
        result = addNum.addNumbers(150, 200);
        assertEquals (300, result);
    }
}