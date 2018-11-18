package pl.mareksowa;

import java.util.Scanner;

public class Menu {
    private Scanner input;
    private Printer pr;
    private boolean conntinueLoop;

    public Menu() {
        this.input = new Scanner(System.in);
        this.pr = new Printer();
        this.conntinueLoop = true;
    }

    String choice = input.nextLine();
    //bedzie wyswietlane wszystko do uzytkownika i dzialal program
    public void startMenu() {
        pr.print("Witaj w ksiazce");

        do {
            pr.print("Aby dodac kontakt wybierz 1,  Aby usunac wybierz 2 , " +
                    "Aby wyswietlic wpisz 3, Aby wyjsc wybierz 4");

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
