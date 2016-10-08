package com.hujian.spring.beans;

import java.util.Properties;

/**
 * Created by hujian on 2016/10/8.
 */
public class DataSource {
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }
}
