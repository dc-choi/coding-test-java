package com.example.javadatastructure.grammar.generic;

import com.example.javadatastructure.grammar.generic.wild.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    @Test
    void test() {
        /**
         * 제네릭
         * 클래스와 인터페이스, 메서드를 정의할 때 타입을 파라미터로 사용할 수 있도록 함.
         *
         * 제네릭을 사용하면 다음과 같은 이점이 있다.
         *
         * 1. 컴파일시 강한 타입 체크를 할 수 있다.
         * 컴파일러는 코드에서 잘못 사용된 타입 때문에 에러가 발생하는 문제점을 제거하기 위해 제네릭 코드에 대해 강한 타입 체크를 한다.
         * 실행 시 타입 에러가 나는 것보다는 컴파일 시에 미리 타입을 강하게 체크해서 에러를 사전에 방지하는 것이 좋다.
         *
         * 2. 타입 변환을 제거한다.
         * 불필요한 타입 변환을 할 수 있는 경우가 있기 때문에 프로그램 성능에 악영향을 미친다.
         * 다음 코드의 경우 List에 저장을 하는데 이때는 반드시 사용해야한다.
         */
        // List list = new ArrayList<>(); // 불필요한 타입 제거를 할 수 있다.
        List<String> list = new ArrayList<>();
        list.add("qwer");
        String str = list.get(0);
        System.out.println(str);
    }

    @Test
    void boxTest() {
        /**
         * 하나의 타입만 정의하는 제네릭 코드
         */
        Box<String> stringBox = new Box<>();
        stringBox.set("qwer");
        System.out.println(stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(1);
        System.out.println(integerBox.get());
    }

    @Test
    void multiGenericTest() {
        /**
         * 두개 이상의 타입을 정의하는 제네릭 코드
         */
        Product<String, String> tv = new Product<>();
        tv.setKey("삼성티비");
        tv.setValue("50인치");
        System.out.println(tv.getKey());
        System.out.println(tv.getValue());

        Product<String, String> car = new Product<>();
        car.setKey("람보르기니");
        car.setValue("겁나 빨라");
        System.out.println(car.getKey());
        System.out.println(car.getValue());
    }

    @Test
    void genericMethodTest() {
        /**
         * 제네릭 메서드
         * 매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메서드를 말한다.
         * 선언 방법은 리턴 타입 앞에 <> 기호를 추가하고 타입 파라미터를 기술한 다음
         * 리턴 타입과 매개 타입으로 타입 파아미터를 사용하면 된다.
         */
        // 매개값을 보고 타입을 추정
        Box<String> boxing = Box.boxing("");
        // 명시적으로 구체적 타입을 지정
        Box<String> boxing2 = Box.<String>boxing("");

        Product<String, String> tv = new Product<>();
        tv.setKey("삼성티비");
        tv.setValue("50인치");

        Product<String, String> tv2 = new Product<>();
        tv2.setKey("삼성티비");
        tv2.setValue("50인치");

        Product<String, String> car = new Product<>();
        car.setKey("람보르기니");
        car.setValue("겁나 빨라");

        // 매개값을 보고 타입을 추정
        System.out.println(Product.compare(tv, car));
        // 명시적으로 구체적 타입을 지정
        System.out.println(Product.<String, String>compare(tv, tv2));
    }

    @Test
    void extendsGenericTest() {
        /**
         * 제한된 타입 파라미터
         * 타입 파라미터에 지정되는 구체적인 타입을 제한할 필요가 종종 있다.
         * 제한된 타입 파라미터를 선언하려면 타입 파라미터 뒤에 extends 키워드를 붙이고 상위 타입을 명시하면 된다.
         * 상위 타입은 클래스뿐 아니라 인터페이스도 가능하고 인터페이스라 해서 implements를 사용하지 않는다.
         *
         * 주의할 점은 메서드의 문 안에서 타입 파라미터 변수로 사용 가능한 것은 상위 타입의 프로퍼티나 메서드로 제한된다.
         * 하위 타입에만 있는 프로퍼티나 메서드는 사용할 수 없다.
         */

        System.out.println(Util.compare(3, 2));
        System.out.println(Util.compare(3.14, 3.14));
        System.out.println(Util.compare(3, 3.14));
    }

    @Test
    void wildcardGenericTest() {
        /**
         * 와일드카드 타입
         * 코드에서 ?를 일반적으로 와일드카드라고 부른다.
         * 제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 구체적인 타입 대신에 와일드카드를 사용할 수 있다.
         *
         * 종류는 다음과 같다.
         *
         * 1. <?>: 제한 없음
         * 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다.
         *
         * 2. <? extends 상위타입>: 상위 클래스 제한
         * 타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 하위 타입만 올 수 있다.
         *
         * 3. <? super 하위타입>: 하위 클래스 제한
         * 타입 파라미터를 대치하는 구체적인 타입으로 하위 타입이나 상위 타입이 올 수 있다.
         */
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<Student>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        Course.registerCourse(personCourse);
        Course.registerCourse(workerCourse);
        Course.registerCourse(studentCourse);
        Course.registerCourse(highStudentCourse);
        System.out.println();

        // Course.registerCourseStudent(personCourse);
        // Course.registerCourseStudent(workerCourse);
        Course.registerCourseStudent(studentCourse);
        Course.registerCourseStudent(highStudentCourse);
        System.out.println();

        Course.registerCourseWorker(personCourse);
        Course.registerCourseWorker(workerCourse);
        // Course.registerCourseWorker(studentCourse);
        // Course.registerCourseWorker(highStudentCourse);
        System.out.println();
    }

    @Test
    void childTest() {
        ChildProduct<String, String, String> product = new ChildProduct<>();
        product.setKey("TV");
        product.setValue("50인치 TV");
        product.setCompany("SamSong");
        System.out.println(product.getKey() + " : " + product.getValue() + " : " + product.getCompany());

        StorageImpl<String> stringStorage = new StorageImpl<>(10);
        stringStorage.add("item", 2);
        System.out.println(stringStorage.get(2));
    }
}
