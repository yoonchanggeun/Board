package com.YCG.Board.service;

import com.YCG.Board.dto.TestDto;
import com.YCG.Board.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public TestDto testServiceMethod(String str) {
        TestDto testDto = new TestDto(str);

        return testDto;
    }
}
