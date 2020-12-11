package main;
import java.util.Scanner;


import java.io.*;

public class main {



    public boolean checkIfLeap (int evSzam)
    {
        if(evSzam%400 == 0)
        {
            return true;
        }
        if(evSzam%4 == 0 && evSzam%100 != 0)
        {
            return true;
        }
        if(evSzam%100 == 0 && evSzam%400 != 0)
        {
            return false;
        }
        if(evSzam%4 != 0)
        {
            return false;
        }
        else
        {
            return false;
        }
    }

    public boolean validEvszam(int evSzam) {
        if (evSzam > 0) {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void menu()
    {
        
        boolean berror = true;
        main main = new main();

        Scanner in;
        in = new Scanner(System.in);

        do {
            try {
                System.out.println("Irjon be egy evszamot: ");

                String evSzam = in.nextLine();

                int szam = Integer.parseInt(evSzam);

                if (main.validEvszam(szam))
                {
                    if (main.checkIfLeap(szam))
                    {
                        System.out.println("Szoko ev");
                    }
                    else {
                        System.out.println("Nem szokoev");
                    }
                }
                else
                {
                    System.out.println("Nem megfelelo evszamot irtal be");
                    main.menu();
                }
                berror = false;
            } catch (Exception e) {
                System.out.println("Nem megfelelo formatum!");
            }
        }while(berror);

    }

    public static void main(String[] args) {
        main main = new main();

        main.menu();
    }

}