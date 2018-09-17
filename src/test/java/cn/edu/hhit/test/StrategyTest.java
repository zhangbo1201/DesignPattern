package cn.edu.hhit.test;


import com.google.common.collect.Maps;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import strategy.AliContextStrategy;
import strategy.ContextStrategyFactory;
import strategy.IContextStrategy;

import java.util.Map;

/**
 * @author zhangbo
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/8/2110:06
 */
public class StrategyTest {
    ClassPathXmlApplicationContext ctx;
    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext(
                "spring-web.xml",
                "spring-service.xml");
    }
    @Test
    public void testdoStrategy(){
        ContextStrategyFactory contextStrategyFactory = ctx.getBean(ContextStrategyFactory.class);
        IContextStrategy contextStrategy =  contextStrategyFactory.getStrategy(AliContextStrategy.class.getName().toString());
        Map map = Maps.newConcurrentMap();
        map.put("1","张波");
        contextStrategy.staff(map);
    }
}
