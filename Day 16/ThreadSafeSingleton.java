class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    public static void main(String[] args) {
        ThreadSafeSingleton s1 = new ThreadSafeSingleton();
        ThreadSafeSingleton s2 = new ThreadSafeSingleton();
        System.out.println(s1);
        System.out.println(s2);
    }
}
