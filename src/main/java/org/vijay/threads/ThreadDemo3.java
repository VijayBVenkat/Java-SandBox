package org.vijay.threads;

// Thread by implementing Runnable interface - using lambda
public class ThreadDemo3 {

    public static void main(String[] args) throws Exception{
//        Runnable obj1 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0; i<5; i++) {
//                    System.out.println("Hi!");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {}
//                }
//            }
//        };

        // since Runnable is a functional interface,
        // the above can be rewritten using lambda as below
        Runnable obj1 = () -> {
            for (int i=0; i<3; i++) {
                System.out.println("Hi!");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {}
            }
        };

        // next better way is, to remove the declaration of the object
        // and directly use it in the thread-object

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello!");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }, "helloThread");

        t1.setName("hiThread");
//        t2.setName("helloThread"); // setting it in the thread-object itself

        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10


        System.out.println(t1.getName() + " - " + t1.getPriority());
        System.out.println(t2.getName() + " - " + t2.getPriority());

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {}
        t2.start();

        t1.join();
        t2.join();
        System.out.println(t2.isAlive());

//        if (!t1.isAlive() && !t2.isAlive()) {
            System.out.println("Bye");
//        }

    }
}