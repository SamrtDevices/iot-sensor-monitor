package com.cxing.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cxing on 2018/1/26.
 */

@SpringBootApplication
@ComponentScan({"com.cxing.iot"})
@EnableAutoConfiguration()
public class IotSensorMonitorWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotSensorMonitorWebApplication.class, args);
    }
}
