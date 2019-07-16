package com.ezio.nacos;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.ezio.nacos.config.DataSource;
import java.lang.annotation.Retention;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @creed: Here be dragons !
 * @author: EzioQAQ
 * @Time: 2019-07-15 18:01
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class NacosApplicationTest {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Autowired
    private DataSource dataSource;


    @Test
    public void test() {
        System.out.println(useLocalCache);
        System.out.println(dataSource);

    }
}
