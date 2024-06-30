package com.alticelabs.labseq.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LabseqResponseDTO {

    private int key;
    private int value;

}
