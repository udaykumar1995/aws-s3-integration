package com.consistentlearners.springbootawslambda.service;

import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {

	abstract void uploadFile(MultipartFile multipartFile);

}
