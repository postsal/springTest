package com.hujian.spring.beanFactory;


import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法：即先需要返回实例工厂的本身，再调用工厂的实例方法来返回bean实例
 * Created by hujian on 2016/10/9.
 */
public class InstanceCarFactory {
    private Map<String,Car> cars=null;

    public InstanceCarFactory(){
        cars=new HashMap<String,Car>();
        cars.put("Audi",new Car("Audi",300000));
        cars.put("Ford",new Car("Ford",200000));
    }

    public Car getCar(String brand){
        return cars.get(brand);
    }
}
