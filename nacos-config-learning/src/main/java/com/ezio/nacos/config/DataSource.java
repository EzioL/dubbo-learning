package com.ezio.nacos.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @creed: Here be dragons !
 * @author: EzioQAQ
 * @Time: 2019-07-15 18:05
 */
@Configuration
@NacosConfigurationProperties(dataId = "datasource", autoRefreshed = true)
public class DataSource {

    private String url;

    private String userName;

    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
