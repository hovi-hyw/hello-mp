package edu.dzkj.cloud.hellomp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.dzkj.cloud.hellomp.utility.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
