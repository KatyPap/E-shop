class Paper extends Item
{
    private int weight, pages; // Ιδιαίτερο χαρακτηριστικό της υποκλάσης
    // Constructor
    public Paper(String name, String description, double price, int stock, int id, int weight, int pages)
    {
        super(name, description, price, stock, id);
        weight=this.weight;
        pages=this.pages;
    }
    //Σύνηθεις Getter Methods
    int getWeight()
    {return weight;}
    int getPages()
    {return pages;}
    // Πλήρως ορισμένη μέθοδος getDetails
    String getDetails()
    {
        return "Weight:"+getWeight()+"\nPages:"+getPages();
    }
}