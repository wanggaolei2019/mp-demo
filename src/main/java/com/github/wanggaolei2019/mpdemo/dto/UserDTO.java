package com.github.wanggaolei2019.mpdemo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.StringJoiner;

/**
 * UserDTO
 *
 * @author wanggl
 * @since 2021-05-10 16:16:32
 */
@ApiModel("UserDTO")
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 139185318235735744L;
    
    @ApiModelProperty(value = "主键", position = 1)
    private Long id;
    
    @ApiModelProperty(value = "用户名", position = 2)
    private String userName;
    
    @ApiModelProperty(value = "密码", position = 3)
    private String password;
    
    @ApiModelProperty(value = "昵称", position = 4)
    private String nickName;
    
    @ApiModelProperty(value = "生日", position = 5)
    private Date birthday;
    
    @ApiModelProperty(value = "分数", position = 6)
    private String score;
    
    @ApiModelProperty(value = "创建者", position = 7)
    private String createBy;
    
    @ApiModelProperty(value = "创建时间", position = 8)
    private Date createTime;
    
    @ApiModelProperty(value = "更新者", position = 9)
    private String updateBy;
    
    @ApiModelProperty(value = "更新时间", position = 10)
    private Date updateTime;
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNickName() {
        return nickName;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public Date getBirthday() {
        return birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public String getScore() {
        return score;
    }
    
    public void setScore(String score) {
        this.score = score;
    }
    
    public String getCreateBy() {
        return createBy;
    }
    
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public String getUpdateBy() {
        return updateBy;
    }
    
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
    
    public Date getUpdateTime() {
        return updateTime;
    }
    
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    @Override
    public String toString() {
        return new StringJoiner(", ", UserDTO.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("userName=" + userName)
                .add("password=" + password)
                .add("nickName=" + nickName)
                .add("birthday=" + birthday)
                .add("score=" + score)
                .add("createBy=" + createBy)
                .add("createTime=" + createTime)
                .add("updateBy=" + updateBy)
                .add("updateTime=" + updateTime)
                .toString();
    }
}
