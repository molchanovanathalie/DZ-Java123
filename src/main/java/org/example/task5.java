//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который
//запишет эту строку в простой текстовый файл, обработайте исключения.

package org.example;
public class task5 {

    public static void main(String[] args) {

        class fiveTask {
            public StringBuilder generateString() {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                    stringBuilder.append("TEST");
                }
                return stringBuilder;
            }
            }
        }
    }

