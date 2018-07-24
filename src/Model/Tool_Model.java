package Model;

import View.Tool_View;

/**
 * Created by benzali on 7/20/2018.
 */
public class Tool_Model {

    private Tool_View myView;
    private String calculatorText;

    public Tool_Model(){
        calculatorText = "";
        System.out.println("Model Initialized");
    }

    public void appendChar(String aChar){
        calculatorText += aChar;
        myView.update();
    }

    public String getText(){
        return calculatorText;
    }

    public void addView(Tool_View view){
        myView = view;
    }
}
