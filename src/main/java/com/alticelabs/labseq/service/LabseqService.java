package com.alticelabs.labseq.service;

import com.alticelabs.labseq.exceptions.InvalidValueException;
import org.springframework.stereotype.Service;

@Service
public class LabseqService {
    public int calculate(int n) {
        System.out.println(n);
        switch (n) {
            case 0:
            case 2:
                return 0;
            case 1:
            case 3:
                return 1;
            default:
                if (n < 0) {
                    throw new InvalidValueException();
                }

                return calculate(n - 4) + calculate(n - 3);
        }
    }
}
