package main.test;

import main.java.Addition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    private Addition addition;
    @BeforeEach
    public void setUp() {
        addition = new Addition();
    }
    @Test
public void ArraySplitDelimiterSeparatedString() {
        String number = "1//2;3\n 4,5";
        Assertions.assertEquals(15,addition.add(number));
    }
    @Test
    public void ArraySplitCommaSepratedString(){
        String number = "1,2,3,4,5";
        Assertions.assertEquals(15,addition.add(number));
    }
    @Test
    public void ArraySplitSemicolonSepratedString(){
        String number = "1;2;3;4;5";
        Assertions.assertEquals(15,addition.add(number));
    }
    @Test
    public void ArraySplitBackslashNSepratedString(){
        String number = "1\n'2\n'3\n'4\n'5";
        Assertions.assertEquals(15,addition.add(number));
    }
    @Test
    public void ArraySplitDoubleForwardslashSepratedString(){
        String number = "1//2//3//4//5";
        Assertions.assertEquals(15,addition.add(number));
    }
    @Test
    public void ArraySplitNegativeNumbersSepratedString(){
        String number = "-1,-2,-3,-4,-5";
        Assertions.assertEquals(NumberFormatException.class,addition.add(number));
    }
}

