package com.teste;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJTest {

    @Test
    public void checkEquality() {
        Person person = new Person("Barrack", "Obama");
        Person personClone = person;
        assertThat(person).isEqualTo(personClone);
    }
}
