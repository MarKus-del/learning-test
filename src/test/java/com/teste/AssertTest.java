package com.teste;

import static org.junit.Assert.*;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

public class AssertTest {

    @Test
    public void testAssertArrayEqual() {
        byte[] esperado = "teste".getBytes();
        byte[] atual = "teste".getBytes();
        assertArrayEquals(esperado, atual);
    }

    @Test
    public void testAssertEqual() {
        assertEquals("text", "text");
    }

    @Test
    public void testAssertFalse() {
        assertFalse(false);
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame() {
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    @Test
    public void testAssertSame() {
        Integer aNumber = Integer.valueOf(786);
        assertSame(aNumber, aNumber);
    }

}
