package com.projet5001.game.listeners;

import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;

import com.projet5001.game.events.ContainerEvent;

/**
 * Permet d'implanter les nouveau type de eventListener
 */
public class ContainerListener implements EventListener {

    ContainerEvent containerEvent;

    @Override
    public boolean handle(Event e) {
        if (!(e instanceof ContainerEvent)) {
            return false;
        }
        containerEvent = (ContainerEvent) e;
        switch (containerEvent.getType()) {
            case SimpleContainer:
                return simpleContainer(containerEvent);
            case collision:
                return collision(containerEvent);
        }
        return false;
    }

    public boolean simpleContainer(ContainerEvent containerEvent) {
        return false;
    }
    public boolean collision(ContainerEvent containerEvent) {
        return false;
    }
}