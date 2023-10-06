package hs.sample.k.apiserver.api.customer.v1.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import hs.sample.k.apiserver.api.customer.v1.scheme.CustomerInformationScheme;
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
public class CustomerProvider {

    private final SampleApiService sub1ApiService;

    public ResponseEntity<CustomerInformationScheme> inquirySub(String id) {
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

}
