package pl.mareksowa;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Printer pr;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.pr = new Printer();
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
            choice = scanner.next();
            switch (choice) {
                case "1" : {
                    // metoda dodawania
                    break;
                }
                case "2" : {
                    // metoda usuwania
                    break;
                }
                case "3" : {
                    // metoda wyswietlania
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
}
