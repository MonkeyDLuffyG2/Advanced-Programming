package edu.pupr.innerClasses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class InnerClassTest {
    public static void main (String [] args) {
        InnerTalkingClock clock = new InnerTalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit Inner class program!");

        System.exit(0);
    }
}

class InnerTalkingClock {
    private int interval;
    private boolean beep;
    private Timer timer;


    public InnerTalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener listener = new TimerPrinter();

        timer = new Timer(interval, listener);

        timer.start();
    }

    public class TimerPrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            Date now = new Date();

            System.out.println("At the tone, the time is " + now);
        }
    }
}
