package com.jurnal1;

import java.util.Stack;

public class UndoRedoWeb<E> {
    private Stack undoWeb;
    private Stack redoWeb;

    public UndoRedoWeb() {
        this.undoWeb = new Stack();
        this.redoWeb = new Stack();
    }

    public void tambahData(E dataTambah) {
        try {
            undoWeb.push(dataTambah);
            redoWeb.clear();
            System.out.println("\n" + dataTambah + " dibuka");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void back() {
        try {
            if (undoWeb.isEmpty()) {
                System.out.println("List undo kosong");
            } else {
                E value = (E) undoWeb.pop();
                redoWeb.push(value);
                System.out.println("\nMundur ke alamat " + undoWeb.peek());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void forward() {
        if (redoWeb.isEmpty()) {
            System.out.println("\nList Redo Kosong");
        } else {
            try {
                System.out.println("\nMaju ke alamat " + redoWeb.peek());
                E value = (E) redoWeb.pop();
                undoWeb.push(value);
            } catch (Exception err) {
                System.out.println(err);
            }
        }
    }
}
