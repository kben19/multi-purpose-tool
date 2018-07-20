/**
 * Created by benzali on 7/20/2018.
 */

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


        frame.setSize(1024, 780);
        frame.setLocation(100,100);
        frame.setVisible(true);
    }

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
