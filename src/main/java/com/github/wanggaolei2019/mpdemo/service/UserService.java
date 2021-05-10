package com.github.wanggaolei2019.mpdemo.service;

import com.github.wanggaolei2019.mpdemo.common.BusinessException;
import com.github.wanggaolei2019.mpdemo.common.PageReq;
import com.github.wanggaolei2019.mpdemo.common.PageResp;
import com.github.wanggaolei2019.mpdemo.dto.UserDTO;

/**
 * User业务接口
 *
 * @author wanggl
 * @since 2021-05-10 16:16:32
 */
public interface UserService {
    
    /**
     * 分页查询
     *
     * @param param 分页参数
     * @return PageResp<UserDTO>
     */
    PageResp<UserDTO> queryList(PageReq<UserDTO> param);
    
    /**
     * 根据id查询
     *
     * @param id id
     * @return 数据对象
     * @throws BusinessException 基础异常
     */
    UserDTO findById(String id) throws BusinessException;
    
    /**
     * 新增
     *
     * @param userDTO 数据对象
     * @throws BusinessException 基础异常
     */
    void insert(UserDTO userDTO) throws BusinessException;
    
    /**
     * 更新
     *
     * @param userDTO 数据对象
     * @throws BusinessException 基础异常
     */
    void update(UserDTO userDTO) throws BusinessException;
    
    /**
     * 根据id删除
     *
     * @param id id
     */
    void deleteById(String id);
}
