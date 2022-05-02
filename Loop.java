import java.util.Scanner;

class Loop {
    public static void main(String[] args) {
        
        //*While Loop
        //*while loop executes a block of code as long as a it's condition remains true 
        //*do while loop
        //*it works almost the same as while loop but it runs one time always and after that it checks the while condition

        Scanner scanner = new Scanner(System.in);

    //     System.out.println("Enter Your Name");
    //     String name = "";
    //     while(name.length() == 0){
    //         System.out.println("Please Enter Your Name");
    //         name = scanner.nextLine();
    //     }

    //     System.out.println("hello your name is" + name);

    //    int age = 0;

    //    System.out.println("Enter Your age");
    //    do{
    //       System.out.println("please enter your age");
    //       age = scanner.nextInt();
    //       scanner.nextLine();
    //    }while(age == 0);

    //    System.out.println("your Name is " + name + "Your age is " + age);


    //    //*for loop
    //    // for loop executes a block of code a limited amount of times 

    //    System.out.println("How many times you want this loop to be run");
    //    int ntimes = 0;
    //    ntimes = scanner.nextInt();
    //    if(ntimes > 0){
    //     for (int i = 0; i<=ntimes; i++) {
    //         System.out.println(i);
    //     }
    //    }

    //    System.out.println("Your Loop Has been Finished with " + ntimes + " times as per your request");

       //*nested loops // Loop inside a loop
       //*When inner for loop completes its whole loop that means that the outer for loop completes its first iteration
       //*and after every iteration of outer for loop the inner for loop will run completely every time


       //*making a rectangle with nested for loop

       int rows;
       int columns;
       String symbol = "";

       System.out.println("Enter The Number Of rows");
       rows = scanner.nextInt();
       System.out.println("Enter The Number Of columns");
       columns = scanner.nextInt();
       System.out.println("Enter The Symbol to Use");
       symbol = scanner.next();

       for(int i = 0; i <= rows; i++){
          System.out.println();
          for(int j = 0; j <= columns; j++){
              System.out.print(symbol);
          }
       }



       scanner.close();
       


    }
}
