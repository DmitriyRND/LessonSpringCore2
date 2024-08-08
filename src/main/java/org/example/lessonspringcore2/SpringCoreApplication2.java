package org.example.lessonspringcore2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreApplication2 {
    public static void main(String[] args) {
        var context  = new AnnotationConfigApplicationContext(SpringConfig.class);

        Auto auto1 = context.getBean("auto1", Auto.class);
        Auto auto2 = context.getBean("auto2", Auto.class);
        Auto auto3 = context.getBean("auto3", Auto.class);

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);

    }
}
