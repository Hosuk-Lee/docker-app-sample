package com.kb.orchestration.api.sample.controller;

import com.kb.orchestration.api.sample.SampleApi;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.Tag;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/sample")
public class SampleApiController implements SampleApi {

    @Override
    public ResponseEntity<Map> sampleInquiry() {
        List<Tag> tags = List.of(
            Tag.of("hosuk_label_a", "A"),
            Tag.of("hosuk_label_b", "B")
        );
        Metrics.counter("sample.demo.count.total", tags).increment();
        return SampleApi.super.sampleInquiry();
    }
}
