package com.example.javadatastructure.grammar.variable;

import org.junit.jupiter.api.Test;

/**
 * 참조 타입
 *
 * 기본 타입과 다르게 참조 타입인 변수는 메모리의 번지를 주소로 가진다.
 * 번지를 통해 객체를 참조한다는 뜻에서 참조타입이라고 불린다.
 *
 * 배열, 열거, 클래스, 인터페이스 타입을 의미한다.
 */
public class Reference {
    @Test
    void stack_heap() {
        int age = 28; // stack에 선언됨.
        String name = "최동철"; // stack에 메모리 주소가 있고 heap에 실제 값이 있음.
    }

    @Test
    void memory() {
        /**
         * JVM
         *
         * 1. 메서드 영역
         * 코드에서 사용되는 클래스들을 클래스 로더로 읽어 클래스별로 런타임 상수풀, 필드 데이터, 메서드 데이터, 메서드 코드, 생성자 코드등을 분류해서 저장한다.
         *
         * 2. 힙 영역
         * 객체와 배열이 생성되는 영역이다.
         * 힙 영역에 생성된 객체와 배열은 JVM 스택 영역의 변수나 다른 객체의 필드에서 참조한다.
         *
         * 참조하는 변수나 필드가 없다면 의미없는 객체가 되기 때문에 이것을 쓰레기로 취급하고 쓰레기 객체를 힙 영역에서 자동으로 제거한다.
         * 이것을 Garbage Collector라고 부른다.
         *
         * 개발자는 객체를 제거하기 위해 별도의 코드를 작성할 필요가 없으며 코드로 객체를 제거할 방법 자체를 제공하지 않는다.
         *
         * 3. 스택 영역
         * 각 스레드마다 하나씩 존재하며 스레드가 시작될 때 할당된다.
         * 프로그램에서 추가적으로 스레드를 생성하지 않았다면 main 스레드만 존재하므로 스택도 하나다.
         *
         * 스택은 메서드를 호출할 때마다 프레임을 push하고 메서드가 종료되면 해당 프레임을 pop하는 동작을 수행한다.
         * 예외 발생시 printStackTrace() 메서드로 보여주는 Stack Trace의 각 라인은 하나의 프레임을 표현한다.
         *
         * 프레임 내부에는 로컬 변수 스택이 있는데, 기본 타입 변수와 참조 타입 변수가 push되거나 pop된다.
         * 변수가 이 영역에 생성되는 시점은 초기화가 될 때, 즉 최초로 변수에 값이 저장될 때 이다.
         * 변수는 선언된 블록 안에서만 스택에 존재하고 블록을 벗어나면 스택에서 제거된다.
         */
        char v1 = 'a'; // 스택에 v1 변수가 push

        // if 블록이 시작
        if (v1 == 'a') {
            int v2 = 100; // 스택에 push
            double v3 = 3.14; // 스택에 push
        } // 블록을 벗어나는 시점에서 v2, v3변수가 pop

        boolean v4 = true; // 스택에 v4 변수가 push

        // scores 변수는 스택에 값의 주소가 있고 힙에 실제 값이 있다.
        int[] scores = { 10, 20, 30 };
    }

    @Test
    void reference_equals() {
        /**
         * 기본 타입 변수의 ==, != 연산은 변수의 값이 같은지, 아닌지를 조사함.
         * 참조 타입 변수들 간의 ==, != 연산은 동일한 객체를 참조하는지, 다른 객체를 참조하는지 알아볼 때 사용된다.
         *
         * 참조 타입 변수의 값을 힙 영역의 객체 주소이므로 결국 주소 값을 비교하는 것이 된다.
         * 동일한 주소 값을 갖고 있다는 것은 동일한 객체를 참조한다는 의미이다.
         */
        String name1 = "최동철";
        String name2 = name1;
        String name3 = "donchoi";

        // 주소값을 비교하는 중...
        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false
        System.out.println(name2 == name3); // false
    }

