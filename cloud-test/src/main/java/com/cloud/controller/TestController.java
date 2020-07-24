package com.cloud.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class TestController {
    @PostMapping("/upload")
    public String upload(@PathVariable("files") MultipartFile[] files) {

        return null;
    }

}
