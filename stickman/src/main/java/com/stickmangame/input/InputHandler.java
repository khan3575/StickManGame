package com.stickmangame.input;

import com.stickmangame.entities.stickman;
import javafx.scene.input.KeyCode;
import java.util.HashMap;
import java.util.Map;

public class InputHandler {
    private Map<KeyCode, Command> comandMap;
    private Stickman hero;
     
    public InputHandler(Stickman hero){
        this.hero = hero;
        configureKeyBindings();
    }

    private void configureKeyBindings(){
        comandMap.put(KeyCode.SPACE, new JumpCommand());
        comandMap.put(KeyCode.RIGHT, new MoveRightCommand());

    }

    public void handleInput(KeyCode key){
        if(comandMap.containsKey(key))
        {
            Command command = comandMap.get(key);
            command.execute(hero);
        }
    }
    
}
