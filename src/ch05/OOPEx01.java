package ch05;

// 접근제어자 = 디폴트 접근제엊, public 접근제어자, private 접근제어자
class Player {
    String name;
    private int thirsty;

    public Player(String name, int thirsty) {
        this.name = name;
        this.thirsty = thirsty;
    }

    int 목마름상태확인() {
        return this.thirsty;
    }

    // 행위 = 메서드
    void 물마시기() {
        System.out.println("물마시기 행위");
        this.thirsty = this.thirsty - 50;
    }
}

public class OOPEx01 {
    public static void main(String[] args) {
        Player p1 = new Player("홍길동", 100);
        System.out.println("이름: " + p1.name);
        System.out.println("갈증지수: " + p1.목마름상태확인());

//        1. 첫 번째 시나리오 = 마법 -> 안 됨
//        p1.thirsty = 50; // 원인 없이 갈증지수 변경 = 마법
//        System.out.println("갈증지수: " + p1.thirsty);

//        2. 두 번째 시나리오 = 상태가 행위를 변경함 -> 안 됨 -> 객체지향 프로그램이 아님
//        신입의 실수 가능성!!
//        p1.물마시기(); // 신입은 이걸 안 쓰고 
//        p1.thirsty = 50; // 이렇게 쓸 가능성이 농후함
//        System.out.println("갈증지수: " + p1.thirsty);

//        3. 세 번째 시나리오
        p1.물마시기();
        System.out.println("갈증지수: " + p1.목마름상태확인());
    }
}
