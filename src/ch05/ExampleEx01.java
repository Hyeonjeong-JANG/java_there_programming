package ch05;

interface RemoconAble {
    public void 초록버튼();

    public void 빨간버튼();
}

class Samsung implements RemoconAble {
    @Override
    public void 초록버튼() {
        System.out.println("삼성 테레비가 켜졌습니다.");
    }

    @Override
    public void 빨간버튼() {
        System.out.println("삼성 테레비가 꺼졌습니다.");
    }
// 내부를 만드시오.

}

class LG implements RemoconAble {
    @Override
    public void 초록버튼() {
        System.out.println("엘지 테레비가 켜졌습니다.");
    }

    @Override
    public void 빨간버튼() {
        System.out.println("엘지 테레비가 꺼졌습니다.");
    }
// 내부를 만드시오.

}

public class ExampleEx01 {
    public static void main(String[] args) {
// 삼성 리모콘 2개 만들기(new)
        Samsung s1 = new Samsung();
        Samsung s2 = new Samsung();
// 엘지 리모콘 2개 만들기(new)
        LG l1 = new LG();
        LG l2 = new LG();

        s1.초록버튼();
        s1.빨간버튼();
        l1.초록버튼();
        l1.빨간버튼();
    }
}
