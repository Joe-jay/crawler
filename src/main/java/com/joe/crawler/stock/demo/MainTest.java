package com.joe.crawler.stock.demo;

import java.util.Objects;

public class MainTest {
    public static void main(int[] args) {
        System.out.println("int main"+args[0]);
    }
    public static void main(String[] args) {
        System.out.println("int main"+args[0]);
    }
    public static void main(Objects[] args) {
        System.out.println("int main"+args[0]);
    }
}
