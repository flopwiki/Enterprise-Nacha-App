package org.nacha.api;

import org.nacha.domain.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

        @Autowired
        private PaymentService paymentService;

        @PostMapping
        public Payment createPayment(@RequestBody Payment payment) {
                return paymentService.processPayment(payment);
        }

        @GetMapping("/{id}")
        public Long getPayment(@org.springframework.web.bind.annotation.PathVariable Long id) {
                return id;
        }
}
