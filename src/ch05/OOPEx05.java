package ch05;

// 오버로딩의 단점: 유닛이 100개면 100개의 메서드를 다 만들어야 함!
// 오버로딩의 수도 제한이 있다!
class 전사 { // 검
    String name = "전사";

    void 기본공격(궁수 e1) {
        System.out.println("검으로 " + e1.name + " 공격하기");
    }
}

class 궁수 { // 활
    String name = "궁수";

    void 기본공격(광전사 e1) {
        System.out.println("활로 " + e1.name + " 공격하기");
    }
}

class 광전사 { // 도끼
    String name = "광전사";

    void 기본공격(전사 e1) {
        System.out.println("도끼로 " + e1.name + " 공격하기");
    }

}

public class OOPEx05 {
    static void attack(전사 u1) {
//        u1.기본공격();
    }

    public static void main(String[] args) {
        전사 u1 = new 전사();
        궁수 u2 = new 궁수();
        광전사 u3 = new 광전사();

        u1.기본공격(u2);
        u2.기본공격(u3);
        u3.기본공격(u1);
    }
}
