import org.junit.Test;
import static org.junit.Assert.*;


public class MainTest{

  @Test 


public void testNothing(){

    
}



@Test
public void testSomeStuff(){

  int a = 2;
  int b = 3;
  
 assertEquals( "1. test failed", 5, (a + b) );

  
  int numberOne = 37;
  int numberTwo = 45;
  boolean equationTruth;
  
  if ( numberOne > numberTwo ){
    equationTruth = true;
  }else {
    equationTruth = false;
  }

 

  String s = "";
  assertNotNull( "2. test failed", new String() );


   assertFalse("3. test failed", equationTruth);

}



}