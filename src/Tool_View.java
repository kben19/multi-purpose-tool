/**
 * Created by benzali on 7/20/2018.
 */

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Tool_View {

    private Tool_Controller myController;
    private Frame frame;

    Tool_View(){
        System.out.println("View Initialized");

        frame = new Frame("Multi Purposes Tool");
        frame.addWindowListener(new CloseListener()); //Close button listener

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel calculator = new JPanel();
        JPanel timer = new JPanel();

        JPanel buttonPanel = new JPanel();
        GridLayout myGrid = new GridLayout(0, 4);
        myGrid.setHgap(50);
        myGrid.setVgap(50);

        String[] buttonString = {"7", "8", "9", "X", "4", "5", "6", "-", "1", "2", "3", "+", "±", "0", ".", "="};
        buttonPanel.setLayout(myGrid);
        for(String temp : buttonString){
            Button myButton = new Button(temp);
            myButton.setFont(new Font("Arial", Font.PLAIN, 40));
            buttonPanel.add(myButton);
        }

        calculator.setLayout(new BorderLayout());
        TextField myTextField = new TextField("0");
        myTextField.setFont(new Font("Arial", Font.PLAIN, 50));
        myTextField.setEnabled(false);
        calculator.add(myTextField, BorderLayout.NORTH);
        calculator.add(buttonPanel, BorderLayout.CENTER);

        timer.add(new JLabel("00:00"));
        timer.add(new Button("timer"));
        timer.add(new Button("stopwatch"));

        tabbedPane.addTab("Calculator", calculator);
        tabbedPane.addTab("Timer", timer);

        frame.add(tabbedPane);
        frame.setSize(780, 780);
        frame.setLocation(100,100);
        frame.setVisible(true);
    }

    //Controller Mutator
    public void addController(ActionListener controller){
        System.out.println("View: Controller added");
    }


    // Close button listener
    public static class CloseListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false);
            System.exit(0);
        } //windowClosing()
    } //CloseListener
}
