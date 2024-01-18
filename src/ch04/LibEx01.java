package ch04;

import recipe.MySoup;

import java.util.Random;

// JDK 설치 - JDK(javac, java), JRE(라이브러리), JVM(자바 가상머신)
public class LibEx01 {
    public static void main(String[] args) {
        // 다른 프로젝트의 클래스 사용하기.
        MySoup m = new MySoup();
        m.김치찌개();

        Random random = new Random();
        System.out.println(random.nextInt());
    }

}
