package org.vijay.designPatterns.singleton;

// costlier since method is locked everytime
class DBConnection2 {
    private static DBConnection2 instance;

//    private DBConnection2() {
//    }

    synchronized static DBConnection2 getInstance() {
        if (instance == null) {
            instance = new DBConnection2();
        }
        return instance;
    }
}
public class SingletonSynchronized {
    public static void main(String[] args) {
        DBConnection2 instance = DBConnection2.getInstance();
    }
}

