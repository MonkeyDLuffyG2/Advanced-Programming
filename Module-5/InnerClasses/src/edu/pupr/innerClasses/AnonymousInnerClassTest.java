package edu.pupr.innerClasses;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class AnonymousInnerClassTest {
    public static void main (String[] args){
        AnonymousTalkingClock clock = new AnonymousTalkingClock();

        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit Anonymous Inner Class Program!");

        System.exit(0);
    }
}

class AnonymousTalkingClock {
    public void start(int interval, boolean beep){
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();

                System.out.println("At the tone, the time is " + now);

                if (beep){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };

        Timer timer = new Timer(interval, listener);

        timer.start();
    }
}
