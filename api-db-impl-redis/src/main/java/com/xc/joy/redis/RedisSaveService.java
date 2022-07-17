package com.xc.joy.redis;

import com.xc.joy.data.DataSaveService;

/**
 * MySQLSaveService
 *
 * @author lxcecho 909231497@qq.com
 * @since 23:56 09-07-2022
 */
public class RedisSaveService implements DataSaveService {
	@Override
	public void savaData(String data) {
		System.out.println("Redis 保存了数据......." + data);
	}
}
