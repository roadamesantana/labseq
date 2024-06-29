package com.alticelabs.labseq.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;

@Getter
@Setter
@Builder
public class ErrorResponseDTO {
    private int statusCode;
    private String errorMessage;
}
