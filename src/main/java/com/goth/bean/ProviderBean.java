package com.goth.bean;

import com.goth.spring.Componet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description @Componet 注解表明这是要被 Spring 托管bean ，名称为 providerBean（伪代码实现，真实Spring 复杂更多）
 * @Author yuan.jianfeng
 * @Date 2020/9/16  11:31 上午
 */
@Componet("providerBean")
public class ProviderBean {

    public void ProviderMethod(String param) {
        String out = "provider输出";
        if (param != null) {
            out = param;
        }
        System.out.println(out);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class test = ProviderBean.class;

        //ProviderBean per = (ProviderBean) test.newInstance();//per
        // Componet annotation = (Componet) test.getAnnotation(Componet.class);
        //System.out.println(annotation.value());
        Method provider = test.getMethod("ProviderMethod",String.class);
        provider.invoke(test,"实力");


    }

}