    @Test
    void reference_null() {
        /**
         * 참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null값을 가질 수 있다.
         * null도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다.
         */
        String v1 = "최동철";
        String v2 = null;

        System.out.println(v1 == null); // false
        System.out.println(v2 == null); // true

        /**
         * 예외: 프로그램 실행 도중에 발생하는 오류
         *
         * 예외는 사용자의 잘못된 입력으로도 발생할 수 있고, 프로그래머가 코드를 잘못 작성해서 발생할 수도 있다.
         * 참조 타입을 사용하게 되면 가장 많이 발생하는 예외가 NullPointerException이다.
         *
         * 참조 타입 변수가 null을 가지고 있을 경우, 참조 타입 변수는 사용할 수 없다.
         * 참조 타입 변수를 사용하는 것은 곧 객체를 사용하는 것을 의미하는데, 참조할 객체가 없으므로 사용할 수가 없는 것이다.
         * 그러나 프로그래머의 실수로 null값을 가지고 있는 참조 타입 변수를 사용하면 NullPointerException이 발생한다.
         */
        int[] arr = null;
        // arr[0] = 10; // NullPointerException 발생

        String name = null;
        // System.out.println(name.length()); // NullPointerException 발생
    }

    @Test
    void type_string() {
        /**
         * 아래 변수들은 String 변수에 저장되지 않는다.
         * 문자열은 String 객체로 생성되고 변수는 String 객체를 참조한다.
         * name, hobby 변수는 stack에 선언되고 문자열 리터럴의 주소를 가지고있으며, "신용권", "JAVA" 리터럴은 heap에 생성된다.
         */
        String name = "신용권";
        String hobby = "JAVA";

        /**
         * new 연산자를 사용하여 String 객체를 사용하는 경우 다른 객체가 생성된다.
         * 값은 같아도 다른 객체여서 == 연산을 할 경우 false 발생
         * 다른 객체의 값이 동등한지 확인하는 경우 equals() 연산을 사용해야 함.
         */
        String name2 = name;
        String name3 = new String("신용권");

        System.out.println(name == name2); // true
        System.out.println(name == name3); // false
        System.out.println(name.equals(name3)); // true
    }

    @Test
    void type_array() {
        /**
         * 같은 타입의 데이터를 연속된 공간에 나열시키고, 각 데이터에 인덱스를 부여한 자료구조
         * 다른 타입의 데이터를 저장하려고 하면 컴파일 오류가 발생한다.
         *
         * 한번 생성된 배열의 길이는 늘리거나 줄일 수 없다.
         */
        int[] score = { 80, 90, 100, 100, 100 };
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        avg = sum / score.length;

        System.out.println(sum);
        System.out.println(avg);

        /**
         * 배열도 객체이므로 heap 영역에 생성되고 배열을 선언한 변수는 heap 영역의 객체를 참조한다.
         * 참조할 배열 객체가 없다면 배열 변수는 null값으로 초기화할 수 있다.
         *
         * 만약 배열 변수가 null값을 가진 상태에서 변수로 값을 읽거나 저장하게 되면 NullPointerException이 발생한다.
         * 배열 변수는 배열을 생성하고 참조하는 상태에서 값을 저장하거나 읽어야 한다.
         */
        String[] names = null;
        // System.out.println(names[0]); // NullPointerException 발생
        // names = { "김영한", "이일민", "남궁성" }; // 컴파일 오류 발생
        names = new String[]{ "김영한", "이일민", "남궁성", "무명의 개발자" };
        names[3] = "최동철";

        for (String name : names) {
            System.out.println(name);
        }

        /**
         * 배열을 바로 선언하면 new 연산자를 사용하지않고 바로 선언 가능하다.
         */
        String[] strs = { "1", "2", "3", "4", "5" };
        for (String str : strs) {
            System.out.println(str);
        }

        /**
         * new 연산자로 생성할 때 길이를 정해주고 설정
         * int의 경우 0으로 초기화되고 String의 경우 null로 초기화된다.
         */
        int[] score2 = new int[30];
        String[] names2 = new String[30];
        for (int i = 0; i < score2.length; i++) {
            System.out.println(score2[i]);
            System.out.println(names2[i]);
        }

        /**
         * 배열의 길이는 array.length에 선언된다. array는 배열객체이다.
         * 객체 내부의 데이터인 length는 read only이다.
         */
        // score2.length = 10; // Error
    }

