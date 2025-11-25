package org.example;

import org.example.solutions.StringCompression;

import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {
//        int n = 175;
//        conjectureClevakina(n);
//        conjectureCollatz(n);
        char [] t1 = {'a','a','b','b','c','c','c'};
        StringCompression stringCompression = new StringCompression();
        System.out.println(stringCompression.compress(t1));
        char [] t2 = {'a','a','b','b','c','c','c','a','a'};
        System.out.println(stringCompression.compress(t2));
        char [] t3 = {'a'};
        System.out.println(stringCompression.compress(t3));
        char [] t4 = {'a','b','a'};
        System.out.println(stringCompression.compress(t4));
    }
    public static ArrayList<Float> conjectureClevakina (float n) {
        ArrayList<Float> arrayList = new ArrayList<>();
        System.out.println("Исходное значение числа " + n);
        int stepCount = 0;
        while (n != 1) {
            stepCount++;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 1.5f) + 0.5f;
            }
            arrayList.add(n);
            System.out.println("На шаге " + stepCount + " значение n равно " + n);
        }
        System.out.println("stepCount = " + stepCount);
        return arrayList;
    }
    public static ArrayList<Integer> conjectureCollatz (int n) {
        //создадим коллекцию для хранения всего ряда чисел
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Исходное значение числа " + n);
        //создадим переменную для хранения количества шагов
        int stepCount = 0;
        while (n != 1) {
            //увеличиваем значение счетчика шагов
            stepCount++;
            //если число четное, то делим на 2
            if (n % 2 == 0) {
                n /= 2;
                //если число нечетное, то умножаем на 3 и прибавляем 1
            } else {
                n = (n * 3) + 1;
            }
            //добавляем текущее число в коллекцию
            arrayList.add(n);
            //выводим текущее значение
            System.out.println("На шаге " + stepCount + " значение n равно " + n);
        }
        //выводим количество шагов алгоритма
        System.out.println("stepCount = " + stepCount);
        //возвращаем значение коллекции
        return arrayList;
    }
    public static int recursive_delim_konfety (int n) {
        if (n == 1) {
            return 1;
        }
        n = n - (n / 2);
        return  recursive_delim_konfety(n) + 1;
    }
    public static int non_recursive_delim_konfety (int n) {
        int ans = 0;
        while (n > 1) {
            n = n - (n / 2);
            //System.out.println("n="+n);
            ans++;
            //System.out.println("ans="+ans);
        }
        if (n == 1) {
            ans++;
        }
        return ans;
    }
}