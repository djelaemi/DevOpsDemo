package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PathListEntryTest {

    @Test
    void testColorSetterGetter() {
        PathListEntry<Object> entry = new PathListEntry<>();
        assertNull(entry.getColor(), "Initially color should be null"); // Testet den Initialwert von color
        entry.setColor("Red"); // Setzt color auf "Red"
        assertEquals("Red", entry.getColor(), "Color should be 'Red' after setting to 'Red'"); // Überprüft, ob getColor den korrekten Wert zurückgibt
    }

    @Test
    void testIconSetterGetter() {
        PathListEntry<Object> entry = new PathListEntry<>();
        assertNull(entry.getIcon(), "Initially icon should be null"); // Testet den Initialwert von icon
        entry.setIcon("icon.png"); // Setzt icon auf "icon.png"
        assertEquals("icon.png", entry.getIcon(), "Icon should be 'icon.png' after setting to 'icon.png'"); // Überprüft, ob getIcon den korrekten Wert zurückgibt
    }

    @Test
    void testEqualsWithSelf() {
        PathListEntry<String> entry = new PathListEntry<>();
        assertTrue(entry.equals(entry), "Ein Objekt sollte mit sich selbst immer gleich sein.");
    }

    @Test
    void testEqualsWithNull() {
        PathListEntry<String> entry = new PathListEntry<>();
        assertFalse(entry.equals(null), "Ein Objekt sollte niemals mit null gleich sein.");
    }

    @Test
    void testEqualsWithDifferentClass() {
        PathListEntry<String> entry = new PathListEntry<>();
        assertFalse(entry.equals(new Object()), "Ein Objekt sollte nicht mit einem Objekt einer anderen Klasse gleich sein.");
    }

    @Test
    void testEqualsWithDifferentKey() {
        PathListEntry<String> entry1 = new PathListEntry<>();
        entry1.setKey("key1", "name1");
        PathListEntry<String> entry2 = new PathListEntry<>();
        entry2.setKey("key2", "name1");
        assertFalse(entry1.equals(entry2), "Objekte mit unterschiedlichen Schlüsseln sollten nicht gleich sein.");
    }

    @Test
    void testEqualsWithNullKeyInBoth() {
    PathListEntry<String> entry1 = new PathListEntry<>();
    PathListEntry<String> entry2 = new PathListEntry<>();
    assertTrue(entry1.equals(entry2), "Zwei Objekte mit null als Schlüssel sollten als gleich angesehen werden.");
}

    @Test
    void testEqualsWithNullKeyInOne() {
    PathListEntry<String> entry1 = new PathListEntry<>();
    PathListEntry<String> entry2 = new PathListEntry<>();
    entry2.setKey("key1", "name1");
    assertFalse(entry1.equals(entry2), "Ein Objekt mit einem null Schlüssel sollte nicht mit einem Objekt mit einem nicht-null Schlüssel gleich sein.");
}

}
