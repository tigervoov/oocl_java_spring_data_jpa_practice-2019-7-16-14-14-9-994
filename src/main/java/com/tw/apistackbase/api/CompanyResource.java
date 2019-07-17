package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyResource {


    @Autowired
    private CompanyRepository companyRepository;
    

    
    @PostMapping(produces = {"application/json"})
    public ResponseEntity add(@RequestBody Company company) {

         companyRepository.saveAndFlush(company);

        return ResponseEntity.ok().body(companyRepository.findAll());
    }

    @GetMapping(produces = {"application/json"})
    public ResponseEntity getAll(){
        return ResponseEntity.ok().body(companyRepository.findAll());
    }


}
