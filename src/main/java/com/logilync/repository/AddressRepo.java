package com.logilync.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.logilync.domain.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
