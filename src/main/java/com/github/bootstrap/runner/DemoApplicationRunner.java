package com.github.bootstrap.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 创建时间为 下午3:40-2019/1/28
 * 项目名称 SpringBootBootstrap
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Component
public class DemoApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner");
    }

}
