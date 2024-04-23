package tech.nb.loans.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class LoanController {

    @PostMapping("/customer-loans")
    public ResponseEntity<> customerLoad(){
        
    }
    
}
