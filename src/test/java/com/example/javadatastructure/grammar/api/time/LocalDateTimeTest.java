package com.example.javadatastructure.grammar.api.time;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeTest {
    /**
     * LocalDateTime
     * JAVA 8버전부터 새로운 시간대를 확인하기 위한 클래스
     */

    @Test
    void now() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 시간은: " + now);
        System.out.println("현재 연도는: " + now.getYear());
        System.out.println("현재 월은: " + now.getMonthValue());
        System.out.println("현재 일은: " + now.getDayOfMonth());
        System.out.println("현재 시는: " + now.getHour());
        System.out.println("현재 분은: " + now.getMinute());
        System.out.println("현재 초는: " + now.getSecond());
        System.out.println("현재 나노초는: " + now.getNano());
        System.out.println("==================================");
        System.out.println("현재 월의 영어 이름은: " + now.getMonth());
        System.out.println("현재 일년중 몇일이 지났는가: " + now.getDayOfYear());
        System.out.println("현재 요일은: " + now.getDayOfWeek());
    }

    @Test
    void setDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 시간은: " + now);
        LocalDateTime dateTime;
        dateTime = now.with(TemporalAdjusters.firstDayOfYear());
        System.out.println("이번 해의 첫 일: " + dateTime);
        dateTime = now.with(TemporalAdjusters.lastDayOfYear());
        System.out.println("이번 해의 마지막 일: " + dateTime);
        dateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("다음 해의 첫 일: " + dateTime);
        System.out.println("==================================");
        dateTime = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("이번 달의 첫 일: " + dateTime);
        dateTime = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("이번 달의 마지막 일: " + dateTime);
        dateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("다음 달의 첫 일: " + dateTime);
        System.out.println("==================================");
        dateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("이번 달의 첫 월요일: " + dateTime);
        dateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("돌아오는 월요일: " + dateTime);
        dateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
        System.out.println("지난 월요일: " + dateTime);
    }
}
