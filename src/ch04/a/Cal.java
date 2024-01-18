package ch04.a;

// 1. 디폴트 접근 제어자(동일한 패키지에서만 접근 가능)
// 2. public 접근 제어자(다른 패키지에서도 접근 가능, 모든 곳에서 접근 가능)
// 3. 동일한 클래스에서만 접근 가능
public class Cal {

    int num = 10;

    void add() {
        System.out.println("더하기 메서드");
    }

    public void minus() {
        System.out.println("빼기 메서드");
    }

    private void multi() {
        System.out.println("곱하기 메서드");
    }

    public void divide() {
        System.out.println("나누기 메서드");
        multi(); // 동일한 클래스이기 때문에 찾을 수 있음
    }
}
