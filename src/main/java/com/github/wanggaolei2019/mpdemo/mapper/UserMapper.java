package com.github.wanggaolei2019.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.wanggaolei2019.mpdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * User数据库访问层
 *
 * @author wanggl
 * @since 2021-05-10 16:16:32
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据id查询
     *
     * @param id id
     * @return user
     */
    User findById(@Param("id") Long id);
}
