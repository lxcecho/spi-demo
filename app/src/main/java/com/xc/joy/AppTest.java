package com.xc.joy;

import com.xc.joy.data.DataSaveService;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author lxcecho 909231497@qq.com
 * @since 16:55 10-07-2022
 */
public class AppTest {
    public static void main(String[] args) {
        ServiceLoader<DataSaveService> load = ServiceLoader.load(DataSaveService.class);

        //获取迭代器

        //遍历
        for (DataSaveService dataSaveService : load) {
            dataSaveService.savaData("Hello SPI.");
            //可以做具体的业务逻辑
        }
    }
}
