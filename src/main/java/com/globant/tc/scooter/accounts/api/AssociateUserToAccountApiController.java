package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.Account;
import com.globant.tc.scooter.accounts.model.InlineObject;
import com.globant.tc.scooter.accounts.model.InlineObject2;
import com.globant.tc.scooter.accounts.model.inlineObjectEmbeddedId;
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
public class AssociateUserToAccountApiController implements AssociateUserToAccountApi {

    private AssociateUserToAccountApiDelegate delegate;

    @Autowired
    InlineObjectRepository inlineObjectRepository;

    @Autowired
    AccountRepository accountRepository;
    public AssociateUserToAccountApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) AssociateUserToAccountApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new AssociateUserToAccountApiDelegate() {});
    }

    @Override
    public AssociateUserToAccountApiDelegate getDelegate() {
        AssociateUserToAccountApiDelegate associateUserToAccountApiDelegate= new AssociateUserToAccountApiDelegate() {
            @Override
            public ResponseEntity associateUserToAccountPost(InlineObject2 inlineObject2) {
                Optional<Account> account =accountRepository.findById(inlineObject2.getAccountId());
                RestTemplate restTemplate = new RestTemplate();
                String url = "${usermanagement-service-baseurl}"+inlineObject2.getUserId();
                ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
                if(response.getStatusCode()!= HttpStatus.OK )
                    return ResponseEntity.ok(Map.of(response.getStatusCode(),"Unable to find resource"));
                if(account.isPresent()){
                inlineObjectEmbeddedId embeddedId = new inlineObjectEmbeddedId(inlineObject2.getUserId(),account.get());
                Optional<InlineObject> inlineObject= inlineObjectRepository.findInlineObjectById(embeddedId);
                if(inlineObject.isPresent())
                    return ResponseEntity.ok(Map.of(HttpStatus.OK.value(),"Invalid input"));
                else {

                    InlineObject inlineFinal= new InlineObject();
                    inlineObjectEmbeddedId embeddedIdfinal = new inlineObjectEmbeddedId(inlineObject2.getUserId(),account.get());
                    inlineFinal.setId(embeddedIdfinal);
                    inlineObjectRepository.save(inlineFinal);
                    return ResponseEntity.ok(Map.of(HttpStatus.OK.value(),"Operation Success"));
                }}
                else return ResponseEntity.ok(Map.of(HttpStatus.OK.value(),"Unable to find resource"));


            }
        };
        delegate=associateUserToAccountApiDelegate;
        return associateUserToAccountApiDelegate;
    }

}
