package org.vijay.designPatterns.singleton;

class DBConnNonEager {

    private static DBConnNonEager connection;

    // Singleton Lazy
    public static DBConnNonEager getLazyConnection() {
        if (connection == null) {
            connection = new DBConnNonEager();
        }
        return connection;
    }

    //Singleton Synchronized
    synchronized static DBConnNonEager getSynchronizedConnection() {
        if (connection == null) {
            connection = new DBConnNonEager();
        }
        return connection;
    }

    // Double Lock
    public static DBConnNonEager getDoubleLockConnection () {
        if (connection == null) {
            synchronized (DBConnNonEager.class) {
                if (connection == null) {
                    connection = new DBConnNonEager();
                }
            }
        }
        return connection;
    }

}

public class SingletonNonEager {
    public static void main(String[] args) {
        DBConnNonEager lazyConnection = DBConnNonEager.getLazyConnection();

        DBConnNonEager synchronizedConnection = DBConnNonEager.getSynchronizedConnection();

        DBConnNonEager doubleLockConnection = DBConnNonEager.getDoubleLockConnection();
    }
}
