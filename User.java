import java.util.Scanner;

abstract class User
{
    private String email, name;
    // Constructor
    public User(String email, String name)
    {
        email=this.email;
        name=this.name;
    }
    // Σύνηθεις Getter Methods
    String getName()
    {return name;}
    String getEmail()
    {return email;}
    // Η getInfo δηλώνεται απλά σαν abstract εδώ.
    abstract void getInfo(); // Την ορίζουμε πλήρως στις υποκλάσεις
}