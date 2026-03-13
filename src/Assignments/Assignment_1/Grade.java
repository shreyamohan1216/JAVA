package Assignment_1;
// program that takes a student's marks as input and prints the corresponding
//grade (A, B, C, D, or F) using a switch statement.
import java.util.Scanner;
public class Grade {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks (0-100): ");
            int marks = sc.nextInt();
            char grade;
            switch (marks / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
            }

            System.out.println("Your Grade is: " + grade);
            sc.close();
        }
    }

