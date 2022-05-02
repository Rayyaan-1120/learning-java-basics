public class ExpressionOperators {
   public static void main(String[] args) {

    //*when we use any mathematical operators in java it truncates the value with no decimal point the fix for this solution is to use double or float
    
    int number = 5;
    
    //add
    number = number + 1;

    //subtract
    number = number - 1;

    //multiply
    number = number * 5;

    //divide
    number = number / 2;

    //short way

    number++;
    number--;

    System.out.println(number);

    double newnumber = 15;

    newnumber = (double) newnumber / 4;

    System.out.println(newnumber);

   } 
}
