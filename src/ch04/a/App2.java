package ch04.a;


public class App2 {
    public static void main(String[] args) {
        Cal c = new Cal();
        c.add();
        c.minus();
//        c.multi(); // 같은 클래스가 아니기 때문에 찾을 수 없음.

        System.out.println(c.num); // 같은 패키지이기 때문에 찾을 수 있음.
    }
}
