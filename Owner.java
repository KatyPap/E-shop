class Owner extends User
{
    private boolean isAdmin=true;
    // Constructor
    public Owner(String email, String name)
    {
        super(email, name);
    }
    // Πλήρης ορισμένη και εκτελέσιμη getInfo
    void getInfo()
    {
        System.out.println(getName() + " is the owner of the shop");
        System.out.println(getEmail());
    }
    // Get Method για τη μεταβλητή isAdmin
    boolean getAdminState()
    {return isAdmin;}
}