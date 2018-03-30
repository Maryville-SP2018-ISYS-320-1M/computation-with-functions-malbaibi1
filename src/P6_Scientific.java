/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018
*/

public class P6_Scientific {

 public static void main(String[] args) {
  double out; 
  out = computeScientificValue( 6.5, 3);
  System.out.println(out);

 }
 
  public static double computeScientificValue(double base, int exponent) {
    int n = 10;   
    for (int i=1 ; i<exponent ; i++)                                        //loop to get base 10 exponent value
       n = n * 10;
    double x = base * n;                                      
    return x;

}
}