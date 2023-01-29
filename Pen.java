class Pen extends Item
{
    private String color; // Ιδιαίτερα χαρακτηριστικά --*
    private double tipSize; // *-- της υποκλάσης.
    // Constructor
    public Pen(String name, String description, double price, int stock, int id, String color, double tipSize)
    {
        super(name, description, price, stock, id);
        color=this.color;
        tipSize=this.tipSize;
    }
    // Σύνηθεις Getter Methods
    String getColor()
    {return color;}
    double getTipSize()
    {return tipSize;}
    // Πλήρως ορισμένη μέθοδος getDetails
    String getDetails()
    {
        return "Color:" +getColor()+"\nTipSize:"+getTipSize();
    }
}