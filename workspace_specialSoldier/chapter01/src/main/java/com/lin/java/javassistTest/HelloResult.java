package com.lin.java.javassistTest;

public class HelloResult {
    public String test$Impl() throws Exception{
        return "test";
   }
     public String test( ) throws Exception{
        long start = System.currentTimeMillis();//统计开始时间
        Object result = test$Impl();//调用原方法
        long end = System.currentTimeMillis();//统计结束时间
        System.out.println("method test time used:" + (end - start));//计算时间
        return (String) result;
   }
            

}