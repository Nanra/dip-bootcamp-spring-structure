package com.example.training.repository;

import com.example.training.models.Payment;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public class PaymentRepository {

    public List<Payment> findAllPayment(){

        // Get Current
        Date date = new Date();

        // Instance & Set Value Object Payment
        Payment dataPayment = new Payment();

        dataPayment.setId("1");
        dataPayment.setInvoiceNumber("AACB001");
        dataPayment.setPaymentDate(date);
        dataPayment.setAmount(new BigDecimal(1000000));

        // Set Dummy Value Payment
        List<Payment> returnValue = (List<Payment>) dataPayment;

        return returnValue;
    }

    public List<Payment> findPaymentById(){
        return null;
    }

    public Integer updatePayment(Payment dataForSave){
        return null;
    }

    public Integer insertPayment(Payment dataForSave){
        return null;
    }

    public Integer deletePaymentById(String idPayment) {
        return null;
    }

}
