package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.Account;
import com.globant.tc.scooter.accounts.model.InlineObject;
import com.globant.tc.scooter.accounts.repositories.AccountRepository;
import com.globant.tc.scooter.accounts.repositories.InlineObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-20T04:57:43.215273600+05:00[Asia/Karachi]")
@Controller
@RequestMapping("${openapi.accounts.base-path:/accounts}")
public class CreateAccountApiController implements CreateAccountApi {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    InlineObjectRepository inlineObjectRepository;

    private CreateAccountApiDelegate delegate;

    public CreateAccountApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) CreateAccountApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new CreateAccountApiDelegate() {});
    }

    @Override
    public CreateAccountApiDelegate getDelegate() {
        CreateAccountApiDelegate createAccountApiDelegate= new CreateAccountApiDelegate() {
            @Override
            public ResponseEntity createAccountPost(InlineObject inlineObject) {
                RestTemplate restTemplate = new RestTemplate();
                String url = "${usermanagement-service-baseurl}"+inlineObject.getId().getUserId();
                ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
                if(response.getStatusCode()!= HttpStatus.OK )
                    return ResponseEntity.ok(Map.of(503,"Unable to find the resource"));
                Account account= accountRepository.save(inlineObject.getId().getAccount());
                inlineObject.getId().setAccount(account);
                InlineObject inlineObject1= inlineObjectRepository.save(inlineObject);
                if(inlineObject1!=null)
                    return ResponseEntity.ok(Map.of(200,"Operation Success"));
                else return ResponseEntity.ok(Map.of(503,"Invalid input"));
            }
        };
        delegate =createAccountApiDelegate;
        return createAccountApiDelegate;
    }

}
