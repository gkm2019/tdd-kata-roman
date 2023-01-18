import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberTest {
    @Test
    public void romanNumberValueShouldGetRomanNumber_1() {
        RomanNumber one = new RomanNumber(1);
        assertEquals("I", one.value());

        RomanNumber two = new RomanNumber(2);
        assertEquals("II", two.value());

        RomanNumber three = new RomanNumber(3);
        assertEquals("III", three.value());

        RomanNumber four = new RomanNumber(4);
        assertEquals("IV", four.value());
    }

    @Test
    public void romanNumberValueShouldGetRomanNumber_2() {
        RomanNumber one = new RomanNumber(10);
        assertEquals("X", one.value());

        RomanNumber two = new RomanNumber(49);
        assertEquals("XLIX", two.value());

        RomanNumber three = new RomanNumber(88);
        assertEquals("LXXXVIII", three.value());
    }

    @Test
    public void romanNumberValueShouldGetRomanNumber_3() {
        RomanNumber one = new RomanNumber(145);
        assertEquals("CXLV", one.value());

        RomanNumber two = new RomanNumber(467);
        assertEquals("CDLXVII", two.value());

        RomanNumber three = new RomanNumber(758);
        assertEquals("DCCLVIII", three.value());
    }

    @Test
    public void romanNumberValueShouldGetRomanNumber_4() {
        RomanNumber one = new RomanNumber(1000);
        assertEquals("M", one.value());

        RomanNumber two = new RomanNumber(1003);
        assertEquals("MIII", two.value());

        RomanNumber three = new RomanNumber(3999);
        assertEquals("MMMCMXCIX", three.value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void arabicNumberValueInputCheck_exception() {
        RomanNumber romanNumber = new RomanNumber(4000);
        romanNumber.value();
    }
}
