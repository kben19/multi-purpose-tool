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

    public String getChar(int index){
        if (index < calculatorText.length()){
            return calculatorText.substring(index, index+1);
        }
        return null;
    }

    public void deleteChar(int index){
        if (index < calculatorText.length() && index >= 0){
            calculatorText = calculatorText.substring(0, index) + calculatorText.substring(index+1);
        }
        myView.update();
    }

    public int getTextSize(){
        return calculatorText.length();
    }

    //Calculator text field accessor
    public String getText(){
        return calculatorText;
    }

    //Calculator text field mutator
    public void setText(String inputText){
        calculatorText = inputText;
        myView.update();
    }

    //Add view monitoring the model
    public void addView(Tool_View view){
        myView = view;
    }
}
