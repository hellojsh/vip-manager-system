package cn.vip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("cn.vip.mapper")
@SpringBootApplication
public class VipManagerSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VipManagerSystemApplication.class, args);
    }

}
