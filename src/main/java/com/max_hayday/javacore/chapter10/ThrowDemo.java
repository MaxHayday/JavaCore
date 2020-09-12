package com.max_hayday.javacore.chapter10;

/**
 * Эта программа получает две возможности для обработки одной и той же ошиб­
 * ки. Сначала в методе ma in ( ) устанавливается контекст исключения, затем вызыва­
 * ется метод demoproc ( ) , где задается другой контекст обработки исключения и сра­
 * зу же генерируется новый экземпляр исключения типа NullPointerException,
 * который перехватывается в следующей строке кода. Затем исключение генериру­
 * ется повторно. Ниже приведен результат, выводимый этой программой.
 */
public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demondtration");
        } catch (NullPointerException e) {
            System.out.println("Exception catches in body of method demopeoc(). ");
            throw e;// generate exception one more time
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Second catch: " + e);
        }
    }
}
