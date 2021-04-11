package com.jurnal1;

public class Main {
    public static void main(String[] args) {
        UndoRedoWeb<String> history = new UndoRedoWeb<>();
        history.tambahData("https://www.google.com");
        history.tambahData("https://www.youtube.com");
        history.tambahData("https://www.facebook.com");

        history.back();
        history.forward();
        history.tambahData("https://www.stackoverflow.com");
        history.forward();
        history.back();
        history.back();
        history.back();
        history.forward();
    }
}
