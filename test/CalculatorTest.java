import com.siit.SIIT.CalculatorHomework.Calculator;
import org.junit.*;


import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    private String expression;
    private Calculator calculator;
    private int result;

    public CalculatorTest ( String expression , int result ) {
        this.expression = expression;
        this.result = result;
    }

    @BeforeClass
    public static void beforeClass () {
        System.out.println ( "before class" );
    }

    @AfterClass
    public static void afterClass () {
        System.out.println ( "after class" );
    }

    @Before
    public void setup () {
        System.out.println ( "in setup" );
        calculator = new Calculator ( );
    }

    @After
    public void after () {
        System.out.println ( "after" );
    }



    @Test
    public void testWithParameters () {
        assertEquals ( result , calculator.calculateExpression ( expression ) );
    }

    @Test
    public void testExctractMinusAndPlus () {
        String expression = "12 mm + 10 cm";
        String plusMinus = "";
        plusMinus = calculator.extractMinusPlus ( expression , plusMinus );
        assertEquals ( plusMinus , calculator.extractMinusPlus ( "12 mm + 10 cm" , plusMinus ) );
    }

    @Test
    public void testExtractSpaces () {
        String splitBySpace[] = new String[20];
        String expression = "12 mm + 10 cm";
        String[] result = calculator.extractSpaces ( expression , splitBySpace );
        assertEquals ( result , calculator.extractSpaces ( "12 mm + 10 cm" , splitBySpace ) );

    }

    @Test
    public void testReturningTotal () throws NumberFormatException {
        String expression = "12 mm + 10 cm";
        int result = calculator.calculateExpression ( expression );
        assertEquals ( result , calculator.calculateExpression ( expression ) );
    }


}
