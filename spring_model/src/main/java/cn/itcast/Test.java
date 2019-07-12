package cn.itcast;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext ("applicationContext.xml");
        Target target = (Target) app.getBean ( "target" );
        target.save ();
    }
}
