package hs.sample.k.apiserver.api.account.v1.controller;


import hs.sample.k.apiserver.api.account.v1.MyAccountDetailApi;
import hs.sample.k.apiserver.api.account.v1.scheme.MyAccountDetailScheme;
import hs.sample.k.apiserver.api.account.v1.service.MyAccountDetailProvider;
import java.net.URISyntaxException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

//@RestController(value = "/api/v1")
@RestController
@Slf4j
@RequiredArgsConstructor
public class MyAccountDetailController implements MyAccountDetailApi
{

    private final MyAccountDetailProvider delegate;

    @Override
    public ResponseEntity<MyAccountDetailScheme> myAccountDetail() {
        try {
            return delegate.inquirySub("id");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
