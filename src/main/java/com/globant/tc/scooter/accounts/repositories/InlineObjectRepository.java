package com.globant.tc.scooter.accounts.repositories;

import com.globant.tc.scooter.accounts.model.InlineObject;
import com.globant.tc.scooter.accounts.model.inlineObjectEmbeddedId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InlineObjectRepository extends JpaRepository<InlineObject, inlineObjectEmbeddedId> {

    @Override
    boolean existsById(inlineObjectEmbeddedId inlineObjectEmbeddedId);
    Optional<InlineObject> findInlineObjectById(inlineObjectEmbeddedId id);
}
