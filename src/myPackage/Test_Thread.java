package myPackage;

public class Test_Thread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        Test_Thread t1 = new Test_Thread();
        t1.setName("Thao");

        Test_Thread t2 = new Test_Thread();
        t2.setName("Vinh");

        Test_Thread t3 = new Test_Thread();
        t3.setName("Hoa");

        t1.run();
        try {
            t1.join(1500); // trong 1,5s luong 1 chua chay xong cac luong khac se ko cho nua;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.run();
        t3.run();
    }
}
// Join bat cac luong khac phai cho 1 luong hoan thanh( co time de cho, neu het time cac luong chay song song);