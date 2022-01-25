import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.println("How many students for course A?");
        Integer numberOfStudentsA = scan.nextInt();
        for (int i = 0; i < numberOfStudentsA; i++) {
            System.out.print("Enter the code of student: ");
            a.add(scan.nextInt());
        }

        System.out.println("How many students for course B?");
        Integer numberOfStudentsB = scan.nextInt();
        for (int i = 0; i < numberOfStudentsB; i++) {
            System.out.print("Enter the code of student: ");
            b.add(scan.nextInt());
        }

        System.out.println("How many students for course C?");
        Integer numberOfStudentsC = scan.nextInt();
        for (int i = 0; i < numberOfStudentsC; i++) {
            System.out.print("Enter the code of student: ");
            c.add(scan.nextInt());
        }

        System.out.println("Students of class A: " + a);
        System.out.println("Students of class B: " + b);
        System.out.println("Students of class C: " + c);
        System.out.println("Total of students: " + (a.size() + b.size() + c.size()));
    }
}