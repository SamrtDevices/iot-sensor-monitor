/**
 * 2018/1/26
 */
 
package com.cxing.iot.web.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author (changxu.xcx)
 * @version 1.0.0
 * @since 1.0.0
 */
@Component
@RabbitListener(queues = "hello")
public class MqReceiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }
}
