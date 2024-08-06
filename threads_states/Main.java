package threads_states;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread is running..."));

        System.out.println("Thread state: " + thread.getState());
        thread.start();
        System.out.println("Thread state: " + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread state: " + thread.getState());



        /*
         * Thread states:
         * 1. New: Thread is created but not started yet.
         * 2. Runnable: Thread is running but not currently executing.
         * 3. Running: Thread is currently executing.
         * 4. Blocked: Thread is blocked and waiting for a monitor lock.
         * 5. Waiting: Thread is waiting indefinitely for another thread to perform a particular action.
         * 6. Timed Waiting: Thread is waiting for another thread to perform a particular action for up to a specified waiting time.
         * 7. Terminated: Thread has completed its execution.
         * 8. Dead: Thread is dead and cannot be started again.
         * */
    }
}
