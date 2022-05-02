import java.util.Scanner;

class IfelseandSwitch {

    public static void main(String[] args) {
        
        int x = 5;

        if(x < 18){
            System.out.println("You are not allowed in the party");
        }else if(x == 18){
            System.out.println("You are allowed in the party");
        }else if(x > 18){
            System.out.println("You are definitely allowed in the party");
        }else{
            System.out.println("Notinng");
        }

        String day = "Sunday";

        switch(day){
            case "Monday":
            System.out.println("Today Is Monday");
            break;
            case "Tuesday":
            System.out.println("Today Is Tuesday");
            break;
            case "Wednesday":
            System.out.println("Today Is Wednesday");
            break;
            case "Thursday":
            System.out.println("Today Is Thursday");
            break;
            case "Friday":
            System.out.println("Today Is Friday");
            break;
            case "Saturday":
            System.out.println("Today Is Saturday");
            break;
            case "Sunday":
            System.out.println("Today Is Sunday");
            break;
            default:
            System.out.println("No day is today");
        }

       Scanner scanner = new Scanner(System.in);

       System.out.println("You are playing the game press q or Q to continue");
       String response = scanner.next();

       if(response.equals("q") || response.equals("Q")){
           System.out.println("You have quitted the game");
       }else{
           System.out.println("You are still Plying");
       }

       scanner.close();

    }
    
}
