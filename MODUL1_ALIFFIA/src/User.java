public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String Name;
    private int PhoneNumber;

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }


    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void Register (){
        System.out.println("Register Berhasil");
        System.out.println("Nama: "+this.Name);
        System.out.println("No Handphone: "+this.PhoneNumber);
    }

}
