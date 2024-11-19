package edu.t1;

import lombok.SneakyThrows;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("edu.t1");
        ctx.getBean(UserService.class).createUser(6L,"user6");
        ctx.getBean(UserService.class).createUser(5L,"user5");
        System.out.println(ctx.getBean(UserService.class).readUser("user5"));
        ctx.getBean(UserService.class).createUser(5L,"user5");
        ctx.getBean(UserService.class).createUser(4L,"user4");
        ctx.getBean(UserService.class).updateUser(4L,"user4");
        ctx.getBean(UserService.class).deleteUser("user4");
        System.out.println(ctx.getBean(UserService.class).readAllUser());
    }
}
