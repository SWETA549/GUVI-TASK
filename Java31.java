package task3;

import java.util.Scanner;

class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void display() {
        System.out.println(bookID + " " + title + " " + author + " " + isAvailable);
    }
}

class Library {
    private Book[] books;
    private int count;

    public Library() {
        books = new Book[5];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library Full");
        }
    }

    public void removeBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == id) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    public Book searchBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == id) {
                return books[i];
            }
        }
        return null;
    }

    public void displayBooks() {
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
}

public class Java31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1.Add 2.Remove 3.Search 4.Display 5.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                int id = sc.nextInt();
                sc.nextLine();
                String title = sc.nextLine();
                String author = sc.nextLine();
                boolean available = sc.nextBoolean();
                library.addBook(new Book(id, title, author, available));
            } else if (choice == 2) {
                int id = sc.nextInt();
                library.removeBook(id);
            } else if (choice == 3) {
                int id = sc.nextInt();
                Book b = library.searchBook(id);
                if (b != null) {
                    b.display();
                } else {
                    System.out.println("Not Found");
                }
            } else if (choice == 4) {
                library.displayBooks();
            } else {
                break;
            }
        }
    }
}
