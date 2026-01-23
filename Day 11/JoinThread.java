class JoinThread extends Thread {
    public void run(){
        System.out.println("In Thred");
    }
    public static void main(String[] args) throws Exception{
        JoinThread t = new JoinThread();
        t.start();
        t.join();
        System.out.println("main Thread");
    }
}
