import java.util.Scanner;
class Buyer extends User
{
    private static int bonus; // Αναπαριστά τους πόντους του πελάτη
    private static String buyerCategory; // Πιθανές τιμές: bronze, silver, gold
    // Constructor
    public Buyer(String email, String name)
    {
        super(name, email);
        bonus=0;
        buyerCategory="BRONZE";
    }
    // Get Methods για τις τιμές των πεδίων
    static int getBonus()
    {return bonus;}
    String getBuyerCategory()
    {return buyerCategory;}
    // Methods που επεξεργάζονται και αλλάζουν τις τιμές των μεταβλητών μας
    void awardBonus()
    {
        bonus = bonus++;
        Buyer.setbuyerCategory();
    }
    static void setbuyerCategory()
    {
        if (getBonus()>100 && getBonus()<200)
        {
            buyerCategory="SILVER";
        }
        else if (getBonus()>200)
        {
            buyerCategory="GOLD";
        }
        System.out.println(buyerCategory);
    }
    void placeOrder()
    {
        
    }
    // Πλήρης ορισμένη και εκτελέσιμη getInfo
    void getInfo()
    {
        System.out.println(getName() + " is a buyer.");
        System.out.println("Email: "+getEmail());
        System.out.println("Buyer Category: "+getBuyerCategory());
    }
}