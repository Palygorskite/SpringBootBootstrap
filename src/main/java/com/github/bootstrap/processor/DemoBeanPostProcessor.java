package com.github.bootstrap.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 将后置处理器加入到容器
 *
 * <p>
 * 创建时间为 下午3:48-2019/1/28
 * 项目名称 SpringBootBootstrap
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class DemoBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization...." + beanName + "=>" + bean);
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization...." + beanName + "=>" + bean);
        return null;
    }

}
