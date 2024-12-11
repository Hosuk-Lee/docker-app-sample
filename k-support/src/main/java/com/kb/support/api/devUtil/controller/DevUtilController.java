package com.kb.support.api.devUtil.controller;

import com.kb.common.global.context.CommonContext;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController("accountMgt_accountMgtController")
@RequestMapping("/dev-util")
public class DevUtilController {

    private final CommonContext commonContext;
    private static long count = 0;


    @PostMapping("/etc/slowReturn")
    public ResponseEntity<Object> slowReturn(@RequestBody Map<String, Object> body) {
//        log.info("body {}", body);
        StopWatch stopWatch = StopWatch.createStarted();
        long start = System.currentTimeMillis();
        int o = (int) body.get("loop_count");
        int x = 0;
        for (int i = 0; i < o; i++) {
            x++;
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        stopWatch.stop();
        body.put("elapsed", "경과시간" + stopWatch.toString());
        log.info("Count {}", (++count));
        return ResponseEntity.ok(body);
    }

}
