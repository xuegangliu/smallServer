package com.lxg.db.mapper;

import com.lxg.db.domain.BusinessWay;
import com.lxg.db.domain.BusinessWayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessWayMapper {
    long countByExample(BusinessWayExample example);

    int deleteByExample(BusinessWayExample example);

    int insert(BusinessWay record);

    int insertSelective(BusinessWay record);

    List<BusinessWay> selectByExample(BusinessWayExample example);

    int updateByExampleSelective(@Param("record") BusinessWay record, @Param("example") BusinessWayExample example);

    int updateByExample(@Param("record") BusinessWay record, @Param("example") BusinessWayExample example);
}