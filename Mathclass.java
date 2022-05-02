import java.util.Scanner;

public class Mathclass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double x = 3.15;
        double y = -20;
        double z = 15;

       double max = Math.max(x, y);
       double min = Math.min(x, y);

       double absolute = Math.abs(y);
       double squareroot = Math.sqrt(z);
       double rounded = Math.round(x);
       double ceiled = Math.ceil(x);
       double floored = Math.floor(x);
       int powered = (int) Math.pow(z, 2);


       

       System.out.println(max);
       System.out.println(min);
       System.out.println(absolute);
       System.out.println(squareroot);
       System.out.println(rounded);
       System.out.println(ceiled);
       System.out.println(floored);
       System.out.println(powered);

       //*Simple Hypotenus function

       System.out.println("Please tell the Side X");
       int sidex = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Please tell the Side Y");
       int sidey = scanner.nextInt();
       scanner.nextLine();

       double sumofbothsides = (double) Math.pow(sidex, 2) + Math.pow(sidey, 2);
       double hypotenuse = Math.sqrt(sumofbothsides);

       System.out.println("Your hypotenuse is" + hypotenuse);

       scanner.close();
        

    }
}