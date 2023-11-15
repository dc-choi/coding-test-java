package com.example.javadatastructure.grammar.api.lang;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class LangTest {
    @Test
    void langTest() {
        /**
         * java.lang.*
         * JAVA의 기본적인 클래스를 담고 있는 패키지이다.
         * 이 패키지에 있는 클래스와 인터페이스는 import 없이 사용할 수 있다.
         * 지금까지 사용한 String과 System 클래스도 마찬가지이다.
         */
    }

    @Test
    void objectTest() {
        /**
         * 클래스를 선언시 다른 클래스를 상속받지 않으면 암시적으로 Object 클래스를 상속하게 된다.
         * 따라서 자바의 모든 클래스는 Object 클래스의 자식이거나 자손 클래스이다.
         * Object는 자바의 최상위 부모 클래스에 해당한다.
         */
        Object object = new Object();

        /**
         * equals(Object obj)
         * 이 메서드의 매개 타입은 Object인데, 이것은 모든 객체가 매개값으로 대입될 수 있음을 말한다.
         * 그 이유는 Object가 최상위 타입이므로 모든 객체는 Object타입으로 자동 타입 변환될 수 있기 때문이다.
         *
         * Object.equals()는 직접 사용되지 않고 하위 클래스에서 논리적으로 동등 비교할 때 이용된다.
         * 그래서 String.equals()는 객체의 번지를 비교하는 것이 아닌, 문자열이 동일한지 비교하는 로직으로 변경함.
         */
        Object object2 = new Object();
        System.out.println(object.equals(object2));

        /**
         * hashCode()
         * 객체를 식별하는 정수값이며 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴함.
         * HashSet, HashMap, Hashtable은 hashCode()로 비교하고 equals()로 비교한다.
         * 둘 중 하나라도 거짓일 경우 다른 객체로 판단한다.
         */
        System.out.println(object.hashCode());
        System.out.println(object2.hashCode());

        /**
         * toString()
         * 객체의 문자 정보를 리턴한다. 객체를 문자열로 표현한 값을 말한다.
         *
         * Object.toString()는 직접 사용되지 않고 하위 클래스에서 재정의하여 사용된다.
         */
        System.out.println(object.toString());

        /**
         * clone()
         * 객체 복제를 일컫는 말로 원본 객체의 필드값과 동일한 값을 가지는 새로운 객체를 생성하는 것을 말한다.
         * 객체를 복제하는 이유는 원본 객체를 안전하게 보호하기 위해서이다.
         * 신뢰하지 않는 영역으로 원본 객체를 넘겨 작업할 경우 원본 객체의 데이터가 훼손될 수 있기 때문에
         * 복제한 객체를 만들어 신뢰하지 않는 영역으로 넘기는 것이 좋다.
         * 복제된 객체의 데이터가 훼손되더라도 원본 객체는 아무런 영향을 받지 않기 때문에 안전하게 데이터를 보호할 수 있게 된다.
         *
         * 이 메서드는 자신과 동일한 필드값을 가진 얕은 복제된 객체를 리턴한다.
         * 이 메서드로 객체를 복제하려면 원본 객체는 반드시 java.lang.Cloneable 인터페이스를 구현하고 있어야 한다.
         * 메서드 선언이 없음에도 Cloneable 인터페이스를 명시적으로 구현하는 이유는 클래스 설계자가 복제를 허용해도 된다는 의도적인 표시를 위해서다.
         * 클래스 설계자가 복제를 허용하지 않는다면 Cloneable 인터페이스를 구현하지 않으면 된다.
         * Cloneable 인터페이스를 구현하지 않으면 clone()을 호출할 때 예외가 발생한다.
         */

        /**
         * 얕은 복사
         * 단순히 필드값을 복사해서 객체를 복제하는 것을 말한다.
         * 필드값만 복제하기 때문에 필드가 기본 타입일 경우 값 복사가 일어나고, 필드가 참조 타입일 경우에는 객체의 번지가 복사된다.
         */
        Member member = new Member(90L, "동철");
        Member member2 = member.getMember();
        System.out.println(member.name);
        System.out.println(member2.name);
        System.out.println(member.id == member2.id);
        System.out.println(member.name == member2.name);

        member.name = "최동철";
        member.id = 1000L;
        System.out.println(member.name);
        System.out.println(member2.name);
        System.out.println(member.id == member2.id);
        System.out.println(member.name == member2.name);

        /**
         * 깊은 복사
         * 참조하고 있는 객체도 복제하는 것을 말한다.
         * 깊은 복제를 하기 위해서는 clone() 메서드를 재정의해서 참조 객체를 복제하는 코드를 직접 작성해야 한다.
         */

        /**
         * compare(T a, T b, Comparator<T> c)
         * 두 객체를 비교자로 비교해서 int 값을 반환한다.
         * 비교자를 따로 선언해야 한다.
         *
         * a > b: 1
         * a == b: 0
         * a < b: -1
         */
        int result = Objects.compare(member, member2, new Member());
        System.out.println(result); // 1

        /**
         * Objects.equals(Object a, Object b)
         * 두 객체의 동등을 비교한다.
         * a, b 모두 null일 경우 true를 반환한다.
         * a, b가 null이 아닐경우 a.equals(b)의 결과를 리턴한다.
         */
        int a = 10;
        int b = 10;
        System.out.println(Objects.equals(a, b)); // true
        System.out.println(Objects.equals(a, null)); // false
        System.out.println(Objects.equals(null, b)); // false
        System.out.println(Objects.equals(null, null)); // true

        System.out.println("========================================");

        /**
         * Objects.deepEquals(Object a, Object b)
         * 두 객체의 동등을 비교하는데 객체의 번지, 값까지 전부 같다면 true를 리턴한다.
         * Arrays.deepEquals(Object[] a, Object[] b)와 동일하다.
         */
        int[] arr = { 1, 2 };
        int[] arr2 = { 1, 2 };
        System.out.println(Objects.deepEquals(arr, arr2)); // true
        System.out.println(Objects.deepEquals(arr, null)); // false
        System.out.println(Objects.deepEquals(null, arr2)); // false
        System.out.println(Objects.deepEquals(null, null)); // true

        /**
         * Objects.hash(Object ...values)
         * 매개값으로 주어진 값들을 이용해서 해시코드를 생성하는 역할
         * 주어진 매개값들로 배열을 생성하고 Arrays.hashCode(Object[] obj)를 호출해서 해시코드를 얻고 이 값을 반환한다.
         * 이 메서드는 클래스가 hashCode()를 재정의할 때 리턴값을 생성하기 위해 사용하면 좋다.
         */
        System.out.println(Objects.hash(1, 2, 3, 4, 5, 6, 7, 8, 9));

        /**
         * Objects.haseCode(Object obj)
         * 매개값으로 주어한 객체의 해시코드를 반환하기 때문에 obj.hasCode()와 반환값이 동일하다.
         * 차이점은 매개값이 null이면 0을 반환한다.
         */
        System.out.println(object.hashCode());
        System.out.println(Objects.hashCode(object));

        /**
         * Objects.isNull(Object obj)
         * 매개값이 null일 경우 true 반환
         *
         * Objects.nonNull(Object obj)
         * 매개값이 not null일 경우 true 반환
         */
        String str = null;
        System.out.println(Objects.isNull(str)); // true
        System.out.println(Objects.nonNull(str)); // false

        /**
         * Objects.requireNonNull(Object obj, String msg)
         * 첫 번째 매개값이 not null이면 첫 매개값을 리턴하고 null이면 모두 NullPointerException 반환
         * 두 번째 매개값은 NullPointerException의 예외 메시지를 제공한다.
         */
        try {
            Objects.requireNonNull(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Objects.requireNonNull(str, "이름이 없습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Objects.requireNonNull(str, () -> "이름이 없다니께~");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
