package com.lxg.fileinterface;

import com.lxg.db.domain.FileCenter;
import com.lxg.fileinterface.vo.UploadFileVO;

import java.util.List;


/**
 * Created by xuegangliu on 2017/11/2.
 */
public interface FileCenterService {
    Object uploadFile1(UploadFileVO uploadFileVO);
    FileCenter getFileCenterById(String fileId);
    byte[] getDataByFileId(String fileId);
    List<FileCenter> findAll();
}
