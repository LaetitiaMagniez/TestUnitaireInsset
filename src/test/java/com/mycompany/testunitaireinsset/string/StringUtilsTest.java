/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author insset
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
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
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValideOK() {
      String str = "ma chaine";
      StringUtils instance = new StringUtils();
      boolean test = instance.isChaineValide(str);
      Assert.assertEquals(true,test);
    }
    
    @Rule
    public ExpectedException thrownException = ExpectedException.none();
    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValideNOK() throws Exception{
      String str = "m";
      StringUtils instance = new StringUtils();
      thrownException.expect(IllegalArgumentException.class);
      thrownException.expectMessage("Il faut au moins deux caractere en entrée");
    
      boolean test= instance.isChaineValide(str);
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
       //given
       String str = "ma nouvelle chaine";
       StringUtils instance = new StringUtils();
       String test = instance.inverse(str);
       Assert.assertNotSame(test, instance, test);
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeOK() {
       //given
       String str = "été";
       StringUtils instance = new StringUtils();
       boolean test = instance.isPalindrome(str);
       Assert.assertTrue("ok",test);
    }
    
     /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeNOK() {
       //given
       String str = "test";
       StringUtils instance = new StringUtils();
       
       //when
       boolean test = instance.isPalindrome(str);
       
       //then
       Assert.assertFalse("NOK",test);
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        //given
        String str = "test";
        StringUtils instance = new StringUtils();
        Map<String, Integer>expectedResult = new TreeMap<>();
        expectedResult.put(String.valueOf('t'),2);
        expectedResult.put(String.valueOf('e'),1);
        expectedResult.put(String.valueOf('s'),1);
        
        System.out.println(expectedResult);       
        
        //when
        Map<String, Integer>result = instance.compterOccurences(str);
        
        //then
        Assert.assertEquals(expectedResult,result);
        
        
    }
    
}
