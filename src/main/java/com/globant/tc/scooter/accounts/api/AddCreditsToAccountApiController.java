package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.Account;
import com.globant.tc.scooter.accounts.model.InlineObject1;
import com.globant.tc.scooter.accounts.repositories.AccountRepository;
import com.globant.tc.scooter.accounts.repositories.InlineObject1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-20T04:57:43.215273600+05:00[Asia/Karachi]")
@Controller
@RequestMapping("${openapi.accounts.base-path:/accounts}")
public class AddCreditsToAccountApiController implements AddCreditsToAccountApi {

    @Autowired
    private InlineObject1Repository repository;
    private AddCreditsToAccountApiDelegate delegate;
    @Autowired
    private AccountRepository accountRepository;

    public AddCreditsToAccountApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) AddCreditsToAccountApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AddCreditsToAccountApiDelegate() {});
    }

    @Override
    public AddCreditsToAccountApiDelegate getDelegate() {
        AddCreditsToAccountApiDelegate addCreditsToAccountApi = new AddCreditsToAccountApiDelegate() {
            @Override
            public ResponseEntity addCreditsToAccountPost(InlineObject1 inlineObject1) {
                Optional<Account> account =accountRepository.findById(inlineObject1.getAccountId());

                if(account.isPresent()) {
                    Account account1= account.get();
                    account1.setBalance(account1.getBalance()+inlineObject1.getCredits());
                    accountRepository.save(account1);
                    return ResponseEntity.ok(Map.of(200, "Operation Success"));
                }
                    else
                    return ResponseEntity.ok(Map.of(503,"Unable to find resource"));

            }
        };

         delegate= addCreditsToAccountApi;
         return addCreditsToAccountApi;
    }

}
