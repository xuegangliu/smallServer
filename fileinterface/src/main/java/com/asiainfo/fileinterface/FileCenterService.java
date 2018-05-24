package com.asiainfo.fileinterface;

import com.asiainfo.db.domain.FileCenter;
import com.asiainfo.fileinterface.vo.UploadFileVO;

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
