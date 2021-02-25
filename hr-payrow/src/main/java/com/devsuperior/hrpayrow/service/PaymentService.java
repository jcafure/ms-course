package com.devsuperior.hrpayrow.service;

import com.devsuperior.hrpayrow.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return Payment.builder().name("Bob").dailyIncome(200.0).days(days).build();
    }
}
