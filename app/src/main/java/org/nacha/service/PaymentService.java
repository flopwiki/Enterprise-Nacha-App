package org.nacha.service;

import org.nacha.repository.PaymentRespository;
import org.springframework.beans.factory.annotation.Autowired;

// infra

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

        @Autowired
        private PaymentRespository paymentRespository;

        public org.nacha.domain.Payment processPayment(
                org.nacha.domain.Payment payment) {
                payment.setStatus("PROCESSED");
                return paymentRespository.save(payment);
        }

        public org.nacha.domain.Payment getPaymentById(Long id) {
                return (org.nacha.domain.Payment) paymentRespository.findById(id);
        }
}
