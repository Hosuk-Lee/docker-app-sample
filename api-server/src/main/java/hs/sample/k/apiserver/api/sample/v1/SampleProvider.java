package hs.sample.k.apiserver.api.sample.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import hs.sample.k.apiserver.service.SampleApiService;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SampleProvider {

    private final SampleApiService sub1ApiService;

    public ResponseEntity<Map> inquirySub(String id) {
        sub1ApiService.execute(id);
        ObjectMapper om = new ObjectMapper();
        Map map = new HashMap();
//        Map map = om.convertValue(sub1ApiService.inquiry(id), Map.class);
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }

}
