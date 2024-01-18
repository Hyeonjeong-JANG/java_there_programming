package ch05;

// 추상클래스
abstract class Animal {
    abstract void speak(); // 이 메서드는 반드시 자식들이 구현해야 함.

    void run() {
        System.out.println("걸어다님");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }
}

public class OOPEx07 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.speak(); // 동적바인딩 된다. 왜? 부모의 메서드가 무효화되니까!!
        a2.speak();

//        Animal a3 = new Animal(); // 추상클래스는 new를 못 함
    }
}
