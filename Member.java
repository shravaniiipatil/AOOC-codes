package LibraryManagement;
public class Member 
{
    String name;
    int id;

    public Member(String n, int i) 
    {
        name = n;
        id = i;
    }

    public void showMember() 
    {
        System.out.println("Member: " + name + ", ID: " + id);
    }
}
