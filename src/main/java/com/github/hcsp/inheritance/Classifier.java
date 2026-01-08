package com.github.hcsp.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Classifier {
    /**
     * 给定一个包含任意对象的列表，将其按照以下方式分类： 如果对象是Number类型，将其放入numberList； 如果对象是String类型，将其放入stringList；
     * 否则，将其放入otherList
     */
    public static void main(String[] args) {
        List<Object> list = Arrays.asList("0", 1, 2L, "3", new Object());
        List<Number> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Object> others = new ArrayList<>();

        classify(list, numbers, strings, others);

        System.out.println("numbers = " + numbers);
        System.out.println("strings = " + strings);
        System.out.println("others = " + others);
    }

    public static void classify(
            List<Object> list,
            List<Number> numberList,
            List<String> stringList,
            List<Object> otherList) {


        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof Number) {
                numberList.add((Number) obj);
            } else if (obj instanceof String) {
                stringList.add((String) obj);
            } else {
                otherList.add(obj);
            }
        }
    }
}