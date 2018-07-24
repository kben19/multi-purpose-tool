/**
 * Created by benzali on 7/20/2018.
 */

package Model;

import View.Tool_View;

public class Tool_Model {

    private Tool_View myView;
    private String calculatorText;

    //Constructor
    public Tool_Model(){
        calculatorText = "";
        System.out.println("Model Initialized");
    }

    //Append character into calculator text field
    public void appendChar(String aChar){
        calculatorText += aChar;
        myView.update();
    }

    //Calculator text field accessor
    public String getText(){
        return calculatorText;
    }

    //Add view monitoring the model
    public void addView(Tool_View view){
        myView = view;
    }
}
