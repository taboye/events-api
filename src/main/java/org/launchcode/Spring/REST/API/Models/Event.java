package org.launchcode.Spring.REST.API.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

interface IEvent {
    int getId();
    String getText();
}
public class Event implements IEvent {

    private static int nextId = 0;

    private static HashMap<Integer, Event> store = new HashMap();

    private int id;
    private String text;

    public static int getNextId() {
        return nextId;
    }

    public static HashMap<Integer, Event> getStore() {
        return store;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getText() {
        return this.text;
    }

    private Event(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public static Event createEvent(String text) {
        int id = ++nextId;
        Event event = new Event(id, text);

        store.put(id, event);

        return event;
    }

    public static Event findItem(int id) {
        for(int eventId : store.keySet()) {
            if(id == eventId) {
                return store.get(id);
            }
        }
        return null;
    }

    public static List<Event> findAllItems() {
        return new ArrayList<Event>(store.values());
    }

    public static boolean deleteItem(int id) {
        for(int eventId : store.keySet()) {
            if(id == eventId) {
                store.remove(id);
                return true;
            }
        }
        return false;
    }
}
