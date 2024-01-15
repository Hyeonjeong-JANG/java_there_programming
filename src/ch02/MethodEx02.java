package ch02;

public class MethodEx02 {
    // void: 리턴하지 않겠다.
    static int add() { // 호출이 되면 중괄호 내부가 실행된다. 이때 Stack 공간이 메모리에 만들어진다.
        int sum = 5 + 6;
//        System.out.println(sum);
        return sum;
    }
    // 메서드에서 return 이 필요한 이유: 메서드 안의 필드값의 생명주기가 짧은데 다른 곳에서 찾을 수 있게 하려고.
    // 메서드 반환 타입과 리턴에 들어간 값의 타입이 같아야 한다.

    public static void main(String[] args) {
        int result = add(); // add() 메서드 호출
        System.out.println(result);
    }
}
