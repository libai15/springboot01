/**
 * @ClassName:RedisPoolUtil
 * @Description: //TODO
 * @Author:xxp
 * @Date:2019/8/3 20:12
 * @Version:1.0
 **/


package com.example.demo.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPoolUtil {
    private static JedisPool pool;
    //配置信息在静态代码块里面
    static{
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        //最大连接数
        poolConfig.setMaxTotal(5);
        //最大空闲数,指最少有一个连接
        poolConfig.setMaxIdle(1);
        String host = "192.168.87.128";
        int port = 6379;
        pool = new JedisPool(poolConfig,host,port);
    }
    /**
      * @Author libai
      * @Description 获取连接
      * @Date 20:21 2019/8/3
      * @Param []
      * @return redis.clients.jedis.Jedis
      **/

    public static Jedis getJedis(){
        Jedis jedis = pool.getResource();
        jedis.auth("123456");
        return jedis;
    }
    /**
      * @Author libai
      * @Description 关闭连接
      * @Date 20:22 2019/8/3
      * @Param [jedis]
      * @return void
      **/

    public static void close(Jedis jedis){
        jedis.close();
    }
}
