/**
 * @ClassName:JedisTest
 * @Description:
 * @Author:xxp
 * @Date:2019/8/3 18:02
 * @Version:1.0
 **/


package com.example.demo;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {

    }

    /**
      * @Author libai
      * @Description 简单的string操作
      * @Date 18:28 2019/8/3
      * @Param []
      * @return void
      **/
    @Test
    public void test1() {
        Jedis jedis = new Jedis("192.168.87.128",6379);
        jedis.auth("123456");
        //Jedis jedis = RedisUtil.getJedis();
        System.out.println(jedis.ping());
        //测试连接字符串
        jedis.set("k1", "123");
        jedis.get("k1");
        System.out.println(jedis.get("k1"));
        jedis.close();
       // RedisUtil.close(jedis);
    }
    /**
      * @Author libai
      * @Description redish减小数据库的压力,如果redis有值,则从redis取,如果redis没有值则从数据库取,并放到redis中
      * @Date 18:23 2019/8/3
      * @Param []
      * @return void
      **/
    @Test
    public void test2(){
        //Jedis作为连接redis的客户端,redis在服务器上
        Jedis jedis = new Jedis("192.168.87.128",6379);
        jedis.auth("123456");
        String key ="name";
        if(jedis.exists(key)){
            jedis.get(key);
            System.out.println("redis得到的:"+jedis.get(key));
        }else{
            //从数据库取出来的数据
            String result = "kkkk";
            jedis.set(key,result);
            System.out.println("从数据库取到的数据:"+jedis.get(key));
        }
    }

}
