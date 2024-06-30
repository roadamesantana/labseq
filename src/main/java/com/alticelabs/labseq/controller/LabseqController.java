package com.alticelabs.labseq.controller;

import com.alticelabs.labseq.dto.ErrorResponseDTO;
import com.alticelabs.labseq.dto.LabseqResponseDTO;
import com.alticelabs.labseq.service.LabseqService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("labseq")
public class LabseqController {

    @Autowired
    private LabseqService service;

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error"),
            @ApiResponse(responseCode = "400", description = "Bad Request",
                    content = @Content(examples = {@ExampleObject(description = "An integer with value")}))})
    @GetMapping("/{n}")
    public ResponseEntity<LabseqResponseDTO> getValue(@PathVariable int n) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.getLabseqValue(n));
    }

}
