/**
 * Created by benzali on 7/21/2018.
 */

package Controller;

import Model.Tool_Model;

public class Calculator_Controller extends Tool_Controller implements java.awt.event.ActionListener {

    //Constructor
    public Calculator_Controller(Tool_Model aModel) {
        super(aModel);
    };

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e){
        switch(e.getActionCommand().toString()){
            case "7":
                myModel.appendChar("7");
                break;
            case "8":
                myModel.appendChar("8");
                break;
            case "9":
                myModel.appendChar("9");
                break;
            case "4":
                myModel.appendChar("4");
                break;
            case "5":
                myModel.appendChar("5");
                break;
            case "6":
                myModel.appendChar("6");
                break;
        }
    }
}
