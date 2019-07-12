package cn.itcast;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AspectTest{
    @Autowired
    @Qualifier("target")
    private Target target;
    /**
     * 配置文件测试
     */
    @Test
    public void demo1(){
        target.save ();
    }


}
