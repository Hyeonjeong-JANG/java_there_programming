package ch03;

/**
 * 가솔린 8.86L를 충전한 A 자동차는 총 1825.736km를 운행할 수 있다고 한다. 이 차의 연비를 계산하는 메소드를 완성하고, 출력 예와 같은 결과를 얻으시오.
 * 출력 예
 * 연비 20.0Km/L
 */

public class Example01 {

    static int efficiencyCalc(double distance, double gasoline) {
        double efficiency = distance / gasoline;
        return (int) efficiency;
    }

    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double e = efficiencyCalc(distance, gasoline);
        System.out.println("연비: " + e + "Km/L");
    }
}
