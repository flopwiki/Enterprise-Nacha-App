package org.nacha.util;

import java.util.logging.Logger;
import org.nacha.api.PaymentService;

public class LoggerUtility {
        Logger logger = Logger.getLogger(LoggerUtility.class.getName());
        public void paymentLogging(String payment) {
                logger.info("Payment Details: " + payment);
        }

        public void remittanceLogger() {
                logger.info("Remittance Details: ");
        }
}
