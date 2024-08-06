package threads;
//
//class Z {
//}

//class A extends Z implements Runnable {
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class B extends Z implements Runnable {
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}


public class Main {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

//        obj1.setPriority(Thread.MAX_PRIORITY);

//        System.out.println("Thread 1 priority: " + obj1.getPriority());
//        System.out.println("Thread 2 priority: " + obj2.getPriority());

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

//        obj1.start();
//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        obj2.start();
    }
}


/*
 * Our software runs on the OS, and the OS is responsible for managing the resources of the computer.
 * And OS runs on the hardware.
 * Threads are the smallest unit of execution that the OS can manage.
 * It is a lightweight process.
 * Threads share the same memory space.
 * Threads are used to perform multiple tasks at the same time.
 * Threads are independent sequences of execution.
 * Scheduler is responsible for scheduling the threads.
 * Threads are faster than processes.
 * Threads are used to perform time-consuming tasks.
 * Thread priority is used to decide which thread should be executed first.
 * Thread priority is an integer value that ranges from 1 to 10.
 * Thread priority is used to decide which thread should be executed first.
 * we can sleep a thread for a specific amount of time.
 * Thread.sleep() method is used to pause the execution of the current thread for a specified amount of time.
 * Thread.sleep() method throws InterruptedException.
 * Thread.sleep() method is a static method.
 *
 * Thread class is a predefined class in Java.
 * Thread class is present in the java.lang package.
 * Thread class is used to create a thread.
 * */