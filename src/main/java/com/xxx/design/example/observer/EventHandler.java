package com.xxx.design.example.observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 事件处理
 */
public class EventHandler {

    private List<Event> events;

    public EventHandler() {
        events = new ArrayList<Event>();
    }

    public void addEvent(Object object, String methodName, Object... args) {
        events.add(new Event(object, methodName, args));
    }

    public void notifyX() throws Exception {
        for (Event event : events) {
            event.invoke();
        }
    }
}
