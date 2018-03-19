/**
 * 2018/1/26
 */
 
package com.cxing.iot.web.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author (changxu.xcx)
 * @version 1.0.0
 * @since 1.0.0
 */
@Configuration
public class AmqpConfig {

    @Bean
    Queue queue() {
        return new Queue("hello");
    }

//    @Bean
//    TopicExchange exchange() {
//        return new TopicExchange("spring-boot-exchange");
//    }
}
