package pl.mareksowa;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Printer pr;
    private ContactManager cm;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.pr = new Printer();
        this.cm = new ContactManager();
    }


    //bedzie wyswietlane wszystko do uzytkownika i dzialal program
    public void startMenu() {
        String choice;
        PhoneBook phoneBook = new PhoneBook("Nasza Ksiazka Defaultowa");
        boolean conntinueLoop = true;
        pr.print("Witaj w ksiazce");

        do {
            pr.print("Aby dodac kontakt wybierz 1,  Aby usunac wybierz 2 , " +
                    "Aby wyswietlic wpisz 3, Aby wyjsc wybierz 4");
            choice = getScanner().next();
            switch (choice) {
                case "1" : {
                    // metoda dodawania
                    if(cm.isFull(phoneBook)){
                        getPrinter().print("Nie mozna zapisac kontaktu");
                    }else{
                        getPrinter().print("Podaj imie");
                        String name = getScanner().nextLine();
                        getPrinter().print("Podaj nazwisko");
                        String surname = getScanner().nextLine();
                        getPrinter().print("Podaj numer telefonu");
                        String phoneNumber = getScanner().nextLine();

                        Contact contact = new Contact(name, surname, phoneNumber);
                         if(cm.canAddToPhoneBook(phoneBook, contact)){
                             cm.addNewContact(phoneBook, contact);
                             getPrinter().print("Kontakt zostal dodany");
                         }else{
                             getPrinter().print("Nie mozna dodac kontaktu");
                         }
                    }

                    break;
                }
                case "2" : {
                    // metoda usuwania
                    getPrinter().print("Podaj indeks kontaktu do usuniecia");
                    cm.showAllContacts(phoneBook);
                    int indexToDelete = getScanner().nextInt();
                    if(cm.canDeleteFromPhoneBook(phoneBook, indexToDelete)){
                        cm.deleteContact(phoneBook, indexToDelete);
                        getPrinter().print("Kontakt o indeksie " +indexToDelete
                                + " zostal usuniety.");
                    } else{
                        getPrinter().print("Nie mozna usunac kontaktu o podanym " +
                                "indeksie: " + indexToDelete);
                    }
                    break;
                }
                case "3" : {
                    // metoda wyswietlania
                    cm.showAllContacts(phoneBook);
                    break;
                }
                case "4" : {
                    // metoda wyjscia
                    pr.print("Zamykanie");
                    conntinueLoop = false;
                    break;
                }


            }
        }while(conntinueLoop);
    }


    //run program
    // wyswietlanie

    //dodawanie

    //usuwanie

    //wyjdz z programu

    public Scanner getScanner() {
        return scanner;
    }

    public Printer getPrinter() {
        return pr;
    }

    public ContactManager getCm() {
        return cm;
    }
}
