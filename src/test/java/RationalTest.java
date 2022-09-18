import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testmultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 6;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(12, x.denominator);
    }

    @Test
    public void testdivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 6;
        x.divide(y);
        Assert.assertEquals(3, x.numerator);
    }

    @Test
    public void testEqual() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 12;
        y.denominator = 24;
        Assert.assertTrue(x.equals(y));
    }

    @Test
    public void testCompareTo() {
        Rational x = new Rational();
        x.numerator = 4;
        x.denominator = 9;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 9;
        Assert.assertEquals(1, x.compareTo(y));
    }

    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 99;
        x.denominator = 9999;
        Assert.assertEquals("99 / 9999", x.toString());

    }
}
/*Charan 6288043*/