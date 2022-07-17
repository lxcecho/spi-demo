package com.xc.joy.mysql;

import com.xc.joy.data.DataSaveService;

/**
 * MySQLSaveService
 *
 * @author lxcecho 909231497@qq.com
 * @since 23:56 09-07-2022
 */
public class MySQLSaveService implements DataSaveService {
	@Override
	public void savaData(String data) {
		System.out.println("MySQL 保存了数据......." + data);
	}
}
