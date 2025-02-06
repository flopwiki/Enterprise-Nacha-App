package org.nacha.api;

import org.nacha.infra.persistence.PaymentRespository;
import org.springframework.beans.factory.annotation.Autowired;
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

        public Object getPaymentById(Long id) {
                return paymentRespository.findById(id);
        }
}
