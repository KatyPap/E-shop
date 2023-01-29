class Pencil extends Item
{
    private double tipSize; // Ιδιαίτερα χαρακτηριστικά --*
    private String type; // *-- της υποκλάσης.
    // Constructor
    public Pencil(String name, String description, double price, int stock, int id, double tipSize, String type)
    {
        super(name, description, price, stock, id);
        tipSize=this.tipSize;
        type=this.type;
    }
    // Σύνηθεις Getter Methods
    double getTipSize()
    {return tipSize;}
    String getType()
    {return type;}
    // Πλήρως ορισμένη μέθοδος getDetails
    String getDetails()
    {
        return "Tip Size:"+getTipSize()+"\nType:"+getType();
    }
}