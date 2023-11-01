package univ_mgmt;
import java.io.Serializable;

abstract class LibraryObject implements Serializable{
    // Abstraction, Encapsulation
    private static final long serialVersionUID = 43210l;
    public int librarySNo;
    public String objectName;
    public int cost;

    public void setDetails(int sno, String name, int cost_) {
        this.librarySNo = sno;
        this.objectName = name;
        this.cost       = cost_;
    }
}
