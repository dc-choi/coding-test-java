package com.example.javadatastructure.grammar.object;

public class Car implements Machine, Engine {
    private String name;
    private String color;
    private int nowSpeed;
    private int maxSpeed;
    public static final int HIGHWAY_SPEED = 110;

    public Car() {
        this("car", "red", 0, 200);
    }

    public Car(String name) {
        this(name, "red", 0, 200);
    }

    public Car(String name, String color, int maxSpeed) {
        this(name, color, 0, maxSpeed);
    }

    public Car(String name, String color, int nowSpeed, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.nowSpeed = nowSpeed;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", nowSpeed=" + nowSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNowSpeed() {
        return nowSpeed;
    }

    public void setNowSpeed(int nowSpeed) {
        this.nowSpeed = nowSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void accelerator() {
        if (this.maxSpeed > this.nowSpeed) this.nowSpeed += 1;
    }

    void accelerator(int speed) {
        if (this.maxSpeed >= speed) this.nowSpeed += speed;
    }

    void brake() {
        if (this.nowSpeed > 0) this.nowSpeed = 0;
    }

    void brake(int speed) {
        if (this.nowSpeed > 0) this.nowSpeed -= speed;
    }

    static int highwaySpeed() {  return Car.HIGHWAY_SPEED; }
}
