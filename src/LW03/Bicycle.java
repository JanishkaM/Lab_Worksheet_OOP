package LW03;

class Bicycle {
    // Data Member
    private Owner owner;

    //Constructor: Initializes the data member
    public Bicycle() {
        owner.setOwnerName("Unknown");
    }

    public Bicycle(String name, String num) {
        ownerName = name;
        phoneNo = num;
    }

    //Returns the name of this bicycle's owner
    public String getOwnerName() {
        return ownerName;
    }

    //Assigns the name of this bicycle's owner
    public void setOwnerName(String name) {
        ownerName = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    //Assigns the name of this bicycle's owner
    public void setPhoneNo(String num) {
        phoneNo = num;
    }

}
