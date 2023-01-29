class Notebook extends Item
{
    private int sections; // Ιδιαίτερο χαρακτηριστικό της υποκλάσης
    // Constructor
    public Notebook(String name, String description, double price, int stock, int id, int sections)
    {
        super(name, description, price, stock, id);
        sections=this.sections;
    }
    // Σύνηθεις Getter Methods
    int getSections()
    {return sections;}
    // Πλήρως ορισμένη μέθοδος getDetails
    String getDetails()
    {
        System.out.println(sections);
        return "Sections:"+getSections();
    }
}