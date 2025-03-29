import LibraryManagement.Book;
import LibraryManagement.Member;

class LibrarySystem 
{
    public static void main(String args[]) {
        Book b = new Book("The Alchemist", "Paulo Coelho", "12345");
        Member m = new Member("Shravani Patil", 24);

        b.showBook();
        m.showMember();
    }
}
