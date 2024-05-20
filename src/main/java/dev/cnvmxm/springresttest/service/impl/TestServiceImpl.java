package dev.cnvmxm.springresttest.service.impl;

import dev.cnvmxm.springresttest.exception.TestNotFoundException;
import dev.cnvmxm.springresttest.mapper.TestMapper;
import dev.cnvmxm.springresttest.model.dto.TestRequest;
import dev.cnvmxm.springresttest.model.dto.TestResponse;
import dev.cnvmxm.springresttest.model.entity.Test;
import dev.cnvmxm.springresttest.repository.TestRepository;
import dev.cnvmxm.springresttest.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;
    private final TestMapper testMapper;

    @Override
    public List<TestResponse> getAllTests() {
        return null;
    }

    @Override
    public TestResponse getSomeTest(Long testId) {
        return testMapper.toResponse(testRepository.findById(testId)
                .orElseThrow(TestNotFoundException::new));
    }

    @Override
    public TestResponse createTest(TestRequest testRequest) {
        Test newTest = testMapper.toTest(testRequest);

        testRepository.save(newTest);
        log.info("Saving test with id: {}", newTest.getId());

        return testMapper.toResponse(newTest);
    }

}
