package ch05;

class Engine{
    int power = 2000;
}
class Car{ // 자동차는 엔진이 아니기 때문에 상속할 수 없다.
    
    // 콤포지션!! 결합
    Engine e; // 같은 파일 안에 있는 클래스라서 그냥 가져다 쓸 수 있어.

    public Car(Engine e) {
        this.e = e;
    }
}

class Hamburger{
    String name = "기본햄버거";
    String 재료1 = "양상추";
    String 재료2 = "패티";
}

class CheeseHamburger extends Hamburger{ // 치즈햄버거 = 햄버거 -> 상속
    // 겹치지 않는 상태(필드)만 물려받는다.
    String name = "치즈햄버거";
}

class ChickenHamburger{ // 컴포지션
    String name = "치킨햄버거";
    Hamburger h;

    public ChickenHamburger(Hamburger h) {
        this.h = h;
    }
}
public class OOPEx02 {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Car c1 = new Car(e1);
        System.out.println("자동차의 엔진 마력은: "+c1.e.power);

        CheeseHamburger ch1 = new CheeseHamburger();
        System.out.println("햄버거의 이름은: "+ch1.name);
        System.out.println("재료1: "+ch1.재료1);
        System.out.println("재료2: "+ch1.재료2);

        Hamburger h1 = new Hamburger();
        ChickenHamburger chk1 = new ChickenHamburger(h1);
        System.out.println(chk1.name);
        System.out.println(chk1.h.재료1);
        System.out.println(chk1.h.재료2);
    }
}
