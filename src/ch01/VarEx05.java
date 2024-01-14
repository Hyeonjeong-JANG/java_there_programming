package ch01;

// VarEx05의 메모리 -> main이 떠있음
// Note3의 메모리 -> 아무 것도 안 떠있음
class Note3 {
    int price = 2000;
}

public class VarEx05 {
    public static void main(String[] args) {
        Note3 note1 = new Note3(); // heap 공간에 Note 클래스가 가지고 있는 모든 데이터를 할당해!!(대신 static은 제외하고)
        Note3 note2 = new Note3();
        Note3 note3 = new Note3();
        int age = 25;
        System.out.println(age);
        System.out.println("note1: " + note1.price);
        System.out.println("note2: " + note2.price);
        System.out.println("note3: " + note3.price);
        note1.price = 9000;
        System.out.println("note1: " + note1.price);
    }
}
