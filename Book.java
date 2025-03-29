package LibraryManagement;
public class Book 
{
    String title, author, ISBN;

    public Book(String t, String a, String i) 
    {
        title = t;
        author = a;
        ISBN = i;
    }

    public void showBook() 
    {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}
