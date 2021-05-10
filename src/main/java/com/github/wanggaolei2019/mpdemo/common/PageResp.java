package com.github.wanggaolei2019.mpdemo.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel("分页数据封装")
public class PageResp<T> implements Serializable {
    
    @ApiModelProperty(value = "当前页数", position = 1)
    private long pageNo;
    
    @ApiModelProperty(value = "每页条数", position = 2)
    private long pageSize;
    
    @ApiModelProperty(value = "总条目数", position = 3)
    private long total;
    
    @ApiModelProperty(value = "当前页数据", position = 4)
    private List<T> result;
    
    public PageResp() {
    }
    
    public PageResp(long pageNo, long pageSize, List<T> list, long total) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.result = list;
        this.total = total;
    }
    
    public static <T> PageResp<T> of(long pageNo, long pageSize, List<T> result, long total) {
        return new PageResp<>(pageNo, pageSize, result, total);
    }
    
    
    public static <T> PageResp<T> of(IPage<T> page) {
        return new PageResp<T>(page.getCurrent(), page.getSize(), page.getRecords(), page.getTotal());
    }
    
    public static <T> PageResp<T> ofEmpty(PageReq<T> pageReq) {
        return new PageResp<T>(pageReq.getPageNo(), pageReq.getPageSize(), PageConstants.DEFAULT_RESULT, 0);
    }
    
    public long getPageNo() {
        return pageNo;
    }
    
    public void setPageNo(long pageNo) {
        this.pageNo = pageNo;
    }
    
    public long getPageSize() {
        return pageSize;
    }
    
    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }
    
    public List<T> getResult() {
        return result;
    }
    
    public void setResult(List<T> result) {
        this.result = result;
    }
    
    public long getTotal() {
        return total;
    }
    
    public void setTotal(long total) {
        this.total = total;
    }
}