    @Test
    void type_multi_array() {
        /**
         * 원시타입 다차원 배열
         */
        // scores는 stack에 선언되고 heap에 scores 객체가 할당된다.
        // scores 객체에는 행 2개의 메모리 주소가 있다.
        // 2개의 메모리 주소로 넘어가면 실제로 연속된 값이 3개가 있다.
        int[][] scores = new int[2][3];
        System.out.println(scores.length);
        for (int[] s : scores) {
            System.out.println(s.length);
        }

        /**
         * 참조타입 다차원 배열
         */
        // strs는 stack에 선언되고 heap에 strs 객체가 할당된다.
        // strs 객체에는 행 3개의 메모리 주소가 있다.
        // 3개의 메모리 주소를 넘어가면 실제로 연속된 값이 있다.
        String[] strs = new String[3];
        strs[0] = "C";
        strs[1] = "C++";
        strs[2] = "JAVA";
        for (String s : strs) {
            System.out.println(s);
        }

        /**
         * String[]의 경우 배열 항목간의 문자열을 비교하기 위해서는 == 연산자대신 equals() 메서드를 사용해야 한다.
         * ==는 객체의 번지를 비교하기 때문에 문자열 비교에 사용할 수 없다.
         */
        strs[0] = new String("JAVA");
        strs[1] = "JAVA";
        System.out.println(strs[0] == strs[2]); // false
        System.out.println(strs[0].equals(strs[2])); // true

        System.out.println(strs[1] == strs[2]); // true
        System.out.println(strs[1].equals(strs[2])); // true

        /**
         * 베열을 복사하기 위해서는 for문을 사용하거나 System.arraycopy()를 사용한다.
         * 여기서는 System.arraycopy()를 사용하는 방법만 적어본다.
         *
         * 얕은 복사: 복사되는 값이 stack에서 객체의 번지가 복사됨.
         * heap에서 참조하는 객체가 이전에 참조하는 객체와 동일한 것.
         *
         * 깊은 복사: 참조하는 객체도 별도로 생성되는 것.
         */
        int[] oldArr = { 1, 2, 3 };
        int[] newArr = new int[5];
        // src: oldArr, dest: newArr
        // src의 0번째 주소부터 dest의 0번째 주소에 oldArr.length만큼 복사한다.
        System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
    }

    @Test
    void type_enum() {
        /**
         * 열거 타입
         * 한정된 값만을 가지는 데이터 타입이며 하나 이상의 상수를 저장하는 타입이다.
         *
         * 관례적으로 파스칼 케이스를 사용한다.
         */
        // 참조타입이라서 Week를 자료형으로 가진다.
        // String i = Week.MONDAY;
        Week w = Week.SUNDAY;
        System.out.println(w);
        System.out.println(Week.MONDAY);
        w = null; // 참조타입이라 null 할당 가능
        System.out.println(w);

        /**
         * 열거 상수는 객체이다. heap 영역에 할당이 되게 된다.
         * 열거 타입 변수를 선언하게 되면 stack에 heap영역의 주소가 할당된다.
         *
         * 그래서 같은 열거상수를 참조하기에 == 연산자를 사용한 연산결과는 true가 나온다.
         */
        Week week = Week.SUNDAY;
        System.out.println(week == Week.SUNDAY); // true

        /**
         * 열거 타입의 메서드
         * 모든 열거타입은 컴파일시 Enum 클래스를 상속받는다.
         * 그래서 Enum 클래스의 메서드를 사용할 수 있다.
         */
        // name(): 열거 객체가 가진 문자열을 반환한다. 문자열은 열거 타입을 정의할 때 사용한 상수 이름과 같다.
        String name = week.name();
        System.out.println(name); // SUNDAY

        // ordinal(): 열거 객체가 가진 순번을 반환한다. 순번은 열거 타입을 정의할 때의 순번을 말한다.
        int ordinal = week.ordinal();
        System.out.println(ordinal); // 6

        // compareTo(): 매개값으로 주어진 열거 객체를 기준으로 전후로 몇번째 위치하는지 비교한다. (음수면 앞, 양수면 뒤)
        Week monday = Week.MONDAY;
        Week wednesday = Week.WEDNESDAY;
        System.out.println(monday.compareTo(wednesday)); // -2 (monday가 wednesday보다 2칸 앞)
        System.out.println(wednesday.compareTo(monday)); // 2 (wednesday가 monday보다 2칸 뒤)

        // valueOf(): 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 반환한다.
        Week week1 = Week.valueOf("SATURDAY");
        System.out.println(week1);
        // Week week2 = Week.valueOf("saturday"); // Error
        // Week week3 = Week.valueOf(""); // Error
        // System.out.println(week2);
        // System.out.println(week3);

        // values(): 열거 타입의 모든 열거 객체들을 배열로 만들어서 반환한다.
        Week[] days = Week.values();
        for (Week day : days) {
            System.out.println(day);
        }
    }
}
