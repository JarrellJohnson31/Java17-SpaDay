package org.launchcode.data;

import org.launchcode.models.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {

    // need a place to store events

    private static final Map<Integer, User> users = new HashMap<>();

    // get all events
    public static Collection<User> getAll() {
        return users.values();
    }
    // get a single event
    public static User getById(int id) {
        return users.get(id);
    }
    // add an event to collection
    public static void add(User user) {
        users.put(user.getId(),user);
    }
    // remove an event
    public static void Remove(int id) {
        users.remove(id);
    }
