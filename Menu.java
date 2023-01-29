import java.util.Scanner;

class Menu
{
    private String userType, email, name; // Data that will help identify our user
    //Constructor
    public Menu()
    {
    }
    void Welcome()
    {
        // Χαιρετισμός και ταυτοποίηση του χρήστη
        System.out.println("Welcome to our shop.");
        System.out.println("Wanderer of the internet, what's your asociation with our shop?");
        System.out.println("Owner/owner\t or\t Buyer/buyer?\t Other/other");
        System.out.println("Answer with one of the above.");
        Scanner input1=new Scanner(System.in);
        userType=input1.next();
        // Έλγχος για το εάν η απάντηση του χρήστη ήταν από τις αναμενώμενες ή όχι
        if (userType!="Owner" && userType!="owner" && userType!="Buyer" && userType!="buyer" && userType!="Other" && userType!="other")
        {
            do
            {
                System.out.println("You must answer with either:\n Owner/owner\t or\t Buyer\buyer");
                Scanner input2=new Scanner(System.in);
                userType=input2.next();
            } while (userType!="Owner" && userType!="owner" && userType!="Buyer" && userType!="buyer");
        }
        // Προσδιορισμός του χρήστη
        if (userType!="Owner" || userType!="owner")
        {
            System.out.println("So you are an owner. Welcome boss! Can you give me your email and name?");
            Scanner input3=new Scanner(System.in);
            email=input3.next();
            Scanner input4=new Scanner(System.in);
            name=input4.next();
            Owner o=new Owner(email, name); 
        }
        else if (userType!="Buyer" || userType!="buyer")
        {
            System.out.println("So you are a buyer. Can you give me your email and name?");
            Scanner input3=new Scanner(System.in);
            email=input3.next();
            Scanner input4=new Scanner(System.in);
            name=input4.next();
            Buyer b=new Buyer(email, name);
        }
        // Προσθήκη νέου Owner ή Buyer
        else
        {
            System.out.println("Do you wish to join our community?");                
            System.out.println("What's your name?");
            Scanner input=new Scanner(System.in);
            name=input.next();                
        }
    }
}