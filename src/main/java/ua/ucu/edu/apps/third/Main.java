package ua.ucu.edu.apps.third;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        PDLReader pdl = new PDLReader();
        pdl.parse("https://github.com/hellcastter/oop-lab13");
    }
}
