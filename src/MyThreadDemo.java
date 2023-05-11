public class MyThreadDemo {
    public static void main(String[] args) {
        //Using Thread Class
        //System.out.println(Thread.currentThread().getName());
        //MyThread first = new MyThread();
        //first.setName("First");

        //MyThread second = new MyThread();
        //second.setName("Second");

        //first.start();
        //second.start();
        //System.out.println(Thread.currentThread().getName());

        //first.run();
        //second.run();

        //Using Runnable interface
        MyThreadInter firstInter = new MyThreadInter();
        Thread first = new Thread(firstInter,"FirstInter");

        MyThreadInter secondInter = new MyThreadInter();
        Thread second = new Thread(secondInter,"SecondInter");

        first.start();
        second.start();

    }
}
