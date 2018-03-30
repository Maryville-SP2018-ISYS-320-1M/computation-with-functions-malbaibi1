/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018
*/

/*
 5. Your predicted expression values:
 
  1.     1.6              //absolute value of number
  2.     36.0             //power of a number
  3.     7                //maximum of a number
  4.     -5               //minimum of a number
  5.     5                //minimum of a number
  6.     8.0              //square root of a number
  7.     17.0             //solving the given equation
  8.     14.0             //solving a given equation
  
  
 */
public class P5_TestMathFunctionCalls {

 public static void main(String[] args) {
  System.out.println(" 1. " + Math.abs(-1.6) );
  System.out.println(" 2. " + Math.pow( 6, 2) );
  System.out.println(" 3. " + Math.max( 7, 3) );
  System.out.println(" 4. " + Math.min( -2, -5) );
  System.out.println(" 5. " + Math.min( 6, 3 + 2) );
  System.out.println(" 6. " + Math.sqrt( 64) );
  System.out.println(" 7. " + (13 + Math.abs(-7) - Math.pow( 2, 3) + 5) );
  System.out.println(" 8. " + Math.max(18 - 5, Math.ceil( 4.6*3)));
  
 }

}