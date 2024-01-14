package ch02;

class 손님 {
    // 손님의 행위
    void 커피마시기() {
        System.out.println("손님이 커피 호로록");
    }
}

public class MethodEx01 {

    // 메서드 = MethodEx01 클래스의 행위
    static void start() {
        System.out.println("만나서 반갑습니다."); // 스트링 타입
        System.out.println("start메서드 종료");
    }

    public static void main(String[] args) {
        MethodEx01.start();
        손님 s = new 손님();
        s.커피마시기();
    }
}
