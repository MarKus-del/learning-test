package com.teste;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty() {
        new ArrayList<Object>().get(0);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() {
        List<Object> list = new ArrayList<Object>();

        thrown.expect(IndexOutOfBoundsException.class);
        thrown.expectMessage("Index 0 out of bounds for length 0");
        list.get(0);
    }

    @Test
    public void testExpectionMessage() {
        try {
            new ArrayList<Object>().get(0);
            fail("Esperado que o IndexOutOfBoundsException seja lançada");
        } catch (IndexOutOfBoundsException ex) {
            assertThat(ex.getMessage(), is("Index 0 out of bounds for length 0"));
        }
    }
}
