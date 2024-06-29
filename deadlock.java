public class deadlock {
    public static void main(String[] args) {
        final String r1 = "Java";
        final String r2 = "JavaScript";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread 1: r1 is locked " + r1);
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                    }
                    synchronized (r2) {
                        System.out.println("Thread 1: r2 is locked " + r2 );
                      
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (r1) {
                    System.out.println("Thread 2: r1 is locked " + r1);
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                    }
                    synchronized (r2) {
                        System.out.println("Thread 2: r2 is locked " + r2);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}