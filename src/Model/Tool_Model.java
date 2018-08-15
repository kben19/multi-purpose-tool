/**
 * Created by benzali on 7/20/2018.
 */

package Model;

import Observer.Subject;
import View.Tool_View;

import java.util.ArrayList;

public class Tool_Model extends Subject {

    private String calculatorText;

    //Constructor
    public Tool_Model(){
        calculatorText = "";
        System.out.println("Model Initialized");
    }

    //Append character into calculator text field
    public void appendChar(String aChar){
        calculatorText += aChar;
        notifyObservers();
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
        notifyObservers();
    }

    public void calculateText(){
        ArrayList<String> operationList = new ArrayList<>();
        ArrayList<String> numList = new ArrayList<>();
        int prevIndex = 0;
        for (int i = 0; i < calculatorText.length(); i++){
            String temp = calculatorText.substring(i, i+1);
            if (temp.equals("X") || temp.equals("÷") || temp.equals("+") || temp.equals("-")) {
                operationList.add(temp);
                numList.add(calculatorText.substring(prevIndex, i));
                prevIndex = i+1;
            }

        }
        numList.add(calculatorText.substring(prevIndex));

        int finalNum = 0;
        int index = 0;
        while(operationList.size() > 0){
            if (operationList.get(index).equals("X")){
                numList.set(index, Integer.toString(Integer.parseInt(numList.get(index)) * Integer.parseInt(numList.get(index+1))));
                numList.remove(index+1);
                operationList.remove(index);
            }
            else if (operationList.get(index).equals("÷")){
                numList.set(index, Integer.toString(Integer.parseInt(numList.get(index)) / Integer.parseInt(numList.get(index+1))));
                numList.remove(index+1);
                operationList.remove(index);
            }
            else if (operationList.get(index).equals("+")){
                numList.set(index, Integer.toString(Integer.parseInt(numList.get(index)) + Integer.parseInt(numList.get(index+1))));
                numList.remove(index+1);
                operationList.remove(index);
            }
            else if (operationList.get(index).equals("-")){
                numList.set(index, Integer.toString(Integer.parseInt(numList.get(index)) - Integer.parseInt(numList.get(index+1))));
                numList.remove(index+1);
                operationList.remove(index);
            }
        }
        calculatorText = numList.get(0);
        notifyObservers();
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
        notifyObservers();
    }

    //Add view monitoring the model
    public void addView(Tool_View view){
        attachView(view);
    }

    public void deleteView(int index){
        removeView(index);
    }
}
