package headfirst.designpatterns.state.gumballstatewinner;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        GumballMachine gumballMachine = new GumballMachine(100);
        int command ;
        System.out.println(gumballMachine.toString());
        System.out.println("1 -> Insert Quarter");
        System.out.println("2 -> Eject Quarter");
        System.out.println("3 -> Turn Crack");
        System.out.println("4 -> TRY MY LUCK");
        System.out.println("5 -> EXIT");
        boolean running = true;
        while (running) {
            System.out.print("Please input the command:");
            command = sc.nextInt();

            switch (command) {
                case 1:
                    gumballMachine.insertQuarter();
                    System.out.println();
                    System.out.println(gumballMachine.toString());
                    break;
                case 2:
                    gumballMachine.ejectQuarter();
                    System.out.println();
                    System.out.println(gumballMachine.toString());
                    break;
                case 3:
                    gumballMachine.turnCrank();
                    System.out.println();
                    System.out.println(gumballMachine.toString());
                    break;
                case 4:
                    gumballMachine.tryMyLuck();
                    System.out.println();
                    System.out.println(gumballMachine.toString());
                    break;
                default:
                    running = false;
                    break;
            }
        }



    }
}
