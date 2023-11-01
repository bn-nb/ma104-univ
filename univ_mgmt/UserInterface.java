package univ_mgmt;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.reflect.Field;

// A class to handle Add, Remove, Print
// Operations through the console

public class UserInterface{
    private static Scanner input = new Scanner(System.in);

    public static void printStudents() {
        System.out.println("\n\nPRINTING STUDENTS");
        for (Student temp_stud : Database.studList)
            temp_stud.prettyPrintStudent();
    }
    
    public static void printProfessors() {
        System.out.println("\n\nPRINTING PROFESSORS");
        for (Professor temp_prof : Database.profList)
            temp_prof.prettyPrintProfessor();
    }
    
    public static void printBooks() {
        System.out.println("\n\nPRINTING BOOKS");
        for (Book temp_book : Database.bookList)
            temp_book.prettyPrintBook();
    }
    
    public static void printComputers() {
        System.out.println("\n\nPRINTING COMPUTERS");
        for (Computer temp_comp : Database.compList)
            temp_comp.prettyPrintComputer();
    }

    // Add a input.nextLine() after 
    // each integer input to clear \n
   
    public static void addStudent() {
        System.out.println("\n\nTO ADD A NEW STUDENT");
        System.out.print("Enter value for Institute ID :");
        int temp_instituteID = input.nextInt();
        input.nextLine();
        System.out.print("Enter value for Name         :");
        String temp_name = input.nextLine();
        System.out.print("Enter value for Year of Join :");
        int temp_yearOfJoin = input.nextInt();
        input.nextLine();
        System.out.print("Enter value for Hostel Room  :");
        int temp_hostelRoom = input.nextInt();
        input.nextLine();
        System.out.print("Enter value for Lecture Hall :");
        int temp_lectureHall = input.nextInt();
        input.nextLine();
        Database.studList.add(
            new Student(temp_instituteID, temp_name, temp_yearOfJoin,
                        temp_hostelRoom, temp_lectureHall)
            );
    }
    
    public static void addProfessor() {
        System.out.println("\n\nTO ADD A NEW PROFESSOR");
        System.out.print("Enter value for Institute ID :");
        int temp_instituteID = input.nextInt();
        input.nextLine();
        System.out.print("Enter value for Name         :");
        String temp_name = input.nextLine();
        System.out.print("Enter value for Year of Join :");
        int temp_yearOfJoin = input.nextInt();
        input.nextLine();
        System.out.print("Enter value for Subject      :");
        String temp_subject = input.nextLine();
        Database.profList.add(
            new Professor(temp_instituteID, temp_name,
                          temp_yearOfJoin, temp_subject)
            );
    }
    
    public static void addBook() {
        System.out.println("\n\nTO ADD A NEW BOOK");
        System.out.print("Enter value for Library S.No :");
        int temp_librarySNo = input.nextInt();
        input.nextLine();
        System.out.print("Enter value for Code-Name    :");
        String temp_objectName = input.nextLine();
        System.out.print("Enter value for TotalCost    :");
        int temp_cost = input.nextInt();
        input.nextLine();
        System.out.print("Enter value for Author Name  :");
        String temp_authorName = input.nextLine();
        System.out.print("Enter value for Shelf No.    :");
        int temp_shelfNo = input.nextInt();
        input.nextLine();
        Database.bookList.add(
            new Book(temp_librarySNo, temp_objectName, temp_cost,
                     temp_authorName, temp_shelfNo)
            );
    }
    
    public static void addComputer() {
        System.out.println("\n\nTO ADD A NEW COMPUTER");
        System.out.print("Enter value for Library S.No  :");
        int temp_librarySNo = input.nextInt();
        input.nextLine();
        System.out.print("Enter value for Code-Name     :");
        String temp_objectName = input.nextLine();
        System.out.print("Enter value for TotalCost     :");
        int temp_cost = input.nextInt();
        input.nextLine();
        System.out.print("Enter value for Specification :");
        String temp_specs = input.nextLine();
        System.out.print("Enter value for Room No.      :");
        int temp_roomNo = input.nextInt();
        input.nextLine();
        Database.compList.add(
            new Computer(temp_librarySNo, temp_objectName,
                         temp_cost, temp_roomNo, temp_specs)
            );
    }

    public static void removeStudent() {
        System.out.println("\n\nTO REMOVE EXISTING STUDENT");
        System.out.print("Enter Institute ID to remove: ");
        int temp_instituteID = input.nextInt();
        input.nextLine();
        for (int i=0; i < Database.studList.size() ; i++) {
            if (Database.studList.get(i).instituteID == temp_instituteID) {
                Database.studList.remove(i);
                System.out.println(temp_instituteID + " Removed !"); return;
            }
        }
        System.out.println("Given ID not found !");
    }

    public static void removeProfessor() {
        System.out.println("\n\nTO REMOVE EXISTING PROFESSOR");
        System.out.println("Enter Institute ID to remove: ");
        int temp_instituteID = input.nextInt();
        input.nextLine();
        for (int i=0; i < Database.profList.size() ; i++) {
            if (Database.profList.get(i).instituteID == temp_instituteID) {
                Database.profList.remove(i);
                System.out.println(temp_instituteID + " Removed !"); return;
            }
        }
        System.out.println("Given ID not found !");
    }

    public static void removeBook() {
        System.out.println("\n\nTO REMOVE EXISTING BOOK");
        System.out.println("Enter Library S.No. to remove: ");
        int temp_librarySNo = input.nextInt();
        input.nextLine();
        for (int i=0; i < Database.bookList.size() ; i++) {
            if (Database.bookList.get(i).librarySNo == temp_librarySNo) {
                Database.bookList.remove(i);
                System.out.println(temp_librarySNo + " Removed !"); return;
            }
        }
        System.out.println("Given ID not found !");
    }

    public static void removeComputer() {
        System.out.println("\n\nTO REMOVE EXISTING COMPUTER");
        System.out.println("Enter Library S.No. to remove: ");
        int temp_librarySNo = input.nextInt();
        input.nextLine();
        for (int i=0; i < Database.compList.size() ; i++) {
            if (Database.compList.get(i).librarySNo == temp_librarySNo) {
                Database.compList.remove(i);
                System.out.println(temp_librarySNo + " Removed !"); return;
            }
        }
        System.out.println("Given ID not found !");
    }   
}
