package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.Account;
import com.globant.tc.scooter.accounts.model.InlineObject;
import com.globant.tc.scooter.accounts.repositories.AccountRepository;
import com.globant.tc.scooter.accounts.repositories.InlineObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import java.util.Properties;

/**
 * A delegate to be called by the {@link CreateAccountApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-20T04:57:43.215273600+05:00[Asia/Karachi]")
@Service
public interface CreateAccountApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /createAccount : Create an Account and registered it to an user
     *
     * @param inlineObject  (required)
     * @return Operation success (status code 200)
     *         or  (status code 503)
     * @see CreateAccountApi#createAccountPost
     */
    default ResponseEntity createAccountPost(InlineObject inlineObject) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
