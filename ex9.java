
class LibraryItem {
    int itemId;
    String title;

    LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    void displayDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
    }
}

class Book extends LibraryItem {
    String author;
    String publisher;

    Book(int id, String title, String author, String publisher) {
        super(id, title);
        this.author = author;
        this.publisher = publisher;
    }

    void displayBook() {
        displayDetails();
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
    }
}

class EBook extends Book {
    double fileSize;

    EBook(int id, String title, String author,
          String publisher, double fileSize) {
        super(id, title, author, publisher);
        this.fileSize = fileSize;
    }

    void downloadBook() {
        displayBook();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("EBook downloaded successfully.");
    }
}

public class ex9 {
    public static void main(String[] args) {
        EBook e = new EBook(
            101, "Java Programming", "James Gosling",
            "Pearson", 15.5
        );

        e.downloadBook();
    }
}
