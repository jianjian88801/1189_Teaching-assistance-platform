package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KemufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KemufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KemufenleiView;


/**
 * 科目分类
 *
 * @author 
 * @email 
 * @date 2021-05-12 10:14:49
 */
public interface KemufenleiService extends IService<KemufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KemufenleiVO> selectListVO(Wrapper<KemufenleiEntity> wrapper);
   	
   	KemufenleiVO selectVO(@Param("ew") Wrapper<KemufenleiEntity> wrapper);
   	
   	List<KemufenleiView> selectListView(Wrapper<KemufenleiEntity> wrapper);
   	
   	KemufenleiView selectView(@Param("ew") Wrapper<KemufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KemufenleiEntity> wrapper);
   	
}

