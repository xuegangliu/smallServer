package com.asiainfo.db.mapper;

import com.asiainfo.db.domain.EngineRule;
import com.asiainfo.db.domain.EngineRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EngineRuleMapper {
    long countByExample(EngineRuleExample example);

    int deleteByExample(EngineRuleExample example);

    int insert(EngineRule record);

    int insertSelective(EngineRule record);

    List<EngineRule> selectByExample(EngineRuleExample example);

    int updateByExampleSelective(@Param("record") EngineRule record, @Param("example") EngineRuleExample example);

    int updateByExample(@Param("record") EngineRule record, @Param("example") EngineRuleExample example);
}