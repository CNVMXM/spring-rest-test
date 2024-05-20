package dev.cnvmxm.springresttest.mapper;

import dev.cnvmxm.springresttest.model.dto.TestRequest;
import dev.cnvmxm.springresttest.model.dto.TestResponse;
import dev.cnvmxm.springresttest.model.entity.Test;
import org.springframework.stereotype.Component;

@Component
public class TestMapper {

    public TestResponse toResponse(Test test) {
        return TestResponse.builder()
                .name(test.getName())
                .build();
    }

    public Test toTest(TestRequest testRequest) {
        return Test.builder()
                .name(testRequest.getName())
                .build();
    }

}
