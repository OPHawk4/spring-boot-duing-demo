package com.duing.jasyptUtil;

import org.jasypt.util.text.BasicTextEncryptor;

public class jasyptUtilTest {
    public static void main(String[] args) {
        BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword("123456789!@#");
        String user = basicTextEncryptor.encrypt("王君成");
        String password = basicTextEncryptor.encrypt("wjc921224");
        System.out.println(user);
        System.out.println(password);

//        PTF+AqAsgQmCXkVIrr1x9SqHi5cnTQh9
//                +akAIf8ETQvYZ+ccR35cIiyfMhECW5aX
    }
}
