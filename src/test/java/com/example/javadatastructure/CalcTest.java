package com.example.javadatastructure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class CalcTest {
    /**
     * TDD란?
     * 테스트 주도 개발의 약자
     *
     * 구현 -> 테스트 -> 배포순으로 진행하는 것과 달리
     * 테스트 -> 구현 -> 배포순으로 진행되는 것이다.
     *
     * 테스트를 먼저 한다는 것은 테스트 케이스를 먼저 작성한 후 프로그램을 작성하는 것이다.
     *
     * TDD 개발주기
     * RED: 테스트 케이스를 짠 후 테스트가 실패하는 것을 확인시 통과
     * GREEN: 테스트에 통과할 수 있도록 프로그램 작성후 성공시 통과
     * REFACTORING: 동작에 성공한 프로그램의 코드를 리팩터링 진행
     *
     * 켄트벡 왈
     * 사람은 한번에 두가지 일을 하는 것이 어렵기 때문에 한번에 한가지에만 집중해야 한다.
     * RED -> 문제를 정의하는데 집중한다.
     * GREEN -> 문제를 해결하는데 집중한다.
     * REFACTORING -> 작성한 코드를 Clean하게 만드는 것에 집중한다.
     * 참고: https://hucet.tistory.com/100
     */

    @Test
    @DisplayName("Calc에 run()은 int를 리턴한다.")
    void returnInt() {
        int rs = Calc.run("");
        assertThat(rs).isEqualTo(0);
    }

    @Test
    @DisplayName("10 + 10 = 20")
    void t2() {
        int rs = Calc.run("10 + 10");
        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("1 + 1 = 2")
    void t3() {
        int rs = Calc.run("1 + 1");
        assertThat(rs).isEqualTo(2);
    }

    @Test
    @DisplayName("1 - 1 = 0")
    void t4() {
        int rs = Calc.run("1 - 1");
        assertThat(rs).isEqualTo(0);
    }

    @Test
    @DisplayName("1 * 1 = 1")
    void t5() {
        int rs = Calc.run("1 * 1");
        assertThat(rs).isEqualTo(1);
    }

    @Test
    @DisplayName("1 / 1 = 1")
    void t6() {
        int rs = Calc.run("1 / 1");
        assertThat(rs).isEqualTo(1);
    }

    @Test
    @DisplayName("100 + 100 = 200")
    void t7() {
        int rs = Calc.run("100 + 100");
        assertThat(rs).isEqualTo(200);
    }

    @Test
    @DisplayName("1 + 1 + 1 = 3")
    void t8() {
        int rs = Calc.run("1 + 1 + 1");
        assertThat(rs).isEqualTo(3);
    }

    @Test
    @DisplayName("     D     ")
    void t9() {
        int rs = Calc.run("     D     ");
        assertThat(rs).isEqualTo(0);
    }

    @Test
    @DisplayName("1 + 2 + 3 + 4 = 10")
    void t10() {
        int rs = Calc.run("1 + 2 + 3 + 4");
        assertThat(rs).isEqualTo(10);
    }

    @Test
    @DisplayName("10 + 10 * 3 = 40")
    void t11() {
        int rs = Calc.run("10 + 10 * 3");
        assertThat(rs).isEqualTo(40);
    }

    @Test
    @DisplayName("10 + 10 * 3 / 5 = 16")
    void t12() {
        int rs = Calc.run("10 + 10 * 3 / 5");
        assertThat(rs).isEqualTo(16);
    }

    @Test
    @DisplayName("3 + 10 * 3 / 5 = 9")
    void t13() {
        int rs = Calc.run("3 + 10 * 3 / 5");
        assertThat(rs).isEqualTo(9);
    }

    @Test
    @DisplayName("3 + 10 * 3 = 33")
    void t14() {
        int rs = Calc.run("3 + 10 * 3");
        assertThat(rs).isEqualTo(33);
    }
}