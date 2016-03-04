package com.company;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.*;

/**
 * Created by mfrankie on 3/3/16.
 */
public class MainTest {

    @Test
    public void shouldReturnOneStar() {
        assertEquals("*", Main.oneStar());
    }

    @Test
    public void shouldReturnHorizontalLineOfStars() {
        assertEquals("****", Main.horizontalLine(4));
    }

    @Test
    public void shouldReturnVertialLineofStars() {
        assertEquals("*\n*\n*", Main.verticalLine(3));
    }

    @Test
    public void shouldReturnShortLinesOfStars() {
        assertEquals("", Main.verticalLine(0));
        assertEquals("*", Main.verticalLine(1));
    }

    @Test
    public void shouldReturnTriangle() {
        assertEquals("*\n**\n***", Main.rightTriangle(3));
    }

    @Test
    public void shouldReturnPaddedLine() {
        assertEquals("  ***  ", Main.paddedLine(3, 2));
    }

    @Test
    public void shouldReturnIsoscelesTriangle() {
        assertEquals("  *  \n *** \n*****", Main.isoscelesTriangle(3));
    }

    @Test
    public void shouldReturnDiamond() {
        assertEquals("  *  \n *** \n*****\n *** \n  *  ", Main.diamond(3));
    }

    @Test
    public void shouldReturnDiamondWithName() {
        assertEquals("  *  \n *** \nMagda\n *** \n  *  ", Main.diamondWithName(3));
    }

    @Test
    public void shouldComputeListOfPrimeFactors() {
        assertEquals(Arrays.asList(2,2,3,5),Main.computePrimeFactors(60));
    }

    @Test
    public void shouldComputeListOfPrimeFactorsWithMultipleOfTheSame() {
        assertEquals(Arrays.asList(2,2,2),Main.computePrimeFactors(8));
    }

    @Test
    public void shouldComputeEmptyList(){
        assertEquals(Arrays.asList(),Main.computePrimeFactors(1));
    }

    //test for FizzBuzz

}