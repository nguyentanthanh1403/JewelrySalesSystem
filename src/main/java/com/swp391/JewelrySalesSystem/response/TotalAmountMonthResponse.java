package com.swp391.JewelrySalesSystem.response;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TotalAmountMonthResponse {
  private int month;
  private Float totalAmount;
}
