package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.Account;
import com.globant.tc.scooter.accounts.model.InlineObject4;
import com.globant.tc.scooter.accounts.repositories.AccountRepository;
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
public class BuyCreditsMercadoPagoApiController implements BuyCreditsMercadoPagoApi {

    private BuyCreditsMercadoPagoApiDelegate delegate;

    @Autowired
    AccountRepository accountRepository;

    public BuyCreditsMercadoPagoApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) BuyCreditsMercadoPagoApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BuyCreditsMercadoPagoApiDelegate() {});
    }

    @Override
    public BuyCreditsMercadoPagoApiDelegate getDelegate() {
        BuyCreditsMercadoPagoApiDelegate buyCreditsMercadoPagoApiDelegate = new BuyCreditsMercadoPagoApiDelegate() {
            @Override
            public ResponseEntity buyCreditsMercadoPagoPost(InlineObject4 inlineObject4) {

                Optional<Account> account =accountRepository.findById(inlineObject4.getAccountId());
                if (!account.isPresent())
                    return ResponseEntity.ok(Map.of(503,"Unable to find resource"));
                RestTemplate restTemplate = new RestTemplate();
                String url = "${mercadoPago-service-baseurl}";
                ResponseEntity<String> response = restTemplate.postForEntity(url,inlineObject4,String.class);
                if(response.getStatusCode()!= HttpStatus.OK )
                    return ResponseEntity.ok(Map.of(response.getStatusCode(),"Error accessing the service consistent with http status code"));
                return ResponseEntity.ok(Map.of(200,"Operation Success"));
            }
        };
        delegate= buyCreditsMercadoPagoApiDelegate;

        return buyCreditsMercadoPagoApiDelegate;
    }

}
