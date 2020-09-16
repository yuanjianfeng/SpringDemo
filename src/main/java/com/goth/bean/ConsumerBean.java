package com.goth.bean;

import com.goth.spring.Autowrited;
import com.goth.spring.Componet;

/**
 * @Description TODO
 * @Author yuan.jianfeng
 * @Date 2020/9/16  11:35 上午
 */
@Componet("consumerBean")
public class ConsumerBean {

    @Autowrited
    private ProviderBean providerBean;

    public void consumerMethod(){
        providerBean.ProviderMethod("consumer传参数使用，并且provider被注入到大Consumer里面");
    }

}
