package univ_mgmt;
import java.io.Serializable;

// Inheritance
class Professor extends Person {
    private static final long serialVersionUID = 986l;
    public String subject;

    public Professor(int id, String name_,
                    int join, String sub) {
        this.setBioData(id, name_, join);  this.subject     = sub;        
    }

    public void prettyPrintProfessor() {
        System.out.println("Institute ID :\t" + this.instituteID);
        System.out.println("Name         :\t" + this.name);
        System.out.println("Year of Join :\t" + this.yearOfJoin);
        System.out.println("Subject      :\t" + this.subject + "\n\n");
    }   
}
