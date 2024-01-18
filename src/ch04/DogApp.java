package ch04;

public class DogApp {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.color);
        System.out.println(d1.type);
        System.out.println();

        // 1년이 지나 강아지가 노란색으로 염색함
        d1.age = d1.age + 1;
        d1.color = "노란색";
        d1.name = "레르코";
//        d1.type = "푸들"; //  상수는 변경 불가능
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.color);
        System.out.println(d1.type);
        Dog d2 = new Dog();
    }
}
