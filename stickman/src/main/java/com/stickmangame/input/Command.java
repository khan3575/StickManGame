package com.stickmangame.input;

import com.stickmangame.entities.Stickman;

public interface Command {
    void execute(Stickman actor);
}