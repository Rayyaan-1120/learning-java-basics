import java.util.Scanner;

public class Userinput {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        //*if we use nextint then it does not reed the whole line and skips to the next line so it cannot react other scanner input
        //?solution for now is to use scanner.nextline() after nextint

        System.out.println("What is your name");
        String name = scanner.nextLine();
        System.out.println("What is your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourite food");
        String food = scanner.nextLine();


        System.out.println("Your Name is "+ name);
        System.out.println("Your age is "+ age);
        System.out.println("Your fav food is "+ food);

        scanner.close();

    }
}
