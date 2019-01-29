//package com.lxg.web.controller;
//
//import ResultObject;
//import FileCenter;
//import FileCenterService;
//import UploadFileVO;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Controller
//public class FileController {
//	private Logger log = LoggerFactory.getLogger(FileController.class);
//	@Autowired
//	private FileCenterService fileCenterService;
//
//	@RequestMapping(value = "/test",method = RequestMethod.GET)
//	public String test(){
//		return "index";
//	}
//
//	@RequestMapping(value = "/upload")
//	@ResponseBody
//	public Object uploadTest(@RequestParam(value = "file", required = false) MultipartFile[] files, ModelMap model) {
//		ResultObject result = new ResultObject();
//		List<Map> list = new ArrayList<Map>();
//		Map<String, Object> data = null;
//		for (MultipartFile file : files) {
//			data = new HashMap<String, Object>();
//			try {
//				FileCenter fileCenter = new FileCenter();
//				fileCenter.setContentType(file.getContentType());
//				fileCenter.setFileName(file.getOriginalFilename());
//
//				UploadFileVO uploadFileVO = new UploadFileVO();
//				uploadFileVO.setContentType(file.getContentType());
//				uploadFileVO.setFileName(file.getOriginalFilename());
//				uploadFileVO.setFileContent(file.getBytes());
//
//				data.put("fileName", file.getOriginalFilename());
//				list.add(data);
//				String fileId = (String) fileCenterService.uploadFile1(uploadFileVO);
//				data.put("fileId", fileId);
//
//			} catch (Exception ex) {
//				ex.printStackTrace();
//			}
//		}
//		result.setData(list);
//		return result;
//	}
//
//	@RequestMapping("/resource/{fileId}")
//	public ResponseEntity<byte[]> testResponseEntity(@PathVariable("fileId") String fileId)
//			throws IOException {
//		byte[] body = null;
//		FileCenter fc = fileCenterService.getFileCenterById(fileId);
//		body = fileCenterService.getDataByFileId(fileId);
//		/// files/abc.txt：所要下载文件的地址
//
//		// body=new byte[in.available()];
//		// in.read(body);
//		HttpHeaders headers = new HttpHeaders();
//		String contentType=fc.getContentType();
//		headers.add(headers.CONTENT_TYPE, contentType);
//		if(contentType.contains("application/")){
//			// 响应头的名字和响应头的值
//			headers.add("Content-Disposition", "attachment;filename=" + fc.getFileName());
//		}
//		HttpStatus statusCode = HttpStatus.OK;
//
//		ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);
//		return response;
//	}
//
//	@RequestMapping("/all")
//	@ResponseBody
//	public String findAll(ModelMap map){
//		map.put("images",fileCenterService.findAll());
//		return "index";
//	}
//}
