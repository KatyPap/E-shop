import java.util.*;

class EShop
{
    private String name;
    private Owner owner;
    private ArrayList<Item> itemsList=new ArrayList<Item>();
    private ArrayList<Buyer> buyersList=new ArrayList<Buyer>();
    // Constructor
    public EShop()
    {
        name="EShop";        
    }
    // Methods
    void addItem(Item ni)
    {itemsList.add(ni);}
    Item getItemByld(int id)
    {
        int i=0;
        while(itemsList.get(i).getID()!=id)
        {i++;}
        return itemsList.get(i); 
    }
    void removeItem(Item ri)
    {itemsList.remove(ri);}
    void addBuyer(Buyer nb)
    {buyersList.add(nb);}
    void removeBuyer(Buyer rb)
    {buyersList.remove(rb);}
    void showCategories()
    {
        System.out.println("Categories:\n"+"Pen\t"+"Pencil\t"+"Notebook\t"+"Paper\t");
    }
    void showProduct(Item i)
    {i.getDetails();}
}