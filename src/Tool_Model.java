/**
 * Created by benzali on 7/20/2018.
 */
public class Tool_Model {

    private Tool_View myView;

    Tool_Model(){
        System.out.println("Model Initialized");
    }

    public void addView(Tool_View view){
        myView = view;
    }
}
