package CollectionsFramework.KitapSiralayici;


import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nKITAPLAR1 Sorted by Book Name : \n");

        TreeSet<Book> kitaplar = new TreeSet<Book>();
        kitaplar.add(new Book("Les Pardaillan      ", "Michel Zevaco             ", "1907", 706));
        kitaplar.add(new Book("Crime and Punishment", "Fyodor Dostoyevsky        ", "1866", 576));
        kitaplar.add(new Book("A Hero Of Our Time  ", "Mikhail Lermontov         ", "1853", 156));
        kitaplar.add(new Book("Faust               ", "Johann Wolfgang von Goethe", "1790", 512));
        kitaplar.add(new Book("The Unfettered Mind ", "Takuan Soho               ", "1986", 144));
        for (Book kitap: kitaplar) {
            System.out.println("Book Name : " + kitap.getBookName() + "\t\tAuthor Name : " + kitap.getAuthorName() +
                    "\t\tPublication Year : " + kitap.getPublicationYear() + "\t\tNumber of Pages : " + kitap.getNumberOfPages());
        }


        System.out.println("\n\nKITAPLAR2 Sorted by Author Name : \n");


        TreeSet<Book> kitaplar2 = new TreeSet<Book>(Book::compare);
        kitaplar2.add(new Book("Les Pardaillan      ", "Michel Zevaco             ", "1907", 706));
        kitaplar2.add(new Book("Crime and Punishment", "Fyodor Dostoyevsky        ", "1866", 576));
        kitaplar2.add(new Book("A Hero Of Our Time  ", "Mikhail Lermontov         ", "1853", 156));
        kitaplar2.add(new Book("Faust               ", "Johann Wolfgang von Goethe", "1790", 512));
        kitaplar2.add(new Book("The Unfettered Mind ", "Takuan Soho               ", "1986", 144));
        for (Book kitap: kitaplar2) {
            System.out.println("Book Name : " + kitap.getBookName() + "\t\tAuthor Name : " + kitap.getAuthorName() +
                    "\t\tPublication Year : " + kitap.getPublicationYear() + "\t\tNumber of Pages : " + kitap.getNumberOfPages());
        }

    }
}
class Book implements Comparable<Book>{
    private String bookName;
    private String authorName;
    private String publicationYear;
    private int numberOfPages;

    public Book(String bookName, String authorName, String publicationYear, int numberOfPages) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public int compareTo(Book o) {
        int solution = this.getBookName().compareTo(o.getBookName());
        return solution;
    }

    public int compare(Book o){
        int solution = this.getAuthorName().compareTo(o.getAuthorName());
        return solution;
    }
}
