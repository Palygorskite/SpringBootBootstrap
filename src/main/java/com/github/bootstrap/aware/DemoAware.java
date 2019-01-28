package com.github.bootstrap.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * <p>
 * 创建时间为 下午3:44-2019/1/28
 * 项目名称 SpringBootBootstrap
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class DemoAware implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

    private ApplicationContext context;

    @Override
    public void setBeanName(String name) {
        System.out.println("当前 bean 的名字:" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("传入的 IOC:" + applicationContext);
        this.context = applicationContext;
    }

    /**
     * @param resolver spring 的表达式都是用 resolver 解析
     */
    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String value = resolver.resolveStringValue("你好 ${os.name}, 我是#{2*4}");
        System.out.println("解析的字符串:" + value);
    }
}
