package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyepigaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyepigaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyepigaiView;


/**
 * 作业批改
 *
 * @author 
 * @email 
 * @date 2021-05-12 10:14:49
 */
public interface ZuoyepigaiService extends IService<ZuoyepigaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyepigaiVO> selectListVO(Wrapper<ZuoyepigaiEntity> wrapper);
   	
   	ZuoyepigaiVO selectVO(@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);
   	
   	List<ZuoyepigaiView> selectListView(Wrapper<ZuoyepigaiEntity> wrapper);
   	
   	ZuoyepigaiView selectView(@Param("ew") Wrapper<ZuoyepigaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyepigaiEntity> wrapper);
   	
}

