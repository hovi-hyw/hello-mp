package edu.dzkj.cloud.hellomp.mapper;

import edu.dzkj.cloud.hellomp.service.UserService;
import edu.dzkj.cloud.hellomp.utility.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Test
    public void listTest() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void selectTest() {
        User user = userMapper.selectById("2");
        System.out.println(user);
    }

    @Test
    public void insertTest() {
        User user = new User();
        user.setAge(44);
        user.setName("hovi");
        user.setEmail("8907455@qq.com");
        userMapper.insert(user);

        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void test03() {
        User byId = userService.getById(3);
        byId.setEmail("tom@qq.com");

        userService.updateById(byId);

    }
    @Test
    public void updateTest() {
        User user = new User();
        user = userMapper.selectById(1);
        user.setName("cooper");
        userMapper.updateById(user);
    }

    @Test
    public void deleteTest() {
        userMapper.deleteById(7);
    }
}