package com.github.bootstrap.factory;

import com.github.bootstrap.pojo.Color;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 创建一个 Spring 定义的 FactoryBean
 *
 * <p>
 * 创建时间为 下午3:52-2019/1/28
 * 项目名称 SpringBootBootstrap
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class DemoFactoryBean implements FactoryBean<Color> {


    /**
     * @return 返回一个 Color 对象,这个对象会天机到容器中
     * @throws Exception Exception
     */
    @Override
    public Color getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
