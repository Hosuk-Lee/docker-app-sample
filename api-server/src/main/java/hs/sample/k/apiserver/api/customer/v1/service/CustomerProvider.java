package hs.sample.k.apiserver.api.customer.v1.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import hs.sample.k.apiserver.api.customer.v1.scheme.CustomerInformationScheme;
import hs.sample.k.apiserver.service.SampleApiService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerProvider {

    private final RestTemplate restTemplate;
    private final SampleApiService sub1ApiService;
    @Value("${sample.api.dm-party-reference-data-direcotry}")
    private String url;

    public ResponseEntity<CustomerInformationScheme> inquirySub(String id)
        throws URISyntaxException {

        inq();

        CustomerInformationScheme customerInfo = new CustomerInformationScheme();
        customerInfo.setName("John Doe");
        customerInfo.setPhone("123-456-7890");
        customerInfo.setEmail("john@example.com");
        customerInfo.setHomeAddress("123 Main St, City");
        customerInfo.setWorkplace("ABC Inc.");
        customerInfo.setDepartment("Sales");
        customerInfo.setWorkPhone("987-654-3210");
        customerInfo.setWorkAddress("456 Business Ave, Town");
        customerInfo.setReceiveMail(true);
        customerInfo.setReceivePhoneCalls(false);
        customerInfo.setReceiveSMS(true);
        customerInfo.setReceiveEmail(false);
        return ResponseEntity.status(HttpStatus.OK).body(customerInfo);
    }

    public void inq() throws URISyntaxException {
//        URI uri = URI.create();
        log.info("url:{}",url);
//        URI uri = new URI("http", null,url,8083,"/PartyReferenceDataDirectory/1/Retrieve", null, null);
        URI uri = URI.create(url + "/PartyReferenceDataDirectory/1/Retrieve");
        log.info("uri:{}",uri.toString());
        ResponseEntity<Object> response = restTemplate.exchange(
//            "http://example.com/api/v1/users",
            uri,
            HttpMethod.GET,
            HttpEntity.EMPTY,
            Object.class
        );
        if (response.getStatusCode().is2xxSuccessful()) {
            // 응답이 성공적이면 사용자 목록을 가져옵니다.
            Object body = response.getBody();
            log.info("body:{}",body);
        } else {
            // 응답이 실패적이면 처리합니다.
            log.error("error:{}",response);
        }
    }

}
