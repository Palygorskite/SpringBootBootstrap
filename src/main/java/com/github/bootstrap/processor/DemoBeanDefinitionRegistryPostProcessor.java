package com.github.bootstrap.processor;

import com.github.bootstrap.pojo.Blue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 创建时间为 下午3:49-2019/1/28
 * 项目名称 SpringBootBootstrap
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class DemoBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    /**
     * BeanDefinitionRegistry Bean定义信息的保存中心,
     * 以后 BeanFactory 就是按照 BeanDefinitionRegistry里面保存的每一个 bean 定义信息创建 bean 实例
     * (bean 的类型, id ,单例还是多例)
     *
     * @param registry registry
     * @throws BeansException BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {

        System.out.println("postProcessBeanDefinitionRegistry:" + registry.getBeanDefinitionCount());


        // 创建 bean 的定义
        AbstractBeanDefinition definition = BeanDefinitionBuilder.rootBeanDefinition(Blue.class).getBeanDefinition();
        // 将 bean 的定义注册到容器中
        registry.registerBeanDefinition("hello", definition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory:" + beanFactory.getBeanDefinitionCount());
    }
}
