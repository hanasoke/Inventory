/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventoryMotor.Frame;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

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
    @Test (expected = IllegalArgumentException.class)
    public void testIllegalArgument() {
        System.out.println("illegalArgument");
        int motor = 0;
        int amount = 0;
        MainFrame instance = new MainFrame();
        
        int motorExp = 10;
        int amountExp = 10;
        int expResult = motorExp + amountExp;
        int result = instance.illegalArgument(motor, amount);
        assertEquals(expResult, result);
    }
    
    @Test(expected = AssertionError.class)
    public void testAssertion()
    {
        System.out.println("Assertion");
        int motor = 4;
        int amount = 10;
        
        MainFrame instance = new MainFrame();
        int MotorExp = 4;
        int amountExp = 12;
        
        String expResult = instance.assertion(MotorExp, amountExp);
        String result = instance.assertion(motor, amount);
        assertEquals(expResult, result);
    }
    
    @Ignore("Fungsi ini akan diskip")
    @Test
    public void ignoring()
    {
        System.out.println("Ignoring");
        
        String brand = "Honda";
        String type = "Manual";
        
        String result = brand + type;
        
        String brandExp = "Yamaha";
        String typeExp = "Matic";
        String expektasi = brandExp + typeExp;
        assertEquals(result, expektasi);
    }
    
//    @Test(expected = StackOverflowError.class)
//    public void testStackOverflow()
//    {
//        System.out.println("Stack Overflow");
//        MainFrame mn = new MainFrame();
//        int hasil = mn.StackOverflowCall(1);
//        int expetasi = 10;
//        assertEquals(hasil, expetasi);
//    }
 
    @Test
    public void searchMesin()
    {
        System.out.println("Search Machine");
        MainFrame lg = new MainFrame();
        String mesin = lg.type("CM001");
        assertThat(mesin, anyOf(containsString("CM001"), containsString("CM002"),containsString("RC302"),containsString("GONE2"),containsString("CM034")));
        assertThat(mesin, is(notNullValue()));  
    }
    
    public List<String> mesin;
    @Test
    public void testMesin()
    {
        System.out.println("Machine");
        mesin = new ArrayList<String>();
        mesin.add("CM001");
        mesin.add("CM002");
        mesin.add("RC302");
        mesin.add("GONE2");
        mesin.add("CM034");
        assertThat(mesin, hasItem("CM001"));   
    }
    /**
     * Test of brand method, of class MainFrame.
     */
    
    @Test
    public void SearchBrand()
    {
        System.out.println("Search Brand");
        MainFrame lg = new MainFrame();
        String mesin = lg.type("Honda");
        assertThat(mesin, anyOf(containsString("Yamaha"), containsString("Honda"),containsString("Suzuki")));
        assertThat(mesin, is(notNullValue()));  
    }
    
    public List<String> brand;
    @Test
    public void testBrand()
    {
        System.out.println("List Brand");
        brand = new ArrayList<String>();
        brand.add("Yamaha");
        brand.add("Honda");
        brand.add("Suzuki");
        assertThat(brand, hasItem("Honda"));   
    }
    /**
     * Test of nama method, of class MainFrame.
     */
    @Test
    public void testNama() {
        System.out.println("nama");

        MainFrame lg = new MainFrame();
        String nama = lg.nama("Vario");
        assertThat(nama, containsString("r"));
        assertThat(nama, is(notNullValue()));
        assertThat(nama, endsWith("o"));
    }

    /**
     * Test of type method, of class MainFrame.
     */
    @Test
    public void testType() {
        System.out.println("type");
        MainFrame lg = new MainFrame();
        String type = lg.type("Matic");
        assertThat(type, anyOf(containsString("Matic"), containsString("Manual")));
        assertThat(type, is(notNullValue()));
        assertThat(type, startsWith("M"));
    }
    
    @Test
    public void testManufacture() {
        System.out.println("manufacture");
        MainFrame lg = new MainFrame();
        String type = lg.type("2019-01-01");
        assertThat(type, containsString("-"));
    }

    /**
     * Test of warna method, of class MainFrame.
     */
    @Test
    public void testWarna() {
        System.out.println("warna");
        MainFrame lg = new MainFrame();
        String warna = lg.warna("Biru");
        assertThat(warna, startsWith("B"));
    }

    /**
     * Test of jumlah method, of class MainFrame.
     */
    @Test
    public void testJumlah() {
        System.out.println("jumlah");
        MainFrame lg = new MainFrame();
        String jumlah = lg.jumlah(250);
        assertThat(jumlah,allOf(startsWith("2"), containsString("5"), endsWith("0")));
    }

    @Test
    public void testSubmit() {
        System.out.println("submit");
        String mesin = "CM001", brand = "Honda", nama = "Vario", type = "Matic", manufacture = "2019-01-01", warna = "Merah";
        int jumlah = 10;
        assertThat(mesin, is(notNullValue()));
        assertThat(brand, is(notNullValue()));
        assertThat(nama, is(notNullValue()));
        assertThat(type, is(notNullValue()));
        assertThat(manufacture, is(notNullValue()));
        assertThat(warna, is(notNullValue()));
        MainFrame main = new MainFrame();
        String Result = main.submit(mesin, brand, nama, type, manufacture, warna, jumlah);
        assertThat(Result, is(notNullValue()));
    }
    
    @Test
    public void testUpdate() {
        System.out.println("update");

        String mesin = "CM001", brand = "Honda", nama = "Vario", type = "Matic", manufacture = "2019-01-01", warna = "Merah";
        int jumlah = 10;

        MainFrame main = new MainFrame();
        String mesinExp = "CM001";
        String brandExp = "Honda";
        String namaExp = "Beat";
        String typeExp = "Matic";
        String manufactureExp = "2019-01-01";
        String warnaExp = "Biru";
        int jumlahExp = 10;

        String expResult = main.update(mesinExp, brandExp, namaExp, typeExp, manufactureExp, warnaExp, jumlahExp);
        String Result = main.update(mesin, brand, nama, type, manufacture, warna, jumlah);
        
        assertThat(Result, is(not(equalTo(expResult))));
    }
    
    @Test
    public void testDelete() {
        System.out.println("delete");

        String mesin = "CM001", brand = "Honda", nama = "Vario", type = "Matic", manufacture = "2019-01-01", warna = "Merah";
        int jumlah = 10;

        MainFrame main = new MainFrame();
        String mesinExp = "CM001";
        String brandExp = "Honda";
        String namaExp = "Vario";
        String typeExp = "Matic";
        String manufactureExp = "2019-01-01";
        String warnaExp = "Merah";
        int jumlahExp = 10;

        String expResult = main.delete(mesinExp, brandExp, namaExp, typeExp, manufactureExp, warnaExp, jumlahExp);
        String Result = main.delete(mesin, brand, nama, type, manufacture, warna, jumlah);
        assertThat(Result, is(equalTo(expResult)));
    }

    /**
     * Test of main method, of class MainFrame.
     */
    @Test(timeout = 10)
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MainFrame.main(args);
    }
}
