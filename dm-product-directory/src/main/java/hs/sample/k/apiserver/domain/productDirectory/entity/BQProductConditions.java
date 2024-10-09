package hs.sample.k.apiserver.domain.productDirectory.entity;

import hs.sample.k.apiserver.domain.config.RootEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a
 * financial product or facility within Savings Account. 일반적으로 저축 계좌 내의 금융 상품이나 시설에 대한 서비스 계약에 따라
 * 예정된 특별한 의무를 이행해야 합니다.
 */
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "ProductConditionsListDetails")
@Entity
@Getter
public class BQProductConditions extends RootEntityBase {

    /*
     * 1. 상품코드
     * 2. 상품조건코드
     * 3. 적용시작년월일
     * -----------------
     * 5. 적용종료년월일
     * 6. 상품조건유형 -- PRODUCT_CONDITION_TYPES
     * */
}
