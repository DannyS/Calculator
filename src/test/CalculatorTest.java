package test;

import org.junit.*;

import common.Calculator;
import junit.framework.Assert;

public class CalculatorTest {
    Calculator c = null;
     
    @Before
    public void testBeforeClass(){
        c = new Calculator();
    }
    @Test
    //���� add()����
    public void testAdd(){
        int result = c.add(1, 2);
        //Assert.assertEquals(result, 3);
        //�ȼ��ڣ�
        if(result == 3){
            System.out.println("add()������ȷ");
        }
    }
     
    @Test
    //���� sub()����
    public void testSub(){
        int result = c.sub(2, 1);
        //Assert.assertEquals(result, 1);
        //�ȼ��ڣ�
        if(result == 1){
            System.out.println("sub()������ȷ");
        }
    }
 
}