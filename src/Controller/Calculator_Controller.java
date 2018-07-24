package Controller;

import Model.Tool_Model;

/**
 * Created by benzali on 7/21/2018.
 */
public class Calculator_Controller extends Tool_Controller implements java.awt.event.ActionListener {

    public Calculator_Controller(Tool_Model aModel) {
        super(aModel);
    };

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e){
        switch(e.getActionCommand().toString()){
            case "7":
                myModel.appendChar("7");
        }
    }
}
