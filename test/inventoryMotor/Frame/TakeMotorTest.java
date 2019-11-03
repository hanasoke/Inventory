/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventoryMotor.Frame;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author hanas_bp
 */
public class TakeMotorTest {
    
    public TakeMotorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of illegalArgument method, of class index.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testIllegalArgument() {
        System.out.println("illegalArgument");
        int motor = 0;
        int take = 0;
        TakeMotor instance = new TakeMotor();
        int motorExp = 10;
        int takeExp = 10;
        int expResult = motorExp + takeExp;
        int result = instance.illegalArgument(motor, take);
        assertEquals(expResult, result);
    }
    
    @Test(expected = AssertionError.class)
    public void testAssertion()
    {
        System.out.println("Assertion");
        int motor = 4;
        int take = 10;
        
        TakeMotor instance = new TakeMotor();
        int MotorExp = 4;
        int TakeExp = 12;
        
        String expResult = instance.assertion(MotorExp, TakeExp);
        String result = instance.assertion(motor, take);
        assertEquals(expResult, result);
    }
    
    @Ignore("Fungsi ini akan di skip")
    @Test
    public void ignoring()
    {
        System.out.println("Ignoring");

        int motorInt = 4;
        String motor = Integer.toString(motorInt);
        String date = "2019-01-01";
        int takeInt = 5;
        String take = Integer.toString(takeInt);
        
        String result = motor + date + take;
        
        int motorIntExp = 4;
        String motorExp = Integer.toString(motorIntExp);
        String dateExp = "2019-01-01";
        int takeIntExp = 5;
        String takeExp = Integer.toString(takeIntExp);
        
        String expektasi = motorExp + dateExp + takeExp;
        
        assertEquals(expektasi, result);
        
    }

    /**
     * Test of motor method, of class BuyMotor.
     */
    @Test
    public void testMotor() {
        System.out.println("motor");
        
        TakeMotor lg = new TakeMotor();
        String motor = lg.motor(4);
        assertThat(motor, containsString("4"));
        assertThat(motor, is(notNullValue()));
        assertThat(motor, endsWith("4"));
    }
    
    @Test 
    public void testSubmit() {
        System.out.println("submit");
        
        int motor = 100, take = 10;
        String date = "2019-01-01";
        
        TakeMotor main = new TakeMotor();
        int motorExp = 4;
        int takeExp = 10;
        String dateExp = "2019-01-01";
        
        String expResult = main.submit(motorExp, dateExp, takeExp);
        String result = main.submit(motor, date, take);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDelete() {
        System.out.println("delete");
        
        int motor = 4, take = 10;
        String date = "2019-01-01";
        
        TakeMotor main = new TakeMotor();
        int motorExp = 4;
        int takeExp = 10;
        String dateExp = "2019-01-01";
        
        String expResult = main.delete(motorExp, dateExp, takeExp);
        String Result = main.delete(motor, date, take);
        
        assertThat(Result, is(equalTo(expResult)));  
    }

    /**
     * Test of ambil method, of class BuyMotor.
     */
    @Test
    public void testAmbil() {
        System.out.println("ambil");
        TakeMotor lg = new TakeMotor();
        String ambil = lg.ambil(14);
        assertThat(ambil, containsString("14"));
        assertThat(ambil, is(notNullValue()));
        assertThat(ambil, endsWith("4"));
    }
    
//    @Test(expected = StackOverflowError.class)
//    public void testStackOverflow()
//    {
//        System.out.println("Stack Overflow");
//        TakeMotor tm = new TakeMotor();
//        int hasil = tm.StackOverflowCall(1);
//        int expetasi = 10;
//        assertEquals(hasil, expetasi);
//    }

    /**
     * Test of main method, of class BuyMotor.
     */
//    @Test(timeout = 10)
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        TakeMotor.main(args);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }    
}