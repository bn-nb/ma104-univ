package univ_mgmt;
import java.io.Serializable;

// Inheritance
class Student extends Person {
    private static final long serialVersionUID = 665l;
    public int hostelRoom;     public int lectureHall;

    public Student( int id, String name_, int join,
                    int room, int hall) {
        this.setBioData(id, name_, join);
        this.hostelRoom  = room; this.lectureHall = hall;
    }

    public void prettyPrintStudent() {
        System.out.println("Institute ID :\t" + this.instituteID);
        System.out.println("Name         :\t" + this.name);
        System.out.println("Year of Join :\t" + this.yearOfJoin);
        System.out.println("Hostel Room  :\t" + this.hostelRoom);
        System.out.println("Lecture Hall :\t" + this.lectureHall + "\n\n");
    }   
}
