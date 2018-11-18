package pl.mareksowa;

public class ContactManager {

    private Printer printer;

    public ContactManager() {
        this.printer = new Printer();
    }

    //dodaj
    public void addNewContact(PhoneBook phoneBook, Contact contactToAdd){
        for (int i = 0; i < phoneBook.getContacts().length; i++) {
            if (phoneBook.getContacts()[i] == null) {
                phoneBook.getContacts()[i] = contactToAdd;
                break;
            }
        }
    }

    //usun
    public void deleteContact(PhoneBook phoneBook, int contactIndexToDelete){
        phoneBook.getContacts()[contactIndexToDelete] = null;
    }

    //zobacz wszystkie kontakty
    public void showAllContacts(PhoneBook phoneBook){
        for (int i = 0; i < phoneBook.getContacts().length; i++) {
            if (phoneBook.getContacts()[i]!=null){
                getPrinter().print(i + ". Imie: "+phoneBook.getContacts()[i].getName()
                        +", Nazwisko: " + phoneBook.getContacts()[i].getSurname()
                        +", Numer: " + phoneBook.getContacts()[i].getPhoneNumber());
            }
        }
    }



    //sprawdz czy mozna dodac
    public boolean canAddToPhoneBook(PhoneBook phoneBook, Contact contactToCheck){
        for (Contact contact : phoneBook.getContacts()) {
            if(contact==null){
                return true;
            }
        }
        //* trzeba zrobic tak by nie dodawalo tych samych kontaktow
        return false;
    }
    //sprawdz czy ksiazka nie jest zapelniona

    public boolean isFull(PhoneBook phoneBook){
        for (int i = 0; i < phoneBook.getContacts().length; i++) {
            if (phoneBook.getContacts()[i] == null) {
                return false;
            }
        }
        return true;
    }


    //sprawdz czy mozna usunac
    public boolean canDeleteFromPhoneBook(PhoneBook phoneBook, int contactIndexToCheck){
        if (contactIndexToCheck>=phoneBook.getContacts().length){
            return false;
        }
        return true;
    }

    public Printer getPrinter(){
        return printer;
    }


}


