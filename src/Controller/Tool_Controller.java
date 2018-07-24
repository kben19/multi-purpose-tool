package Controller;
import Model.Tool_Model;

import java.awt.event.ActionListener;

/**
 * Created by benzali on 7/20/2018.
 */
public class Tool_Controller {

    private Calculator_Controller calculator;
    protected Tool_Model myModel;

    public Tool_Controller(Tool_Model aModel){

        myModel = aModel;
        System.out.println("Control Initialized");
    }

    public ActionListener getController(int num){
        switch(num){
            case(1) : return calculator;
            default: return null;
        }
    }


}
