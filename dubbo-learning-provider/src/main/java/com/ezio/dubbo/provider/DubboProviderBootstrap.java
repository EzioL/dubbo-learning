package com.ezio.dubbo.provider;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;


/**
 * @author ezio
 */
@EnableAutoConfiguration
public class DubboProviderBootstrap {

    public static void main(String[] args) {

        new SpringApplicationBuilder(DubboProviderBootstrap.class).run(args);
    }
}
