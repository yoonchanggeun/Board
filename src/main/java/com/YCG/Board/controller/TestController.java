package com.YCG.Board.controller;

import com.YCG.Board.dto.TestDto;
import com.YCG.Board.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @GetMapping("/test/{str}")
    public String test(@PathVariable String str) {
        TestDto res = testService.testServiceMethod(str);

        return "hello "+res.getTestStr() ;
    }
}
