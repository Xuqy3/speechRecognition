package com.xuqy.speech.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

@RestController
public class SpeechController {

    public String VoiceRecognition(HttpServletRequest hrq, HttpServletResponse hsr) throws UnsupportedEncodingException {
        hrq.setCharacterEncoding("UTF-8");
        MultipartHttpServletRequest mul = (MultipartHttpServletRequest)hrq;
        MultipartFile file = mul.getFile("audioData");
//        AsrMain demo = new AsrMain(file);
        // 填写下面信息
//        String result = demo.run();
//        System.out.println("UTF-8========测试！");
//        System.out.println("result8========"+result);
        return null;

    }
}
