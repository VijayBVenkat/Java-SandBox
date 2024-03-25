package org.vijay.designPatterns.singleton;

class DBConnection3 {
    private static DBConnection3 instance;

    private DBConnection3() {
    }

    public static DBConnection3 getInstance() {
        if (instance == null) {
            synchronized (DBConnection3.class) {
                if (instance == null) {
                    instance = new DBConnection3();
                }
            }
        }
        return instance;
    }
}


public class SingletonDoubleLocking {
    public static void main(String[] args) {

        DBConnection3 instance = DBConnection3.getInstance();
    }
}
