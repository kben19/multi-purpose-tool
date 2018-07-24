import Controller.Tool_Controller;
import Model.Tool_Model;
import View.Tool_View;

/**
 * Created by benzali on 7/20/2018.
 */
public class Tool_Driver {
    //main class
    public static void main(String[] args){
        Tool_Model myModel = new Tool_Model();
        Tool_View myView = new Tool_View(myModel);

        myModel.addView(myView);
    }
}
