package pl.mareksowa;

public class PhoneBook {

    private String name;
    private Contact[] contacts;

    public PhoneBook(String name){
        this.name = name;
        this.contacts = new Contact[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
}
