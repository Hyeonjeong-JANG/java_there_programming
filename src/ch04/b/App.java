package ch04.b;

import ch04.a.Cal;

// main이 있는 자바파일을 실행파일이라고 함
public class App {

    // JVM이 main 메서드를 찾으려면 public이 필요(공개)
    // JVM이 main 메서드를 찾으려면 static이 필요(메모리에 올린다는 뜻)
    public static void main(String[] args) {
        Cal c = new Cal();
//        c.add(); // 디폴트 접근 제어자는 다른 패키지에서 호출 불가능
        c.minus(); // public 접근 제어자는 모든 패키지에서 호출 가능
//        System.out.println(c.num); // 디폴트 접근제어자이기 때문에 변수를 찾을 수 없음.
    }
}
