import java.util.Scanner;

public class RobotDemo {

       public static void main(String[] args) {
        System.out.println("Enter ID for Robot1 \n");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        Robot r1 = new Robot(id); //3 Robots
           System.out.println("Enter ID for Robot2 \n");
           id = scanner.nextLine();
        Robot r2 = new Robot(id);
           System.out.println("Enter ID for Robot3 \n");
           id = scanner.nextLine();
        Robot r3 = new Robot(id);
           System.out.println("Enter a number between 1 and 10 \n");
           int iter = scanner.nextInt();
           while (iter <1 || iter >10)
           {
               System.out.println("Please re-enter a number between 1 and 10 \n");
               iter = scanner.nextInt();
           }
           int loop = iter;
           while(loop != 0) {
               r1.advance("East");
               r2.advance("South");
               r3.advance("West");
               loop--;
           }

           r1.display();
           r2.display();
           r3.display();
    }
}
