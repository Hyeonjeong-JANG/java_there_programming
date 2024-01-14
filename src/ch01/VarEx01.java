package ch01;

// 패키지: 자바파일이 모여 있는 폴더
public class VarEx01 {
    public static void main(String[] args) {
        boolean b1= true;  // 1이 저장됨
        boolean b2= false;  // 1이 저장됨
        int n1 = 1000; // 4바이트
        double d1= 1000.1; // 8바이트
        char c1 = '가'; // 2바이트

        System.out.println(n1);
        n1 = 50; // n1 값 변경
        System.out.println(n1);
    }
}
