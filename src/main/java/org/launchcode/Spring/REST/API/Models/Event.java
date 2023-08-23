package org.launchcode.Spring.REST.API.Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

interface IEvent {
    int getId();
    String getName();
    String getDescription();
}
public class Event implements IEvent {
    private static int nextId = 0;
    private static HashMap<Integer, Event> store = new HashMap();
    private int id;
    private String name;
    private String description;
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String getDescription() {
        return description;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getId() {
        return this.id;
    }
    public static int getNextId() {
        return nextId;
    }
    public static HashMap<Integer, Event> getStore() {
        return store;
    }
    private Event(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    public static Event createEvent(String name, String description) {
        int id = ++nextId;
        Event event = new Event(id, name, description);

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
