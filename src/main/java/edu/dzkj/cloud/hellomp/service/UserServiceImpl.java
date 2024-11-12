package edu.dzkj.cloud.hellomp.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.dzkj.cloud.hellomp.mapper.UserMapper;
import edu.dzkj.cloud.hellomp.utility.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
