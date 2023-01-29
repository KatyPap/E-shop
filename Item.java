abstract class Item
{
    private String name, description;
    private double price;
    private int stock, id;
    // Constructor
    public Item(String name, String description, double price, int stock, int id)
    {
        name=this.name;
        description= this.description;
        price=this.price;
        stock=this.stock;
        id=this.id;
    }
    // Σύνηθεις Getter Methods
    String getName()
    {return name;}
    String getDescription()
    {return description;}
    double getPrice()
    {return price;}
    int getStock()
    {return stock;}
    int getID()
    {return id;}
    // Μέθοδος getBasicInfo που κάνει return όλες τις βασικές τιμές
    String getBasicInfo()
    {
        return getName()+"\nDescription:"+getDescription()+"\nPrice:"+getPrice()+"\nStock:"+getStock()+"\nID"+getID();
    }
    // Η getInfo δηλώνεται απλά σαν abstract εδώ. Την ορίζουμε πλήρως στις υποκλάσεις --*
    abstract String getDetails(); // *-- για να επιστρέφονται οι λεπτομέρειες για κάθε ιδιαίτερο αντικείμενο
    // @override
    public String toString()
    {
        return String.format(getBasicInfo() + getDetails());
    }
}