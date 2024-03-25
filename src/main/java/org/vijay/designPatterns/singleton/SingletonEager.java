package org.vijay.designPatterns.singleton;

class DBConnection {

    private static DBConnection instance = new DBConnection();

    public static DBConnection getSingletonObject() {
        return instance;
    }
}

public class SingletonEager {

    public static void main(String[] args) {
        DBConnection singletonObj = DBConnection.getSingletonObject();
    }
}
