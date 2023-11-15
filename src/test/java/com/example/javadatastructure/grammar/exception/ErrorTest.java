package com.example.javadatastructure.grammar.exception;

public class ErrorTest {
    private String name;

    public ErrorTest() {
    }

    public ErrorTest(String name) {
        this.name = name;
    }

    public void print() throws Exception {
        if (this.name == null) throw new Exception("예외발생");
        System.out.println(this.name);
    }

    public void userExceptionTest() throws UserException {
        throw new UserException("사용자 정의 예외 발생");
    }
}
