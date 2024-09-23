package com.kb.common.global.context.dto;

import java.math.BigDecimal;

public class KHeader {

    /* 시스템 영역 (System Area) */
    private String stndGuid; // 필수	메시지의 고유 ID, 중복 메시지 방지를 위해 고유하게 생성됨
    private String stndSendSysId; // 3 Sender System ID
    private String stndRecvSysId; // 3 Receiver System ID
    private String stndTranCd;  // 10 거래코드 (인터페이스 서비스 이름 (요청된 서비스의 이름이나 식별자))
    private String stndTranBaseYmd;
    private String stndTtl; // 메시지 유효 시간 (초 단위)로, 이 시간이 지나면 메시지가 무효 처리됨

    /* 거래 영역 (Transaction Area) */
    private String stndTranType;  // 거래 유형 (등록, 수정, 삭제, 조회 등)
    private String stndTranId;    // 거래의 고유 식별자 (거래별로 구유)
    private String stndTimeStamp; // yyyyMMddHHmmssSSSSSS
    private String stndTranStus;  // 거래상태 (성공, 실패, 진행 중 등)
    private BigDecimal stndTranAmt;  // 거래금액 15.000
    private String stndCcy;          // 3 거래통화 (ISO 4217 표준, 금전 거래 시 필수)
    private String stndErrCd;  // 거래 처리 결과에 대한 응답 코드 (성공, 실패, 경고 등 코드)
    private String stndErrMsg; // 에러 발생 시, 상세 에러 메시지

    /* 채널별 영역 (Channel-Specific Area) */
    private String stndChnlTyp; // 채널 유형 (예: WEB, MOBILE, API 등)
    private String stndChnlId;  // 각 채널의 고유 식별자 (채널 간 충돌 방지를 위한 고유 ID)
    private String stndUserAgt; // User Agent 	사용자 환경 정보 (웹 브라우저, 모바일 기기 등의 정보)
    private String stndDvcId; // 모바일 혹은 IoT 기기의 고유 식별자 (해당 기기에서 발생한 경우)
    private String stndLocInfo; // 거래 발생 시 사용자의 위치 정보 (필요할 경우 위도/경도로 표현 가능)
    private String stndSsionId; // 사용자 세션 고유 식별자 (채널별로 사용자 세션이 유지되는 경우)
    private String stndIpAddr;  // 요청을 발생시킨 클라이언트의 IP 주소
    private String stndAcesTokn; // 인증된 사용자를 식별하기 위한 토큰 (OAuth, JWT 등 사용)
    private String stndChnlAuthType; // 채널에서 사용하는 인증 방식 (예: OAuth, SAML, API Key 등)


}
