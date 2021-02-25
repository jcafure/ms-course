package com.devsuperior.hrpayrow.service;

import com.devsuperior.hrpayrow.entity.Payment;
import com.devsuperior.hrpayrow.entity.Worker;
import com.devsuperior.hrpayrow.feign.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;


    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return Payment.builder().name(worker.getName()).dailyIncome(worker.getDailyIncome()).days(days).build();
    }
}
