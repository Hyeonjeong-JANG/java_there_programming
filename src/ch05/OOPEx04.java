package ch05;

class 임꺽정 {
    void 달리기() {
        System.out.println("달리기1");
    }

    void 달리기(int speed) {
        System.out.println("달리기2");
    }

    void 달리기(double speed) {
        System.out.println("달리기3");
    }

    void 달리기(int speed, double power) {
        System.out.println("달리기4");
    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        임꺽정 e = new 임꺽정();
        e.달리기();
        e.달리기(1);
        e.달리기(1.0);
        e.달리기(1, 1.0);
    }
}
