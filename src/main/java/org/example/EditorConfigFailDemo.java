package org.example;

public class EditorConfigFailDemo {
    public static void main(String[] args) {
        String properlyIndentedString = "properly indented string";
        //@formatter:off
            String badlyIndentedString = "badly indented string";
        //@formatter:on
    }

}
