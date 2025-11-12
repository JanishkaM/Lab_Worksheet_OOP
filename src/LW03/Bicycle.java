package LW03;

class Bicycle {
    // Data Member: The Bicycle "has-a" Owner object
    private final Owner owner;

    // Constructor: Initializes the data member
    public Bicycle() {
        // 1. FIX: You MUST create the 'owner' object before you can use it!
        this.owner = new Owner();

        // 2. FIX: Now you can set its properties
        this.owner.setOwnerName("Unknown");
        this.owner.setPhoneNo("Unknown"); // Also good to initialize this
    }

    public Bicycle(String name, String num) {
        // 1. FIX: Create the 'owner' object
        this.owner = new Owner();

        // 2. FIX: Use the 'owner' object's methods to set its data
        this.owner.setOwnerName(name);
        this.owner.setPhoneNo(num);
    }

    // Returns the name of this bicycle's owner
    public String getOwnerName() {
        // FIX: Delegate the call! Ask the 'owner' object for its name.
        return this.owner.getOwnerName();
    }

    // Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        // FIX: Delegate the call! Tell the 'owner' object to set its name.
        this.owner.setOwnerName(name);
    }

    public String getPhoneNo() {
        // FIX: Delegate the call!
        return this.owner.getPhoneNo();
    }

    // FIX: Renamed the method from setOwnerName to setPhoneNo
    public void setPhoneNo(String num) {
        // FIX: Delegate the call!
        this.owner.setPhoneNo(num);
    }
}