package hs.sample.k.apiserver.api.customer.v1.controller;


import hs.sample.k.apiserver.api.customer.v1.CustomerApi;
import hs.sample.k.apiserver.api.customer.v1.service.CustomerProvider;
import hs.sample.k.apiserver.api.customer.v1.scheme.CustomerInformationSchema;
import java.net.URISyntaxException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

//@RestController(value = "/api/v1")
@RestController
@Slf4j
@RequiredArgsConstructor
public class CustomerController implements CustomerApi
{

    private final CustomerProvider delegate;

    @Override
    public ResponseEntity<CustomerInformationSchema> customerRegister(
        CustomerInformationSchema customerInformationSchema) {
        return delegate.customerRegister(customerInformationSchema);
    }

    @Override
    public ResponseEntity<CustomerInformationSchema> customerInformation(String customerId) {
        log.info("customerId {}", customerId);
        return delegate.inquirySub("id");
    }

}
