import java.util.*;
public class Main{
    
    public static void main(String[] args) {
        System.out.println("Hello Friends\nWelcome to Our New Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Choose below Options");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Divide");
        System.out.println("5.Reminder");
        float button = sc.nextFloat();
        if (button == 1) {
            System.out.println(a+b);
            }else if(button == 2){
                System.out.println(a-b);
            }else if(button == 3){
                System.out.println(a * b);
            }else if(button == 4){
                System.out.println(a / b);
            }else if(button == 5){
                System.out.println(a % b);
            }else {
                System.out.println("Invalid Button Pressed!");

            }
        
        }

        
    }
