/*
 * Savings Account
 * This service domain orchestrates a consumer savings account. The typical range of services and fees covers payments from and scheduled and ad-hoc deposits to the account, standing orders, sweeps, and liens.
 *
 * OpenAPI spec version: 11.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package hs.sample.k.apiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Arrays;





import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
//import org.threeten.bp.LocalDate;
/**
 * ExecutePaymentsResponsePayments
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-10-20T14:18:15.269223656Z[GMT]")

public class ExecutePaymentsResponsePayments {
  @JsonProperty("PaymentTransactionDate")
  private LocalDate paymentTransactionDate = null;

  @JsonProperty("PaymentTransactionStatus")
  private String paymentTransactionStatus = null;

  public ExecutePaymentsResponsePayments paymentTransactionDate(LocalDate paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
    return this;
  }

   /**
   * Get paymentTransactionDate
   * @return paymentTransactionDate
  **/
  @Schema(description = "")
  public LocalDate getPaymentTransactionDate() {
    return paymentTransactionDate;
  }

  public void setPaymentTransactionDate(LocalDate paymentTransactionDate) {
    this.paymentTransactionDate = paymentTransactionDate;
  }

  public ExecutePaymentsResponsePayments paymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
    return this;
  }

   /**
   *  
   * @return paymentTransactionStatus
  **/
  @Schema(description = " ")
  public String getPaymentTransactionStatus() {
    return paymentTransactionStatus;
  }

  public void setPaymentTransactionStatus(String paymentTransactionStatus) {
    this.paymentTransactionStatus = paymentTransactionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecutePaymentsResponsePayments executePaymentsResponsePayments = (ExecutePaymentsResponsePayments) o;
    return Objects.equals(this.paymentTransactionDate, executePaymentsResponsePayments.paymentTransactionDate) &&
        Objects.equals(this.paymentTransactionStatus, executePaymentsResponsePayments.paymentTransactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTransactionDate, paymentTransactionStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutePaymentsResponsePayments {\n");
    
    sb.append("    paymentTransactionDate: ").append(toIndentedString(paymentTransactionDate)).append("\n");
    sb.append("    paymentTransactionStatus: ").append(toIndentedString(paymentTransactionStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
