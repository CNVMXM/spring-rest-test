package dev.cnvmxm.springresttest.controller;

import dev.cnvmxm.springresttest.model.dto.TestRequest;
import dev.cnvmxm.springresttest.model.dto.TestResponse;
import dev.cnvmxm.springresttest.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tests")
public class TestController {

    private final TestService testService;

    @GetMapping
    public List<TestResponse> getAllTests() {
        return testService.getAllTests();
    }

    @GetMapping("/{testId}")
    public TestResponse getSomeTest(
            @PathVariable final Long testId
    ) {
        return testService.getSomeTest(testId);
    }

    @PostMapping("/create")
    public TestResponse createTest(
            @RequestBody final TestRequest testRequest
    ) {
        return testService.createTest(testRequest);
    }

}
