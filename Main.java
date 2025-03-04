//Name : Akhil Chivukula
//Prn : 23070126009
//Batch : AIML A1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        
         while (true) {
            System.out.println("\n---- Student Management System ----");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Search by Position");
            System.out.println("6. Update Student Details");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
             
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: sm.addStudent(); break;
                case 2: sm.displayAllStudents(); break;
                case 3: sm.searchByPRN(); break;
                case 4: sm.searchByName(); break;
                case 5: sm.searchByPosition(); break;
                case 6: sm.updateStudent(); break;
                case 7: sm.deleteStudent(); break;
                case 8: System.out.println("Exiting program..."); scanner.close(); return;
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }
}