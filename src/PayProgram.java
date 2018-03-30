/*
 ISYS 320
 Name(Mansoor Albaibi):
 Date:31-03-2018 
*/

public class PayProgram {

 public static void main(String[] args) {
  double out; 
  out = computeScientificValue( 5.50, 6);
  System.out.println(out);
  out = computeScientificValue( 4.00, 11);
  System.out.println(out);

 }
 
  public static double computeScientificValue(double money, int hours) {
    double pay;
    if (hours<9)
      pay = money*hours;
    else
      pay = money*8 + money*1.5*(hours-8);
    return pay;

}
}