//Upcasting and Downcasting Using instanceof Operator
class Animal {
    void sound(){
        System.out.println("Animal make a sound");
    }
}
class Animal1 extends Animal{
    void sound1(){
        System.out.println("Animal1 sound");
    }
    public static void main(String[] args) {
        Animal a = new Animal1();  // upcasting

        if (a instanceof Animal1){
            Animal1 b = (Animal1)a;
            b.sound1();    // downcasting
        }
    }
}