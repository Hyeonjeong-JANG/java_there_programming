package ch02;

/**
 * 정리
 * Stack(지역변수: 메서드가 실행될 떄 메모리에 할당됨, 메서드가 종료될 때 메모리에서 사라짐)
 * Heap(전역변수: new 할 때 메모리에 할당됨, 더이상 참조하지 않을 때 메모리에서 사라짐)
 * Static(전역변수: main 메서드가 실행되기 전에 메모리에 할당됨, main 메서드가 종료되면 메모리에서 사라짐)
 */
public class StackEx02 {
    static int sum = 20; // 전역 변수(static) main 메서드가 시작되기 전에 sum이 할당됨.
    int value = 50; // 전역 변수(heap) 더이상 참조하지 않을 때 자동으로 사라진다.

    static void a() {
        // a 메서드가 실행될 때 stack 공간에 n1이 할당되고 a메서드가 종료되면 메모리에서 사라짐
        int n1 = 1; // a메서드의 스택영역에 저장됨(지역변수)(stack)
        System.out.println(n1);
//        static int n2 = 2; // static 공간 할당은 main 실행되기 전에 미리 있기 때문에 a()메서드가 열리고 난 후 그 안에 static을 할 수 없다.

    }

    public static void main(String[] args) {
        a();
//        System.out.println(n1);
        System.out.println(sum);
        StackEx02 s = new StackEx02(); // 이 라인에서 heap 공간에 value가 할당된다.
        System.out.println(s.value);
        System.out.println("test1 - 더이상 s변수를 참조하지 않기 때문에 메모리에서 사라진다.");
        System.out.println("test2");
    }

}
