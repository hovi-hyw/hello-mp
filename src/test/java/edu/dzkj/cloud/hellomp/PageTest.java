package edu.dzkj.cloud.hellomp;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.dzkj.cloud.hellomp.mapper.UserMapper;
import edu.dzkj.cloud.hellomp.service.UserService;
import edu.dzkj.cloud.hellomp.utility.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PageTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    public void testPageService() {
        Page<User> objectPage = new Page<>(3,3);
        Page<User> page = userService.page(objectPage);
        page.getRecords().forEach(System.out::println);
    }

    @Test
    public void testPage() {
        Page<User> objectPage = new Page<>(1,3);
        Page<User> userPage = userMapper.selectPage(objectPage, null);
        userPage.getRecords().forEach(System.out::println);
    }
}
