# Springboot开发web服务器

## 开发流程
- 1、使用idea创建一个springboot创建一个项目
- 2、在pom.xml中添加web依赖
    ```aidl
    <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>

- 3.在controller类下编写HelloController类
```aidl
  @Controller
  @RequestMapping("/hello")
  public class HelloController {
  
      @GetMapping("/hello")
      @ResponseBody
      public String hello(){
          return "hello word";
      }
  }
```

[错误原因]
- This application has no explicit mapping for /error, so you are seeing this as a fallback.

[解决办法]
- 报错原因是没有找到url所对应的资源路径
  -Application启动类的位置不对.要将Application类放在最外侧,即包含所有子包 原因:spring-boot会自动加载启动类所在包下及其子包下的所有组件.
  -访问路径为localhost:8080/hello/hello
  

# 自动装配
- 结论：
- springboot所有的自动配置都在启动的时候扫描并加载：spring.factories所有的自动配置类都在这里面，但是不一定生效，要判断条件是否成立，只要导入类对应的start，就有对应的启动器，我们自动装配就会生效，然后就配置成功！

# 配置文件的编写
## 使用yaml文件配置属性
 - 1、把属性值放在yaml文件中
 - 2、在类上面加上注解绑定yaml文件中的属性@ConfigurationProperties(prefix = "penson")，⚠️出现警告的时候加入依赖
 - 3、代码展示
```aidl
  编写实体类
  @Component
  @ConfigurationProperties(prefix = "penson")
  public class Penson {
  
      private String name;
      private Integer age;
  
      public Penson() {
      }
  
      public Penson(String name, Integer age) {
          this.name = name;
          this.age = age;
      }
  
      public String getName() {
          return name;
      }
  
      public void setName(String name) {
          this.name = name;
      }
  
      public Integer getAge() {
          return age;
      }
  
      public void setAge(Integer age) {
          this.age = age;
      }
  
      @Override
      public String toString() {
          return "Penson{" +
                  "name='" + name + '\'' +
                  ", age=" + age +
                  '}';
      }
  }
 2、在yaml中注入属性值
    # 对象
    penson:
      name: kevin
      age: 3
 3、测试
  @Autowired
    private Penson penson;

    @Test
    void contextLoads() {
        System.out.println(penson);
    }


```

## springboot配置的加载顺序
 - 1、.properites
 - 2、 .yaml
 - 3、系统环境变量
 - 4、命令行参数

## springboot不同位置的配置的加载顺序:默认为最低的配置
 - 1、file:./config/ 项目下config下的配置 application.yaml
 - 2、file:./ 项目下的配置文件 application.yaml
 - 3、classpath:/config/ 类路径下的配置 application.yaml
 - 4、classpath:/ resources下的配置 application.yaml

## springboot多环境切换
- 1、使用.properties编写 spring.profiles.active=dev
- application-dev.properties
- application-test.properties

- 2、使用yaml文件编写
```aidl
      server:
      port: 9000
    
    # 对象
    penson:
      name: kevin
      age: 3
      
    spring:
      profiles:
        active: dev
    ---
    server:
      port: 9001
    spring:
      profiles:dev
    
    ---
    server:
      port: 9003
    spring:
      profiles: test
      
```

# springboot中处理静态资源
- 1.静态资源处理
- webjars localhost:8080/webjars/
- public static resources localhost:8080/

- 2.优先级：
- resources>static>public


# thymeleaf的使用
[参考文档](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#using-texts)



# vue的学习
