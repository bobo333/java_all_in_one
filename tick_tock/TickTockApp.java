import java.awt.event.*;
import javax.swing.*;

public class TickTockApp {
    public static void main(String[] args) {
        Timer t = new Timer(1000, new Ticker());
        t.start();

        JOptionPane.showMessageDialog(null, "Click OK to exit program");
        /*
            The option pane really just buys time so the program doesn't end.
            Otherwise it reaches the end of main and exits.
        */
    }
}

class Ticker implements ActionListener {
    private boolean tick = true;

    public void actionPerformed(ActionEvent event) {
        if (tick) {
            System.out.println("Tick...");
        } else {
            System.out.println("Tock...");
        }

        this.tick = !this.tick;
    }
}