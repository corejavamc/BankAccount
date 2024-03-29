package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findById(long id);
    Account findByAcctno(String acctno);
}
