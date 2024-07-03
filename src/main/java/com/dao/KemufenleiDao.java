package com.dao;

import com.entity.KemufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KemufenleiVO;
import com.entity.view.KemufenleiView;


/**
 * 科目分类
 * 
 * @author 
 * @email 
 * @date 2021-05-12 10:14:49
 */
public interface KemufenleiDao extends BaseMapper<KemufenleiEntity> {
	
	List<KemufenleiVO> selectListVO(@Param("ew") Wrapper<KemufenleiEntity> wrapper);
	
	KemufenleiVO selectVO(@Param("ew") Wrapper<KemufenleiEntity> wrapper);
	
	List<KemufenleiView> selectListView(@Param("ew") Wrapper<KemufenleiEntity> wrapper);

	List<KemufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<KemufenleiEntity> wrapper);
	
	KemufenleiView selectView(@Param("ew") Wrapper<KemufenleiEntity> wrapper);
	
}
