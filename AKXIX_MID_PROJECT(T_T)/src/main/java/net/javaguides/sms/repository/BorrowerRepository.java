package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Borrower;

public interface BorrowerRepository extends JpaRepository<Borrower, Long>{

}
