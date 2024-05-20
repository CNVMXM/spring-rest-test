package dev.cnvmxm.springresttest.service;

import dev.cnvmxm.springresttest.model.dto.TestRequest;
import dev.cnvmxm.springresttest.model.dto.TestResponse;

import java.util.List;

public interface TestService {

    List<TestResponse> getAllTests();

    TestResponse getSomeTest(Long testId);

    TestResponse createTest(TestRequest testRequest);

}
