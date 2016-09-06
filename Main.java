package com.example.lesson34;

public class Main {
    public static void main(String[] args) {
        for (Apple apple : Apple.values()) {
            System.out.println(apple + " price is " + apple.getPrice() + " cents");
        }
    }
}
