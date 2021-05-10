package com.github.wanggaolei2019.mpdemo.service;

import cn.hutool.extra.cglib.CglibUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.wanggaolei2019.mpdemo.common.BusinessException;
import com.github.wanggaolei2019.mpdemo.common.PageReq;
import com.github.wanggaolei2019.mpdemo.common.PageResp;
import com.github.wanggaolei2019.mpdemo.dto.UserDTO;
import com.github.wanggaolei2019.mpdemo.entity.User;
import com.github.wanggaolei2019.mpdemo.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User业务实现
 *
 * @author wanggl
 * @since 2021-05-10 16:16:32
 */
@Service("userService")
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    
    private final UserMapper userMapper;
    
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    
    /**
     * 分页查询
     *
     * @param param 分页参数
     * @return PageResp<UserDTO>
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.SUPPORTS)
    public PageResp<UserDTO> queryList(PageReq<UserDTO> param) {
        userMapper.findById(1L);
        return null;
    }
    
    /**
     * 根据id查询
     *
     * @param id id
     * @return 数据对象
     * @throws BusinessException 基础异常
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.SUPPORTS)
    public UserDTO findById(String id) throws BusinessException {
        User user = userMapper.selectById(id);
        if (null == user) {
            throw BusinessException.of("数据不存在");
        }
        return CglibUtil.copy(user, UserDTO.class);
    }
    
    /**
     * 新增
     *
     * @param userDTO 数据对象
     * @throws BusinessException 基础异常
     */
    @Override
    public void insert(UserDTO userDTO) throws BusinessException {
        Long id = userDTO.getId();
        // 唯一校验
        if (null != id && null != userMapper.selectById(id)) {
            throw BusinessException.of("数据已存在");
        }
        User user = CglibUtil.copy(userDTO, User.class);
        userMapper.insert(user);
    }
    
    /**
     * 更新
     *
     * @param userDTO 数据对象
     * @throws BusinessException 基础异常
     */
    @Override
    public void update(UserDTO userDTO) throws BusinessException {
        // 校验
        User user = userMapper.selectById(userDTO.getId());
        if (null == user) {
            throw BusinessException.of("数据不存在");
        }
        CglibUtil.copy(userDTO, user);
        userMapper.updateById(user);
    }
    
    /**
     * 根据id删除
     *
     * @param id id
     */
    @Override
    public void deleteById(String id) {
        userMapper.deleteById(id);
    }
}
