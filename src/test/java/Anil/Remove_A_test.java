package Ritika;

import Junit.Remove_alphabetA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Remove_A_test {
    Remove_alphabetA obj;

    @BeforeEach
    void setUp()
    {
        obj = new Remove_alphabetA();
    }

    @Test
    void testFirstLetterA()
    {
        Assertions.assertEquals("DCB",obj.remove_alphabetA("ADCB"));
    }

    @Test
    void testBothLetterA()
    {
        Assertions.assertEquals("BAC",obj.remove_alphabetA("AABAC"));
    }

    @Test
    void testSecondLetterA()
    {
        Assertions.assertEquals("CBD",obj.remove_alphabetA("CABD"));
    }

    @Test
    void testNoneLetterA()
    {
        Assertions.assertEquals("RRCCJ",obj.remove_alphabetA("RRCCJ"));
    }

    @Test
    void testStartAndEndLetterA()
    {
        Assertions.assertEquals("BCCA",obj.remove_alphabetA("ABCCA"));
    }

    @Test
    void testBothAndOnlyLetterA()
    {
        Assertions.assertEquals("",obj.remove_alphabetA("AA"));
    }

    @Test
    void testSingleLetterA()
    {
        Assertions.assertEquals("",obj.remove_alphabetA("A"));
    }

    @Test
    void testFirstLetterAInTwoLetters()
    {
        Assertions.assertEquals("C",obj.remove_alphabetA("AC"));
    }

    @Test
    void testSecondLetterAInTwoLetters()
    {
        Assertions.assertEquals("C",obj.remove_alphabetA("CA"));
    }
}
