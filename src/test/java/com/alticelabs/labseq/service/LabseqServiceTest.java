package com.alticelabs.labseq.service;

import com.alticelabs.labseq.dto.LabseqResponseDTO;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LabseqServiceTest {

    private LabseqService service;

    @BeforeEach
    public void setUp() {
        service = new LabseqService();
    }

    @Test
    public void testLabseqValueAtIndex0() {
        final LabseqResponseDTO dto = service.getLabseqValue(0);
        final int expected = 0;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex1() {
        final LabseqResponseDTO dto = service.getLabseqValue(1);
        final int expected = 1;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex2() {
        final LabseqResponseDTO dto = service.getLabseqValue(2);
        final int expected = 0;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex3() {
        final LabseqResponseDTO dto = service.getLabseqValue(3);
        final int expected = 1;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex4() {
        final LabseqResponseDTO dto = service.getLabseqValue(4);
        final int expected = 1;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex5() {
        final LabseqResponseDTO dto = service.getLabseqValue(5);
        final int expected = 1;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex6() {
        final LabseqResponseDTO dto = service.getLabseqValue(6);
        final int expected = 1;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex7() {
        final LabseqResponseDTO dto = service.getLabseqValue(7);
        final int expected = 2;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex8() {
        final LabseqResponseDTO dto = service.getLabseqValue(8);
        final int expected = 2;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex9() {
        final LabseqResponseDTO dto = service.getLabseqValue(9);
        final int expected = 2;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

    @Test
    public void testLabseqValueAtIndex10() {
        final LabseqResponseDTO dto = service.getLabseqValue(10);
        final int expected = 3;
        final int actual = dto.getValue();
        assertEquals(expected, actual);
    }

}
