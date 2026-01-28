class Test {
    static void display(Message m) {
        m.show("Passed as parameter");
    }

    public static void main(String[] args) {
        display(msg -> System.out.println(msg));
    }
}

