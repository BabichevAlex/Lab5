/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import java.awt.Rectangle;
import lab5.Lab5;
import lab5.Rectangle;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1710502
 */
public class RectanleTest {
    
    public RectanleTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void RectangleTset() {
         Rectangle rec = new Rectangle();
         double x = 2, y = 4;
         double res = 8;
         double g = rec.areaCalculator(x, y);
         Assert.assertEquals(res, g, 0.5);
     }
     
}
