package com.github.bootstrap.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 *
 *
 * 扩展原理
 * BeanFactoryProcessor:bean 后置处理器, bean 创建对象初始化前后进行拦截工作的
 * BeanFactoryPostProcessor:beanFactory 的后置处理器;
 * 在 BeanFactory 标准初始化之后调用;所有的 bean 定于已经保存加载到 beanFactory 但是 bean 的实例还是未创建
 * <p>
 * 1.ioc 容器创建对象
 * 2.invokeBeanFactoryPostProcessors(beanFactory);执行 BeanFactoryPostProcessor;
 * 如何找到所有的 BeanFactoryPostProcessor 并执行他们的方法:
 * 1.直接在 BeanFactory 中找到所有类型是 BeanFactoryPostProcessor 的组件,并执行他们的方法
 * 2.在初始化创建其他组件前面执行
 * <p>
 * BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor
 * postProcessorBeanDefinitionRegistry()
 * 在所有的 bean 定义信息将要被加载, bean 实例还未创建
 * <p>
 * 优先于 BeanFactoryPostProcessor 执行;
 * 利用 BeanDefinitionRegistryPostProcessor 给容器中再添加一些组件;
 * <p>
 * 原理:
 * 1.ioc 创建对象
 * 2.refresh()->invokeBeanFactoryPostProcessors(beanFactory)
 * 3.从容器中获取到所有的 BeanDefinitionRegistryPostProcessor 组件;
 * a.依次触发所有的 postProcessBeanDefinitionRegistry() 方法;
 * b.再来触发 postProcessBeanFactory() 方法;
 * 4.再来从容器中找到 BeanFactoryPostProcessor组件,然后依次触发 postProcessBeanFactory() 方法
 *
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
public class DemoBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("-------------DemoBeanFactoryPostProcessor--------------");
        int count = beanFactory.getBeanDefinitionCount();
        String[] names = beanFactory.getBeanDefinitionNames();
        System.out.println("当前 BeanFactory 中有:" + count);
        Arrays.asList(names).forEach(System.out::println);

    }

}
