package univ_mgmt;
import java.io.Serializable;

// Inheritance
class Computer extends LibraryObject {
    private static final long serialVersionUID = 431l;
    public String specs;         public int    roomNo;

    public Computer(int sno, String name_, int cost_,
                    int room, String _specs) {
        this.setDetails(sno, name_, cost_);
        this.specs = _specs; this.roomNo = room;
    }

    public void prettyPrintComputer() {
        System.out.println("Library S.No :\t" + this.librarySNo);
        System.out.println("Code-Name    :\t" + this.objectName);
        System.out.println("TotalCost    :\t" + this.cost);
        System.out.println("Specification:\t" + this.specs);
        System.out.println("Room No.     :\t" + this.roomNo + "\n\n");
    }
}
