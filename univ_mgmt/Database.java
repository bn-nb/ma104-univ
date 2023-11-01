package univ_mgmt;
import java.util.ArrayList;
import java.io.*;

class Database {
    // A class of static methods for
    // reading and writing data in .ser files
    // We can use add method in Arraylist, inside a block only
    public static ArrayList<Student> 
        studList = new ArrayList<Student>(20);
    public static ArrayList<Professor> 
        profList = new ArrayList<Professor>(20);
    public static ArrayList<Computer> 
        compList = new ArrayList<Computer>(20);
    public static ArrayList<Book> 
        bookList = new ArrayList<Book>(20);

    // Refer : "Java Generics are different from C++ Templates"
    // Use directory with respect to the folder containing the package folder
    // Eg: "univ_mgmt/Books.ser", "univ_mgmt/Students.ser"
    // Try-with-resources closes streams automatically
    // We just need to catch the errors for compilation
        
    public static<TYPE> void writeData(String directory, ArrayList<TYPE> dataList) {
        try(
                FileOutputStream tempDB
                = new FileOutputStream(directory, false);
                // true to append, false to overwrite
                ObjectOutputStream tempOUT
                = new ObjectOutputStream(tempDB);
            ) {            
            // (hax for auto in C++)
            for (TYPE tempObj: dataList) {
                tempOUT.writeObject(tempObj);
            }
        }
        catch (IOException ioex) {}
    }

    public static<TYPE> void readData(String directory, ArrayList<TYPE> dataList) {
        try(
                FileInputStream tempDB
                = new FileInputStream(directory);
                ObjectInputStream tempIN
                = new ObjectInputStream(tempDB);
            ) {
            while(true) {
                @SuppressWarnings("unchecked")
                TYPE tempObj = (TYPE) tempIN.readObject();
                dataList.add(tempObj);
            }            
        }
        catch (IOException ioex) {}
        catch (ClassNotFoundException clsnf) {}
    }
}
