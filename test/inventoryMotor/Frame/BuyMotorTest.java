/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventoryMotor.Frame;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hanas_bp
 */
public class BuyMotorTest {
    
    public BuyMotorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of motor method, of class BuyMotor.
     */
    @Test
    public void testMotor() {
        System.out.println("motor");
        
        BuyMotor lg = new BuyMotor();
        String motor = lg.motor("4");
        assertThat(motor, containsString("4"));
        assertThat(motor, is(notNullValue()));
        assertThat(motor, endsWith("4"));
    }

    /**
     * Test of ambil method, of class BuyMotor.
     */
    @Test
    public void testAmbil() {
        System.out.println("ambil");
        BuyMotor lg = new BuyMotor();
        String ambil = lg.ambil("14");
        assertThat(ambil, containsString("14"));
        assertThat(ambil, is(notNullValue()));
        assertThat(ambil, endsWith("4"));
    }

    /**
     * Test of main method, of class BuyMotor.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        BuyMotor.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
