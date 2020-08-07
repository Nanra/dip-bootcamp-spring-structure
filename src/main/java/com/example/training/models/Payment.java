package com.example.training.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {

    public String id;
    public Date paymentDate;
    public String invoiceNumber;
    public BigDecimal amount;

}
