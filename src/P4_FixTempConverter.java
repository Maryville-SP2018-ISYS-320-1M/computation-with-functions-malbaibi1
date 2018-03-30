/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

/*
 What were the errors you found?
 The method does not return any value and it is of type void. So sorrecting these errors make it works.
 
 */

public class P4_FixTempConverter {
 public static void main(String[] args) {
  double tempf = 98.6;
  double tempc = 0.0;
  tempc = ftoc(tempf, tempc);
  System.out.println("Body temp in C is: " + tempc);
 }

 // converts Fahrenheit temperatures to Celsius
 public static double ftoc(double tempf, double tempc) {
       tempc = (tempf - 32) * 5 / 9;
       return tempc;
    }
}