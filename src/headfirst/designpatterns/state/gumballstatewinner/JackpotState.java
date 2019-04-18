package headfirst.designpatterns.state.gumballstatewinner;

public class JackpotState implements State {
    GumballMachine gumballMachine;

    public JackpotState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void ejectQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void turnCrank() {
        System.out.println("Turning again maybe you will get 10 gumballs!!");
    }

    public void dispense() {
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            for (int i = 1 ; i <= 20 ; i++) {
                if (gumballMachine.getCount() == 0) {
                    gumballMachine.setState(gumballMachine.getSoldOutState());
                    break;
                }
                gumballMachine.releaseBall();
            }
            System.out.println("YOU'RE JACKPOT! You got 20 gumballs for your quarter");

            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    public void tryMyLuck() {
        System.out.println("You already got jackpot!!");
    }

    public void refill() { }

    public String toString() {
        return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
    }
}