import java.io.*;
public class main
{
    public static void main(String[] args)
    {
        // Πρώτα δημιουργία του EShop
        EShop e=new EShop();
        // Δημιουργία χρηστών (Buyers και ένας Owner)
        Owner o=new Owner("SmithInc@outlook.com", "Erwin");
        Buyer b2=new Buyer("YeagerBomb@outlook.com", "Eren");
        Buyer b1=new Buyer("Batman@outlook.com", "Levi");
    }
}