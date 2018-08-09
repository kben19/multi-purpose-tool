/**
 * Created by benzali on 7/21/2018.
 */

package Controller;

import Model.Tool_Model;

public class Calculator_Controller extends Tool_Controller implements java.awt.event.ActionListener {

    //Constructor
    public Calculator_Controller(Tool_Model aModel) {
        super(aModel);
        System.out.println("ButtonListener Initialized");
    };

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e){
        buttonListener(e.getActionCommand().toString());
    }


}
