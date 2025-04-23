package Multithreading;

class ThreadCreate {

    static class Mythread extends Thread
    {
        public void run()
        {
            System.out.println("thread is running");
        }
    }

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.start();

    }
}
