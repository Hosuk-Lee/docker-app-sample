package hs.sample.k.apiserver.domain.productDirectory.entity;

import hs.sample.k.apiserver.domain.config.RootEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "ProductDirectory")
@Entity
@Getter
public class CRProductDirectory extends RootEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
        name = "product_instance_reference",
        columnDefinition = "VARCHAR(255) COMMENT '상품 인스턴스 참조번호'"
    )
    // A 수신 (요구불:01/적금:02/예금:03)
    // B 여신 (가계:01/기업:02)
    private String productInstanceReference;

    @Column(
        name = "product_status_code",
        columnDefinition = "VARCHAR(255) COMMENT '상품 상태코드'"
    )
    private String productStatusCode;

    @Column(
        name = "sales_start_ymd",
        columnDefinition = "VARCHAR(255) COMMENT '상품 판매 시작일'"
    )
    private String salesStartYmd; // 판매 시작일

    @Column(
        name = "sales_end_ymd",
        columnDefinition = "VARCHAR(255) COMMENT '상품 판매 종료일'"
    )
    private String salesEndDate; // 판매 종료일

    @Column(
        name = "product_name",
        columnDefinition = "VARCHAR(255) COMMENT '상품명'"
    )
    private String productName; // 프리미엄적금

    @Column(
        name = "product_name_eng",
        columnDefinition = "VARCHAR(255) COMMENT '상품명 (영어)'"
    )
    private String productNameEng; // premium deposit


}
