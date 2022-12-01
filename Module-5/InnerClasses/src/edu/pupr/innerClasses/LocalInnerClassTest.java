package edu.pupr.innerClasses;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class LocalInnerClassTest {
    public static void main(String [] args){
        TalkingClock clock = new TalkingClock(1000, true);

        clock.start();

        JOptionPane.showMessageDialog(null, "Quit Local Inner class program!");

        System.exit(0);
    }
}

class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public boolean isBeep() {
        return beep;
    }

    public void setBeep(boolean beep) {
        this.beep = beep;
    }

    public void start() {
        class TimerPrinter implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();

                System.out.println("At the tone, the time is " + now);

                if (beep) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }

        ActionListener listener = new TimerPrinter();
        Timer timer = new Timer(interval, listener);

        timer.start();
    }
}