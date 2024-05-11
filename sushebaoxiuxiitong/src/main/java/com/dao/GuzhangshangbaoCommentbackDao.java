package com.dao;

import com.entity.GuzhangshangbaoCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuzhangshangbaoCommentbackView;

/**
 * 故障上报评价 Dao 接口
 *
 * @author 
 */
public interface GuzhangshangbaoCommentbackDao extends BaseMapper<GuzhangshangbaoCommentbackEntity> {

   List<GuzhangshangbaoCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
