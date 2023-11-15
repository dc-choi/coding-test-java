package com.example.javadatastructure.grammar.object;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
    @Test
    void classTest() {
        Car car = new Car();
        System.out.println(car.getName());
        System.out.println(car.getColor());
        System.out.println(car.getNowSpeed());
        System.out.println(car.getMaxSpeed());

        Car ave = new Car("아반떼", "하얀색", 0, 300);
        System.out.println(ave); // toString() 생략 가능
        ave.accelerator(300);
        System.out.println(ave);

        /**
         * 정적 블록이나 정적 메서드를 사용할 때는 this 사용이 불가능하다.
         */
        System.out.println(Car.HIGHWAY_SPEED); // 정적 변수
        System.out.println(Car.highwaySpeed()); // 정적 메서드

        /**
         * 싱글톤
         * 가끔 단 하나의 객체만 만들도록 보장해야 하는 경우가 있다.
         *
         * 싱글톤을 만들기 위해서는 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 해야한다.
         * 생성자를 호출한 만큼 객체가 생성되기 때문이다.
         * private 접근제어자를 사용해서 접근을 막도록 한다.
         */
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1); // true

        /**
         * final과 상수의 차이
         *
         * final은 필드선언시 부여하는 방법과 생성자에서 부여하는 방법 두가지로 선언한다.
         *
         * 상수의 경우 static final로 선언하게 된다.
         * 객체마다 저장할 필요가 없고 여러가지 값으로 초기화 되면 안되는 변수에 사용된다.
         */
        // getInstance() 메서드에서 받아오는 singleton 객체가 상수이다.
        Singleton singleton2 = Singleton.getInstance();
        singleton2.print();

        System.out.println("======================================");

        /**
         * 리플렉션
         * 런타임시에 클래스, 어노테이션의 메타 정보를 얻는 기능.
         */
        Class<?> myClass = null;
        Field[] flelds = null;
        Method[] methods = null;

        try {
            // 오타가 발생할 수 있어서 예외처리를 진행한다.
            myClass = Class.forName("com.example.javadatastructure.grammar.object.Car");
            flelds = myClass.getDeclaredFields();
            methods = myClass.getDeclaredMethods();
            for (Field f : flelds) {
                System.out.println(f);
            }

            for (Method m : methods) {
                System.out.println(m);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("======================================");

        // 직접 클래스를 가져올 수 있다.
        flelds =  Car.class.getDeclaredFields();
        methods = Car.class.getDeclaredMethods();
        for (Field f : flelds) {
            System.out.println(f);
        }

        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
