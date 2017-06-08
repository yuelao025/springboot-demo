
# druid2 监控页面

http://127.0.0.1:8080/druid2/api.html [测试可用]


# 务必保持UserMapper.xml , UserMapper文件在同一个目录( dao) 否则 错误会同上所示;

https://github.com/mybatis/spring-boot-starter/issues/141 [排查N久]


# Field userMapper in com.example.demo.service.impl.UserService required a bean of type 'com.example.demo.dao.UserMapper' that could not be found.

修改
```

@MapperScan(basePackages = "com.example.demo.dao")  //不要忘记了否则会找不到bean报错
public class SpringBootDemoApplication {

}
```


