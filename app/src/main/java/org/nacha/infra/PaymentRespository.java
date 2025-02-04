package org.nacha.infra;

import org.nacha.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PaymentRespository extends JpaRepository<Payment, Long> {

}
