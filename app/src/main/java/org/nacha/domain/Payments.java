package org.nacha.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;




public class Payments {

        private String currency;
        private LocalDateTime paymentDate;
        private String status;
        private BigDecimal amount;
        private String paymentId;
        private Long id;


        public void showBanner() {
                System.out.println("Welcome to Nacha");
        }
}
