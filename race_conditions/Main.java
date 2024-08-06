package race_conditions;

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);

        /*
         *  Java is a multithreaded language which means that we can write programs that can do multiple things at once.
         * This is achieved by creating multiple threads. A thread is a lightweight sub-process, the smallest unit of processing.
         * Multiprocessing and multithreading, both are used to achieve multitasking.
         * But we use multithreading than multiprocessing because threads share a common memory area.
         * They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.
         * synchronized keyword in Java is used to provide mutually exclusive access to a shared resource with multiple threads in Java.
         * The synchronized keyword can be applied to static/non-static methods or a block of code.
         * When a thread invokes a synchronized method, it automatically acquires the intrinsic lock for that method's object and releases it when the method returns.
         * The intrinsic lock is an object's lock that is used to synchronize access to the object's fields.
         * The synchronized keyword can be used to lock an object or a class.
         *
         * */
    }
}
