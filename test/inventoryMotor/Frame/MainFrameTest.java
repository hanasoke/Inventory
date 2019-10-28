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
public class MainFrameTest {
    
    public MainFrameTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mesin method, of class MainFrame.
     */
//    @Test
//    public void testMesin() {
//        System.out.println("mesin");
//        String mesin = "";
//        MainFrame instance = new MainFrame();
//        String expResult = "";
//        String result = instance.mesin(mesin);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of brand method, of class MainFrame.
     */
//    @Test
//    public void testBrand() {
//        System.out.println("brand");
//        String brand = "";
//        MainFrame instance = new MainFrame();
//        String expResult = "";
//        String result = instance.brand(brand);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of nama method, of class MainFrame.
     */
    @Test
    public void testNama() {
        System.out.println("nama");
        
        MainFrame lg = new MainFrame();
        String nama = lg.nama("Vario");
        assertThat(nama, containsString("V"));
        assertThat(nama, is(notNullValue()));
        assertThat(nama, endsWith("o"));

    }

    /**
     * Test of type method, of class MainFrame.
     */
//    @Test
//    public void testType() {
//        System.out.println("type");
//        String type = "";
//        MainFrame instance = new MainFrame();
//        String expResult = "";
//        String result = instance.type(type);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of warna method, of class MainFrame.
     */
    @Test
    public void testWarna() {
        System.out.println("warna");
        MainFrame lg = new MainFrame();
        String warna = lg.warna("Biru");
        assertThat(warna, containsString("i"));
        assertThat(warna, is(notNullValue()));
        assertThat(warna, endsWith("u"));      
    }

    /**
     * Test of jumlah method, of class MainFrame.
     */
    @Test
    public void testJumlah() {
        System.out.println("jumlah");
        MainFrame lg = new MainFrame();
        String jumlah = lg.jumlah("2050");
        assertThat(jumlah, containsString("5"));
        assertThat(jumlah, is(notNullValue()));
        assertThat(jumlah, endsWith("0"));
    }

    /**
     * Test of main method, of class MainFrame.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        MainFrame.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
