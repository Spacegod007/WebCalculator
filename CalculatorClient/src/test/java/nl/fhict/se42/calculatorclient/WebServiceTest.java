package nl.fhict.se42.calculatorclient;

import nl.fhict.se42.calculatorclient.WebServiceMethods.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import webservice.*;


public class WebServiceTest{

    int x = 0;
    int y = 0;
    int expected = 0;

    public WebServiceTest() {
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

    @Test
    public void add() throws NegativeNumberException_Exception {

        x = 0;
        y = 0;
        expected = 0;
        assertEquals(expected, WebServiceMethods.add(x, y));

        x = 10;
        y = 0;
        expected = 10;
        assertEquals(expected, WebServiceMethods.add(x, y));

        x = 10;
        y = 20;
        expected = 30;
        assertEquals(expected, WebServiceMethods.add(x, y));

    }

    @Test
    public void minus() throws NegativeNumberException_Exception {
        x = 0;
        y = 0;
        expected = 0;
        assertEquals(expected, WebServiceMethods.minus(x, y));

        x = 10;
        y = 0;
        expected = 10;
        assertEquals(expected, WebServiceMethods.minus(x, y));

        x = 20;
        y = 9;
        expected = 11;
        assertEquals(expected, WebServiceMethods.minus(x, y));
    }

    @Test
    public void times() throws NegativeNumberException_Exception {
        x = 0;
        y = 0;
        expected = 0;
        assertEquals(expected, WebServiceMethods.times(x, y));

        x = 10;
        y = 0;
        expected = 0;
        assertEquals(expected, WebServiceMethods.times(x, y));

        x = 20;
        y = 9;
        expected = 180;
        assertEquals(expected, WebServiceMethods.times(x, y));
    }

    @Test(expected = NegativeNumberException_Exception.class)
    public void timesNegative() throws NegativeNumberException_Exception {
        x = -1;
        y = 0;
        expected = 0;
        assertEquals(expected, WebServiceMethods.times(x, y));
    }

    @Test(expected = NegativeNumberException_Exception.class)
    public void minusNegative() throws NegativeNumberException_Exception {
        x = 1;
        y = 2;
        expected = -1;
        assertEquals(expected, WebServiceMethods.minus(x, y));
    }
 
}
