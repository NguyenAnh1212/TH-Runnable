public class DemoRunnable implements Runnable{
    private Thread t;
    private final String threadName;

    public DemoRunnable(String threadName) {
        this.threadName = threadName;
        System.out.println("Khởi tạo " + threadName);
    }
    //    Phương thức run thực hiện việc hiển thị luồng nào đang được thực hiện.
//        Phương thức start() được sử dụng để tạo ra các luồng với tên tương ứng

    @Override
    public void run() {
        System.out.println("Đang chạy " + threadName);
        try {
            for (int i = 4; i > 0 ; i--) {
            System.out.println("Luồng " + threadName + ", " +i);
            // Dừng 50ms
                Thread.sleep(50);
            }
        }
            catch (InterruptedException e) {
                System.out.println("Luồng " + threadName + " đang gián đoạn.");
            }
            System.out.println("Kết thúc và thoát ra khỏi luồng " + threadName);
        }

    // tạo pthuc start()
    public void start(){
        System.out.println("Khởi động luồng " +threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
