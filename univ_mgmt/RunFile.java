package univ_mgmt;
import java.util.Scanner;

/*
* 
* Academic Management System
* 
* This project uses the following classes:
* 
* Person abstract class
* Student class
* Professor class
* 
* LibraryObject abstract class
* Computer class
* Book class
* 
*/

public class RunFile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Database.readData("univ_mgmt/Students.ser", Database.studList);
        Database.readData("univ_mgmt/Professors.ser", Database.profList);
        Database.readData("univ_mgmt/Books.ser", Database.bookList);
        Database.readData("univ_mgmt/Computers.ser", Database.compList);

        System.out.println("Welcome to Academic Management System\n\n");

        String mainPrompt = "\n1. Print Records\n2. Add Record\n3. Remove Record\nEnter main choice: ";
        String sub_Prompt = "\n1. Students\n2. Professors\n3. Books\n4. Computers\nEnter sub choice: ";
        int mainChoice, sub_Choice; boolean flag = true;

        while (flag) {
            System.out.print(mainPrompt); mainChoice = input.nextInt(); input.nextLine();
            System.out.print(sub_Prompt); sub_Choice = input.nextInt(); input.nextLine();
            switch(mainChoice) {
                case 1: {
                    switch(sub_Choice) {
                        case 1: UserInterface.printStudents(); break;
                        case 2: UserInterface.printProfessors(); break;
                        case 3: UserInterface.printBooks(); break;
                        case 4: UserInterface.printComputers(); break;
                    }
                }; break;

                case 2: {
                    switch(sub_Choice) {
                        case 1: UserInterface.addStudent(); break;
                        case 2: UserInterface.addProfessor(); break;
                        case 3: UserInterface.addBook(); break;
                        case 4: UserInterface.addComputer(); break;
                    }
                }; break;

                case 3: {
                    switch(sub_Choice) {
                        case 1: UserInterface.removeStudent(); break;
                        case 2: UserInterface.removeProfessor(); break;
                        case 3: UserInterface.removeBook(); break;
                        case 4: UserInterface.removeComputer(); break;
                    }
                }; break;

                default: {
                    System.out.println("\nWrong Choice ! Exiting...");
                    flag = false; 
                }
            }
        }

        Database.writeData("univ_mgmt/Students.ser", Database.studList);
        Database.writeData("univ_mgmt/Professors.ser", Database.profList);
        Database.writeData("univ_mgmt/Books.ser", Database.bookList);
        Database.writeData("univ_mgmt/Computers.ser", Database.compList);
    }
}
