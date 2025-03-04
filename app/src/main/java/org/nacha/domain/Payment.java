package org.nacha.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Payment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private String currency;
        private LocalDateTime paymentDate;
        private String status;
        private BigDecimal amount;
        private String paymentId;
        private Long id;

        public Long getPaymentById(Long id) {
                return this.id;
        }


        public String showBanner() {
                return "Welcome to the NACHA Payment System";
        }

        public void setStatus(String processed) {
               this.status = processed;
        }


}
