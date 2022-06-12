# 一些思考

- ## Mybatis怎么去查id

  ```
  假如设置了自增的话——select LAST_INSERT_ID()，提交插入的数据，打印主键值，会使用到session
  没有设置自增的话—— select UUID()，首先通过 select UUID()得到主键值，然后设置到对象的id中
  ```

- ## spring boot和spring的区别

  ```
  spring配置比较繁琐，和框架整合起来代码量会很大，而且大量代码重复
  spring boot可以快速创建应用，能自动化配置，内嵌服务器，不需要xml
  ```

- ## SSM框架下，spring中service和dao层的作用与三者之间的关系

  ![在这里插入图片描述](https://img-blog.csdnimg.cn/20190414150344909.?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2NvY29fX19fXw==,size_16,color_FFFFFF,t_70)

  https://blog.csdn.net/ChenLeihappy/article/details/80003325

  **service，dao，po分别是什么意思和什么作用**

  Service:service层是在mcv三层模式中新添加一层，能够更加清晰的定义应用程序的边界，需要操作数据的时候，通过service层访问DAO层来实现。service层做的事情，不仅仅是调用DAO操作数据，还会包含了一定的业务逻辑。整个程序设计就变成了针对服务的设计。

  DAO：Data Access Object是一个数据访问接口，数据访问：顾名思义就是与数据库打交道。夹在业务逻辑与数据库资源中间。是MVC模式中Model层

  PO：Persistent Object即持久对象，它们是由一组属性和属性的get和set方法组成。可以看成是与数据库中的表相映射的java对象

- ## spring mvc的工作流程

  ![img](https://img-blog.csdnimg.cn/20190408151658886.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2Zsb2F0aW5nX2RyZWFtaW5n,size_16,color_FFFFFF,t_70)

  ```
  1、用户发送请求至前端控制器DispatcherServlet。
  2、DispatcherServlet收到请求调用HandlerMapping处理器映射器。
  3、处理器映射器找到具体的处理器(可以根据xml配置、注解进行查找)，生成处理器对象及处理器拦截器(如果有则生成)一并返回给DispatcherServlet。
  4、 DispatcherServlet调用HandlerAdapter处理器适配器。
  5、HandlerAdapter经过适配调用具体的处理器(Controller，也叫后端控制器)。
  6、Controller执行完成返回ModelAndView。
  7、HandlerAdapter将controller执行结果ModelAndView返回给DispatcherServlet。
  8、DispatcherServlet将ModelAndView传给ViewReslover视图解析器。
  9、ViewReslover解析后返回具体View.
  10、DispatcherServlet根据View进行渲染视图（即将模型数据填充至视图中）。 
  11、DispatcherServlet响应用户。
  ```

  

- ## 为什么会有连接池，常见的连接池，他们的特点

  ```
  数据库连接池负责分配、管理和释放数据库连接，它允许应用程序重复使用一个现有的数据库连接，而不是再重新建立一个。
  数据库连接是一种关键的有限的昂贵的资源，这一点在多用户的网页应用程序中体现得尤为突出。 一个数据库连接对象均对应一个物理数据库连接，每次操作都打开一个物理连接，使用完都关闭连接，这样造成系统的 性能低下。 数据库连接池的解决方案是在应用程序启动时建立足够的数据库连接，并讲这些连接组成一个连接池(简单说：在一个“池”里放了好多半成品的数据库联接对象)，由应用程序动态地对池中的连接进行申请、使用和释放。对于多于连接池中连接数的并发请求，应该在请求队列中排队等待。并且应用程序可以根据池中连接的使用率，动态增加或减少池中的连接数。 连接池技术尽可能多地重用了消耗内存地资源，大大节省了内存，提高了服务器地服务效率，能够支持更多的客户服务。通过使用连接池，将大大提高程序运行效率，同时，我们可以通过其自身的管理机制来监视数据库连接的数量、使用情况等。
  ```

  ![在这里插入图片描述](https://img-blog.csdnimg.cn/20190516172938108.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poYW9ob25nX2Jv,size_16,color_FFFFFF,t_70)

- ## 对依赖注入的理解

  

- ## 栈和队列以及他们的应用

- ## 链表

- ## 内存泄漏和内存溢出

- ## 索引为什么失效

- ## Mybatis中 $ 和 #作用和区别/Mybatis Sql语句#{}，和 ${}传参的区别

# 遇到的Bug

- ## 解决 "通配符的匹配很全面, 但无法找到元素 'context:component-scan' 的声明" 问题

```xml
命名空间依赖型没有声明完整,一些必要的依赖项没有添加进来,尤其是利用IDE工具自动生成的xml文件,很多时候依赖项都不完整!!!
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans-4.2.xsd
    http://www.springframework.org/schema/mvc
    http://www.springframework.org/schema/mvc/spring-mvc-4.2.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context-4.2.xsd">
```

- ## 假如遇到了tomcat服务器端口被占用了，但是用杀进程的方法找不到，杀不死调用端口的进程，这时可能是因为hyper v保护了目标端口，把hyper v取消掉就好。