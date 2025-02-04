package org.nacha.api;

import org.nacha.domain.Payment;
import org.nacha.service.PaymentService;
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
        public Payment getPayment(@PathVariable Long id) {
                return paymentService.getPaymentById(id);
        }
}
