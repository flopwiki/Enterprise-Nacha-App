package org.nacha.service;

import org.nacha.domain.Payments;
import org.springframework.beans.factory.annotation.Autowired;

// infra

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

        @Autowired
        private PaymentRespository paymentRespository;

        public Payments processPayment(Payments payment) {
                payment.setStatus("PROCESSED");
                return paymentRespository.save(payment);
        }

        public Payments getPaymentById(Long id) {
                return paymentRespository.findById(id).orElse(null);
        }
}
