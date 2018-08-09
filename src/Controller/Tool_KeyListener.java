/**
 * Created by benzali on 8/10/2018.
 */

package Controller;

import Model.Tool_Model;

import java.awt.event.KeyEvent;

public class Tool_KeyListener extends Tool_Controller implements java.awt.event.KeyListener {

    //Constructor
    public Tool_KeyListener(Tool_Model model){
        super(model);
        System.out.println("KeyListener Initialized");
    }

    @Override
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void keyPressed(KeyEvent e){

    }

    @Override
    public void keyReleased(KeyEvent e){
        if (e.getKeyLocation() == KeyEvent.KEY_LOCATION_NUMPAD){
            String text = "";
            if (e.getKeyCode() == KeyEvent.VK_NUMPAD0 || e.getKeyCode() == KeyEvent.VK_0){
                text = "0";
            }
            else if (e.getKeyCode() == KeyEvent.VK_NUMPAD1 || e.getKeyCode() == KeyEvent.VK_1){
                text = "1";
            }
            else if (e.getKeyCode() == KeyEvent.VK_NUMPAD2 || e.getKeyCode() == KeyEvent.VK_2){
                text = "2";
            }
            buttonListener(text);
        }
    }
}
