package hs.sample.k.apiserver.api.account.v1.service;

import hs.sample.k.apiserver.api.account.v1.scheme.MyAccountDetailScheme;
import hs.sample.k.apiserver.service.SampleApiService;
import java.net.URI;
import java.net.URISyntaxException;
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
public class MyAccountDetailProvider {

    private final RestTemplate restTemplate;
    private final SampleApiService sub1ApiService;
    @Value("${sample.api.dm-party-reference-data-direcotry}")
    private String url;

    public ResponseEntity<MyAccountDetailScheme> inquirySub(String id)
        throws URISyntaxException {

//        inq();

        MyAccountDetailScheme response = new MyAccountDetailScheme();
        // AccountInfo 설정
        MyAccountDetailScheme.AccountInfo accountInfo = new MyAccountDetailScheme.AccountInfo();
        accountInfo.setAccountName("Savings Account");
        accountInfo.setAccountNumber("1234567890");
        accountInfo.setCurrentBalance("$5,000.00");
        accountInfo.setAvailableBalance("$4,500.00");
        response.setAccountInfo(accountInfo);

        // DepositInfo 설정
        MyAccountDetailScheme.DepositInfo depositInfo = new MyAccountDetailScheme.DepositInfo();
        depositInfo.setOpeningDate("2023-01-15");
        depositInfo.setBranch("Main Branch");
        depositInfo.setAccountStatus("Active");
        depositInfo.setFinancialTransactionLimitAccount("Yes");
        depositInfo.setCardPaymentAccount("No");
        depositInfo.setAtmWithdrawalAllowed("Yes");
        depositInfo.setTransferFee("$1.00");
        response.setDepositInfo(depositInfo);

        // LoanInfo 설정
        MyAccountDetailScheme.LoanInfo loanInfo = new MyAccountDetailScheme.LoanInfo();
        loanInfo.setLoanDate("2022-06-10");
        loanInfo.setLoanMaturityDate("2024-06-10");
        loanInfo.setLoanLimit("$10,000.00");
        loanInfo.setLoanInterestRate("5%");
        response.setLoanInfo(loanInfo);

        return ResponseEntity.status(HttpStatus.OK).body(response);
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
            log.info("bopy:{}",body);
        } else {
            // 응답이 실패적이면 처리합니다.
            log.error("error:{}",response);
        }
    }

}
