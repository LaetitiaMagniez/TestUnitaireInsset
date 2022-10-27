/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
public class ParfaitTest {
    
    public ParfaitTest() {
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
     * Test of estDivisiblePar method, of class Parfait.
     */
    @Test
    public void testEstDivisibleParOK() {
        //given
        long n = 2;
        long val = 6;
        Parfait instance = new Parfait();
        
        //when
        boolean result = instance.estDivisiblePar(n, val);
        
        //then
        Assert.assertTrue("OK", result);
    }

    /**
     * Test of diviseurs method, of class Parfait.
     */
    @Test
    public void testDiviseurs() {
        //given
        long val = 6;
        long[] tab = {1,6,2,3};
        Parfait instance = new Parfait();
        
        //when
        long[] result = instance.diviseurs(val);
        
        //then
        Assert.assertArrayEquals(tab,result);
        
        
    }
    
    /**
     * Test of diviseurs method, of class Parfait.
     */
    @Test
    public void testDiviseursCarré() {
        //given
        long val = 16;
        long[] tab = {1,16,2,8,4};
        Parfait instance = new Parfait();
        
        //when
        long[] result = instance.diviseurs(val);
        
        //then
        Assert.assertArrayEquals(tab,result);
        
        
    }

    /**
     * Test of estParfait method, of class Parfait.
     */
    @Test
    public void testEstParfaitOK() {
        //given
        long val = 6;
        Parfait instance = new Parfait();
        boolean expResult = true;
        
        //when
        boolean result = instance.estParfait(val);
        
        //then
        assertEquals(expResult, result);
    }
    
    
        /**
     * Test of estParfait method, of class Parfait.
     */
    @Test
    public void testEstParfaitNOK() {
        //given
        long val = 10;
        Parfait instance = new Parfait();
        boolean expResult = false;
        
        //when
        boolean result = instance.estParfait(val);
        
        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultOK() {
      //given
      long nb =6;
      Parfait instance = new Parfait(); 
      boolean result1 = instance.estParfait(nb);
      
      
      //when
        String result= instance.formaterResult(result1, nb);
        
      //then
    }
    
    /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultNOK() {
      //given
      long nb =7;
      Parfait instance = new Parfait(); 
      boolean result1 = instance.estParfait(nb);
      
      
      //when
        String result= instance.formaterResult(result1, nb);
        
      //then
    }
    
}
