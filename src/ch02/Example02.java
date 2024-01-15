package ch02;

//다음 코드에 오류가 나는 이유
class A {
    int num = 10;

    static void start() {
//        System.out.println(num);
        // static을 heap을 그냥 부를 수 없음. heap으로 new를 해야 띄울 수 있다.
    }
}

public class Example02 {
}
