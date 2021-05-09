/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anabel
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculadora.
     */

    @Test
    public void twoAndThreeIsFive(){
        System.out.println("twoAndThreeIsFive");
        float a = 2F;
        float b = 3F;
        float expResult = 5F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void twoAndZeroIsTwo(){
        System.out.println("twoAndZeroIsTwo");
        float a = 2F;
        float b = 0F;
        float expResult = 2F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void twoAndMinusTwoIsZero(){
        System.out.println("twoAndMinusTwoIsZero");
        float a = 2F;
        float b = -2F;
        float expResult = 0F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void ZeroAndMinusNineIsMinusNine(){
        System.out.println("ZeroAndMinusNineIsMinusNine");
        float a = 0F;
        float b = -9F;
        float expResult = -9F;
        float result = Calculadora.add(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void threeMinusTwoIsOne() {
        System.out.println("threeMinusTwoIsOne");
        float a = 3F;
        float b = 2F;
        float expResult = 1F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void threeMinusThreeIsZero() {
        System.out.println("threeMinusThreeIsZero");
        float a = 3F;
        float b = 3F;
        float expResult = 0F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void threeMinusMinusThreeIsSix() {
        System.out.println("threeMinusMinusThreeIsSix");
        float a = 3F;
        float b = -3F;
        float expResult = 6F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void MinusNineMinusMinusTenIsOne() {
        System.out.println("MinusNineMinusMinusTenIsOne");
        float a = -9F;
        float b = -10F;
        float expResult = 1F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiply method, of class Calculadora.
     */

    @Test
    public void threeXThreeIsNine() {
        System.out.println("threeXThreeIsNine");
        float a = 3F;
        float b = 3F;
        float expResult = 9F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void threeXZeroIsZero() {
        System.out.println("threeXZeroIsZero");
        float a = 3F;
        float b = 0F;
        float expResult = 0F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void threeXMinusThreeIsMinusNine() {
        System.out.println("threeXMinusThreeIsMinusNine");
        float a = 3F;
        float b = -3F;
        float expResult = -9F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of div method, of class Calculadora.
     */

    @Test
    public void eigthBetweenTwoIsFour() {
        System.out.println("eigthBetweenTwoIsFour");
        float a = 8F;
        float b = 2F;
        float expResult = 4F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void FiveBetweenZeroIsInfinity() {
        System.out.println("FiveBetweenZeroIsInfinity");
        float a = 5F;
        float b = 0F;
        float result = Calculadora.div(a, b);
        assertTrue(Float.isInfinite(result));
    }

    @Test
    public void TwentyBetweenTwoIsTen() {
        System.out.println("TwentyBetweenTwoIsTen");
        float a = 20F;
        float b = 2F;
        float expResult = 10F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void NineBetweenFourIsTwoPointTwentyFive() {
        System.out.println("NineBetweenFourIsTwoPointTwentyFive");
        float a = 9F;
        float b = 4F;
        float expResult = 2.25F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of back method, of class Calculadora.
     */

    @Test
    public void NinetyNineBackIsNine() {
        System.out.println("NinetyNineBackIsNine");
        String a = "99";
        String expResult = "9";
        String result = Calculadora.back(a);
        assertEquals(expResult, result);
    }

    @Test
    public void SevenPointOneBackIsSevenPoint() {
        System.out.println("SevenPointOneBackIsSevenPoint");
        String a = "7.1";
        String expResult = "7.";
        String result = Calculadora.back(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of mod method, of class Calculadora.
     */

    @Test
    public void FourModTwoIsZero() {
        System.out.println("FourModTwoIsZero");
        float a = 4F;
        float b = 2F;
        float expResult = 0F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void TenModThreeIsOne() {
        System.out.println("TenModThreeIsOne");
        float a = 10F;
        float b = 3F;
        float expResult = 1F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void FiveModTwoIsOne() {
        System.out.println("FiveModTwoIsOne");
        float a = 5F;
        float b = 2F;
        float expResult = 1F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of signo method, of class Calculadora.
     */
    @Test
    public void SixtySignIsMinusSixty() {
        System.out.println("SixtySignIsMinusSixty");
        float a = 60F;
        float expResult = -60F;
        float result = Calculadora.signo(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void MinusFourtyFourSignIsFourtyFour() {
        System.out.println("MinusFourtyFourSignIsFourtyFour");
        float a = -44F;
        float expResult = 44F;
        float result = Calculadora.signo(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void ThreeSignIsMinusThree() {
        System.out.println("ThreeSignIsMinusThree");
        float a = 3F;
        float expResult = -3F;
        float result = Calculadora.signo(a);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of coma method, of class Calculadora.
     */
    @Test
    public void NineColonIsNinePoint() {
        System.out.println("NineColonIsNinePoint");
        String a = "9";
        String expResult = "9.";
        String result = Calculadora.coma(a);
        assertEquals(expResult, result);
    }

    @Test
    public void ZeroPointOneColonIsZeroPointOne() {
        System.out.println("ZeroPointOneColonIsZeroPointOne");
        String a = "0.1";
        String expResult = "0.1";
        String result = Calculadora.coma(a);
        assertEquals(expResult, result);
    }

    @Test
    public void ZeroColonIsZeroPoint() {
        System.out.println("ZeroColonIsZeroPoint");
        String a = "0";
        String expResult = "0.";
        String result = Calculadora.coma(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of 10x method, of class Calculadora.
     */

    @Test
    public void TenToThePowerOfFourIsTenThousand() {
        System.out.println("TenToThePowerOfFourIsTenThousand");
        float a = 4F;
        float expResult = 10000F;
        float result = Calculadora.tenPow(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void TenToThePowerOfMinusTwoIs() {
        System.out.println("TenToThePowerOfMinusTwoIs");
        float a = -2F;
        float expResult = 0.01F;
        float result = Calculadora.tenPow(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void TenToThePowerOfSixIsOneMillion() {
        System.out.println("TenToThePowerOfSixIsOneMillion");
        float a = 6F;
        float expResult = 1000000F;
        float result = Calculadora.tenPow(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void FactorialOfSixIsSevenTwenty() {
        System.out.println("FactorialOfSixIsSevenTwenty");
        double a = 6;
        double expResult = 720;
        double result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void FactorialOfCeroIsOne() {
        System.out.println("FactorialOfCeroIsOne");
        double a = 0;
        double expResult = 1;
        double result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void MinusFiveFactorialIsMinusOneTwenty() {
        System.out.println("MinusFiveFactorialIsMinusOneTwenty");
        double a = -5;
        double expResult = -5;
        double result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void OneFactorialIsOne() {
        System.out.println("OneFactorialIsOne");
        double a = 1;
        double expResult = 1;
        double result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void LogTwoIsPointThreeOOne() {
        System.out.println("LogTwoIsPointThreeOOne");
        double a = 2;
        double expResult = 0.6931471824645996;
        double result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void LogZeroIsMinusInfinity() {
        //TODO
        System.out.println("LogZeroIsMinusInfinity");
        double a = 0;
        double expResult = Double.NEGATIVE_INFINITY;
        double result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void LogMinusOneIsError() {
        //TODO
        System.out.println("LogMinusOneIsError");
        double a = -1;
        double result = Calculadora.log(a);
        assertEquals(result, Double.NaN, 0);

    }

    @Test
    public void LogTenIs() {
        //TODO
        System.out.println("LogTenIs");
        double a = 10;
        double expResult = 2.3025851249694824;
        double result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void LogHundredIs() {
        System.out.println("LogHundredIs");
        double a = 100;
        double expResult = 4.605170249938965;
        double result = Calculadora.log(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void SQRTZeroIsZero() {
        System.out.println("SQRTZeroIsZero");
        double a = 0;
        double expResult = 0;
        double result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void SQRTMinusOneIsError() {
        System.out.println("SQRTZeroIsZero");
        double a = 0;
        double expResult = 0;
        double result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void SQRTFourIsTwo() {
        System.out.println("SQRTFourIsTwo");
        double a = 4;
        double expResult = 2;
        double result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void SQRTHundredIsTen() {
        System.out.println("SQRTHundredIsTen");
        double a = 100;
        double expResult = 10;
        double result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.0);
    }

}
