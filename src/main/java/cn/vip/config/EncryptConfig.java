package cn.vip.config;

import cn.vip.utils.EncryptUtil;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * 将MD5加密工具放入容器里
 * @author Taeyeon
 * @create 2019-06-10 13:55
 */
@Configurable
public class EncryptConfig {
    @Bean
    public EncryptUtil encryptUtil() {
        return EncryptUtil.getInstance();
    }
}
