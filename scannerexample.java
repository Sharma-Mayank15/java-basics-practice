import java.util.Scanner;

public class scannerexample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1: System.out.println("Chai"); break;
            case 2: System.out.println("Cold Coffee"); break;
            case 3: System.out.println("Hot Coffee"); break;
            case 4: System.out.println("Cold Chai"); break;
            default: System.out.println("Unknown Choice");
        }
        scan.close();
    }
}
//switch example code
/* Points to note while using switch statements in Java:
•You cannot have duplicate case values.
•The datatype of the case must be the same as the data type of the switch.
•The break is useful for terminating the flow of the program after a particular case has been executed.
•If you do not use the break statement, the flow of the control progresses to the next case.
•The default case can appear anywhere inside the switch block. However, if it contains case blocks after it, a break
statement should be added after the default block otherwise the control would slip into the next layers of the block. */