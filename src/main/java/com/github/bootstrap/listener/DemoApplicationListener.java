package com.github.bootstrap.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 创建时间为 下午3:46-2019/1/28
 * 项目名称 SpringBootBootstrap
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class DemoApplicationListener implements ApplicationListener<ApplicationEvent> {


    /**
     * @param event 当容器中发布此事件以后,方法触发
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("收到事件:" + event);
    }

}
