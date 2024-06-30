package com.alticelabs.labseq.service;

import com.alticelabs.labseq.dto.ErrorResponseDTO;
import com.alticelabs.labseq.dto.LabseqResponseDTO;
import com.alticelabs.labseq.exceptions.InvalidValueException;
import com.alticelabs.labseq.util.MyCache;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class LabseqService {

    public LabseqResponseDTO getLabseqValue(int num) {
        return LabseqResponseDTO.builder()
                .key(num)
                .value(calculate(num))
                .build();
    }

    public int calculate(int n) {
        Optional<Integer> num = MyCache.getInstance().getNum(n);
        if(num.isPresent()) {
            return num.get();
        }

        int toReturn;

        switch (n) {
            case 0:
            case 2:
                toReturn = 0;
                break;
            case 1:
            case 3:
                toReturn = 1;
                break;
            default:
                if (n < 0) {
                    throw new InvalidValueException();
                }

                toReturn = calculate(n - 4) + calculate(n - 3);
        }

        MyCache.getInstance().addNum(n, toReturn);
        return toReturn;
    }
}
