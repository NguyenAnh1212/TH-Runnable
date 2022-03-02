public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread đang chạy ...");
        // tạo ra 2 thread
        DemoRunnable demo1 = new DemoRunnable("F0 đi học");
        demo1.start();

        DemoRunnable demo2 = new DemoRunnable("F1 ở nhà");
        demo2.start();

        System.out.println("Chạy xong main."+ "\n");
    }
}
