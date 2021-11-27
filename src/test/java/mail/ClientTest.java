package mail;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client c1 = new Client("Tania", 18, Gender.FEMALE);
    Client c2 = new Client("Such", 21, Gender.MALE);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Tania", c1.getName());
        assertEquals("Such", c2.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(18, c1.getAge());
        assertEquals(21, c2.getAge());
    }

    @org.junit.jupiter.api.Test
    void getGender() {
        assertEquals(c1.getGender(), Gender.FEMALE);
        assertEquals(c2.getGender(), Gender.MALE);
    }
}