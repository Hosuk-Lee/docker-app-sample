package com.kb.orchestration.domain.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class TransactionCompensateService {

    private final ObjectMapper om;
    private final TransactionManagement transactionManagement;


}
