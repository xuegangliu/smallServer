//package com.asiainfo.db.mapper;
//
//import com.asiainfo.db.domain.FileCenter;
//import com.asiainfo.db.domain.FileCenterExample;
//import java.util.List;
//import org.apache.ibatis.annotations.Param;
//
//public interface FileCenterMapper {
//    long countByExample(FileCenterExample example);
//
//    int deleteByExample(FileCenterExample example);
//
//    int deleteByPrimaryKey(Long id);
//
//    int insert(FileCenter record);
//
//    int insertSelective(FileCenter record);
//
//    List<FileCenter> selectByExample(FileCenterExample example);
//
//    FileCenter selectByPrimaryKey(Long id);
//
//    int updateByExampleSelective(@Param("record") FileCenter record, @Param("example") FileCenterExample example);
//
//    int updateByExample(@Param("record") FileCenter record, @Param("example") FileCenterExample example);
//
//    int updateByPrimaryKeySelective(FileCenter record);
//
//    int updateByPrimaryKey(FileCenter record);
//}