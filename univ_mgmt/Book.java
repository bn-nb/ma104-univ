package univ_mgmt;
import java.io.Serializable;

// Inheritance
class Book extends LibraryObject {
    private static final long serialVersionUID = 110l;
    public String authorName;   public int    shelfNo;

    public Book(int sno, String name_, int cost_,
                String author, int shelf) {
        this.setDetails(sno, name_, cost_);
        this.authorName = author; this.shelfNo = shelf;
    }

    public void prettyPrintBook() {
        System.out.println("Library S.No :\t" + this.librarySNo);
        System.out.println("Code-Name    :\t" + this.objectName);
        System.out.println("TotalCost    :\t" + this.cost);
        System.out.println("Author Name  :\t" + this.authorName);
        System.out.println("Shelf No.    :\t" + this.shelfNo + "\n\n");
    }
}
