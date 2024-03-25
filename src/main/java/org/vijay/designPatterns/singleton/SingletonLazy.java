package org.vijay.designPatterns.singleton;


class DBConnection1 {
    private static DBConnection1 instance;

    private DBConnection1() {
    }

    public static DBConnection1 getInstance() {
        if (instance == null) {
            instance = new DBConnection1();
        }
        return instance;
    }
}
public class SingletonLazy {
    public static void main(String[] args) {
        DBConnection1 instance = DBConnection1.getInstance();
    }
}
