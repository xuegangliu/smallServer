//package com.asiainfo.fileservice;
//
//import com.asiainfo.common.util.IdGenerator;
//import com.asiainfo.db.domain.FileCenter;
//import com.asiainfo.db.domain.FileCenterExample;
//import com.asiainfo.db.mapper.FileCenterMapper;
//import com.asiainfo.fileinterface.FileCenterService;
//import com.asiainfo.fileinterface.vo.UploadFileVO;
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.commons.lang3.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.io.ByteArrayInputStream;
//import java.io.File;
//import java.io.IOException;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by xuegangliu on 2017/11/2.
// */
//@Service
//public class FileCenterServiceImpl implements FileCenterService {
//    private Logger log= LoggerFactory.getLogger(FileCenterServiceImpl.class);
//
//    @Autowired
//    private FileCenterMapper fileCenterMapper;
//
//    @Value("${fileservice.filePath}")
//    private String filePath;
//
//    private String getFilePath(String appCode,String bizCode) {
//        Calendar c=Calendar.getInstance();
////        String path= File.separator +appCode+ File.separator+bizCode+ File.separator+c.get(c.YEAR) + File.separator+(c.get(c.MONTH)+1) + File.separator+c.get(c.DAY_OF_MONTH) + File.separator;
//        String path= File.separator +c.get(c.YEAR) + File.separator+(c.get(c.MONTH)+1) + File.separator+c.get(c.DAY_OF_MONTH) + File.separator;
//        File f=new File(path);
//        if(!f.exists()){
//            f.mkdirs();
//        }
//        return path;
//    }
//
//    private boolean saveFileCenter(FileCenter fc) {
//        int i = fileCenterMapper.insertSelective(fc);
//        if(i>0)
//            return true;
//        else
//            return false;
//    }
//
//    private String createFileId() {
//        return RandomStringUtils.random(45, true, true);
//    }
//
//
//    public Object uploadFile1(UploadFileVO uploadFileVO) {
//        return uploadFile1(uploadFileVO.getFileContent(),uploadFileVO.getContentType(),uploadFileVO.getFileName());
//    }
//
//    public FileCenter getFileCenterById(String fileId){
//        FileCenterExample example=new FileCenterExample();
//        example.createCriteria().andFileIdEqualTo(fileId);
//        List<FileCenter> listFiles=fileCenterMapper.selectByExample(example);
//        if(listFiles!=null&&!listFiles.isEmpty()){
//            return listFiles.get(0);
//        }
//        return null;
//    }
//
//    public byte[] getDataByFileId(String fileId) {
//        FileCenter file=getFileCenterById(fileId);
//        return getDataByPath(filePath+file.getFilePath());
//    }
//
//    public List<FileCenter> findAll() {
//        return fileCenterMapper.selectByExample(null);
//    }
//
//    /**
//     * 根据文件路径读取文件字节
//     * @param filePath 	//文件存放路径
//     * @return
//     */
//    public byte[] getDataByPath(String filePath){
//        File file=new File(filePath);
//        byte[] data=null;
//        if(file.exists()){
//            try {
//                data= FileUtils.readFileToByteArray(file);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return data;
//    }
//
//
//    public Object uploadFile1(byte[] fileContent,String contentType,String fileName) {
//        log.info("收到文件请求，文件名：{},类型:{}",fileName,contentType);
//        FileCenter fc=getFileCenterByFile1(fileContent.length, contentType, fileName);
//        try {
//            FileUtils.copyInputStreamToFile(new ByteArrayInputStream(fileContent), new File(filePath+fc.getFilePath()));
//            boolean flag = saveFileCenter(fc);
//            if(flag)
//                return fc.getFileId();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    private FileCenter getFileCenterByFile1(long len,String contentType,String fileName) {
//        FileCenter fc = new FileCenter();
//        fc.setId( IdGenerator.generator());
//        fc.setFileId(createFileId());
//        fc.setContentType(contentType);
//        if(StringUtils.isNotBlank(fileName)){
//            fc.setFileName(fileName);
//        }else{
//            fc.setFileName(fc.getFileId());
//        }
//        fc.setFileSize(len+"");
//        fc.setFilePath(getFilePath("","")+fc.getFileId());
//        fc.setUploadTime(new Date());
//        return fc;
//    }
//}
