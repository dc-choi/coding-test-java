package com.example.javadatastructure.grammar.object;

import java.lang.annotation.*;

/**
 * 어노테이션
 * 어플리케이션단에서 처리해야하는 데이터가 아님.
 * 컴파일 시점과 런타임 시점에서 코드를 어떻게 컴파일하고 처리할 것인지를 알려주는 정보
 *
 * 다음 용도로 사용된다고 한다.
 * 1. 컴파일러에게 코드 문법 에러를 체크하도록 정보를 제공
 * 2. 소프트웨어 개발 툴이 빌드나 배치 시 코드를 자동으로 생성할 수 있도록 정보를 제공
 * 3. 런타임시 특정 기능을 실행하도록 정보를 제공
 */
@Documented
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD}) // 이 어노테이션은 클래스, 인터페이스, 열거 타입, 필드, 메서드에 선언이 된다.
@Retention(RetentionPolicy.RUNTIME) // 런타임에도 리플렉션을 사용해서 어노테이션 정보를 알 수 있다.
public @interface AnnotationTest {
    // 필드를 다음과 같이 선언하고 기본값을 설정할 수 있다.
    int age() default 28;

    /**
     * 어노테이션 적용대상
     * java.lang.annotation.ElementType에 열거 상수로 다음과 같이 정의됨.
     * @Target()과 함께 쓰인다.
     *
     * TYPE: 클래스, 인터페이스, 열거 타입
     * ANNOTATION_TYPE: 어노테이션
     * FIELD: 필드
     * CONSTRUCTOR: 생성자
     * METHOD: 메서드
     * LOCAL_VARIABLE: 로컬 변수
     * PACKAGE: 패키지
     *
     * 8버전 추가
     * TYPE_PARAMETER: 타입 파라미터(제네릭)
     * 타입검사, 컴파일 타임 인증, 문서화에 사용됨.
     *
     * TYPE_USE: 모든 타입에 대한 파라미터
     * 제네릭 타입과 유연성, 타입 캐스트와 형 변환, 인스턴스 검사(instanceof) 연산, throws 절과 예외 처리에 사용됨.
     *
     * 9버전 추가
     * MODULE: 모듈
     * 모듈 정보, 모듈 의존성 관리, 액세스 제어에 사용됨.
     *
     * 16버전 추가
     * RECORD_COMPONENT: record로 정의된 클래스의 각 컴포넌트
     * 컴포넌트에 대한 추가 정보, 컴포넌트의 유효성 검사, 직렬화 및 역직렬화 관련 어노테이션
     */

    /**
     * 어노테이션 적용 정책
     * java.lang.annotation.RetentionPolicy에 열거상수로 다음과 같이 정의됨.
     * @Retention()과 같이 쓰임
     *
     * SOURCE: 소스상에서만 어노테이션 정보를 유지한다.
     * CLASS: 바이트 코드 파일까지 어노테이션 정보를 유지한다.
     * RUNTIME: 리플렉션을 이용해서 런타임 시 어노테이션 정보를 얻는다.
     */
}
