package com.globant.tc.scooter.accounts.repositories;

import com.globant.tc.scooter.accounts.model.Account;
import com.globant.tc.scooter.accounts.model.InlineObject1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InlineObject1Repository extends JpaRepository<InlineObject1, Integer> {
}
