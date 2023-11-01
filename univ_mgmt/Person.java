package univ_mgmt;
import java.io.Serializable;

abstract class Person implements Serializable{
    // Abstraction, Encapsulation
    private static final long serialVersionUID = 98765l;
    public int instituteID = 0;
    public String name = "";
    public int yearOfJoin = 0;

    public void setBioData(int id, String name_,int join) {
        this.instituteID = id;
        this.name        = name_;
        this.yearOfJoin  = join;        
    }
}
