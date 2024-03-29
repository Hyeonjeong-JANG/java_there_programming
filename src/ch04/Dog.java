package ch04;

// 클래스: 여러가지 특징(상태)를 가지고 있다.
// int -> 한 가지의 상태만 가질 수 있다.
// String -> 한 가지의 상태만 가질 수 있다.
public class Dog {
    int age = 20; // 변경 가능(변수)
    String name = "토토"; // 변경 가능(변수)
    String color = "하얀색"; // 변경 가능(변수)
    final String type = "말티즈"; // 변경 불가능(상수)
}

// 상태, 필드, 젼역변수(지역변수가 아니다(메서드 내부에서 만들어진 변수가 아니다))
