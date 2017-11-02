CREATE TABLE `file_center` (
  `id` bigint(11) NOT NULL COMMENT 'ID 主键',
  `file_id` varchar(45) DEFAULT NULL COMMENT '文件ID 唯一 存放的文件名字',
  `file_name` varchar(45) DEFAULT NULL COMMENT '上传时的文件名字',
  `content_type` varchar(45) DEFAULT NULL COMMENT '上传时的内容类型',
  `file_path` varchar(200) DEFAULT NULL COMMENT '文件存放路径',
  `file_size` varchar(45) DEFAULT NULL COMMENT '文件大小 ',
  `file_type` varchar(45) DEFAULT NULL COMMENT '文件类型',
  `create_user` varchar(45) DEFAULT NULL COMMENT '上传用户',
  `upload_time` timestamp NULL DEFAULT NULL COMMENT '上传时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `fileId_UNIQUE` (`file_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4