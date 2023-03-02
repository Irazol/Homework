package Lesson21.Task1;

import Lesson21.Task1.Candidate;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = (char) 27 + "[35m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[32m";
        String s3 = (char) 27 + "[33m";
        String s4 = (char) 27 + "[36m";

        Class candidate = Candidate.class;

        System.out.println(s4 + "Information about class Candidate");

        System.out.println(s + " \nFields:" + s1);
        Field[] fields = candidate.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println(s2 + "Name of field: " + s1 + field.getName());
            System.out.println(s1 + "\ttype: "+ fieldType.getName());
        }

        System.out.println(s + " \nConstructors:" + s1);
        Constructor[] constructors = candidate.getConstructors();
        for (Constructor constructor : constructors) {
             System.out.println(s3 +"\ttype of parameter  : "+ s1+Arrays.toString(constructor.getParameterTypes()));
        }

        System.out.println(s + " \nMethods:" + s1);
        Method[] methods = candidate.getMethods();
        for (Method method : methods) {
            System.out.println(s2 + "Name of method: " + s1 + method.getName()+";");
            System.out.println(s3 +"\ttype of parameter  : "+ s1 + Arrays.toString(method.getParameterTypes()));
            System.out.println(s3 +"\treturn type  : "+ s1 + method.getReturnType());
        }
        System.out.println(s + " \nInterface:" + s1);
        Class [] interfaces = candidate.getInterfaces();
        for (Class interfc: interfaces) {
            System.out.println(s2 + "Name of implements interface: " + s1 + interfc.getName()+";");
        }
        System.out.println(s + " \nSuperclass:" + s1);
        System.out.println(s2 + "Name of Superclass: " + s1 + candidate.getSuperclass()+";");

        System.out.println(s + " \nPackage:" + s1);
        System.out.println(s2 + "Name of Package: " + s1 + candidate.getPackage()+";");



    }
}
