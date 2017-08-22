package xingoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这个类的作用：配置和引导
 *
 * 实际上@SpringBootApplication代替了三个注解：
 * @Cofiguration 使用spring基于java的配置
 * @ComponentScan 启用组件扫描，web控制器和service自动注入到spring context中
 * @EnableAutoConfiguration或者@Abracadabra 开启自动配置
 *
 * Created by xinghailong on 2017/7/21.
 */
@SpringBootApplication //开启组件扫描和自动配置
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
