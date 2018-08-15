package Observer;

import java.util.ArrayList;

/**
 * Created by benzali on 8/15/2018.
 */
public class Subject {
    private ArrayList<Observer> observerList = new ArrayList<>();

    protected void attachView(Observer aView){
        observerList.add(aView);
    }

    protected void removeView(int index){
        observerList.remove(index);
    }

    protected void notifyObservers(){
        for (Observer obs : observerList){
            obs.update();
        }
    }
}
