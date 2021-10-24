package org.jabref.model.database.event;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AutosaveEventTest {

    private Object Null;
    
    @Test
    public void givenNothingWhenCreatingThenNotNull() {
        AutosaveEvent e = new AutosaveEvent();
        assertNotNull(e);
    }
    
    @Test
    public void givenNULLWhenCreatingThenNull() {
        AutosaveEvent Null = new AutosaveEvent();
        assertNotNull(Null);
    }
}
