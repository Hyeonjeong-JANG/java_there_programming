package ch01;

class Note {
    static int num = 1;
    static int time = 1015;
    static int price = 3000;
}

class Note2 {
    static int num = 2;
    static int time = 1902;
    static int price = 5000;
}

// 노트가 100개 필요하다면 class를 100개 만들어놔? 그 개수를 알 수 없다면??
public class VarEx04 {
    public static void main(String[] args) {
        System.out.println(Note.num);
        System.out.println(Note2.price);
    }
}
