package mail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    Client c1 = new Client("Tania", 18, Gender.FEMALE);
    Client c2 = new Client("Such", 21, Gender.MALE);

    MailCode mc1 = MailCode.COMPLAINT;
    MailCode mc2 = MailCode.GREETING;

    MailInfo mi1 = new MailInfo(c1, mc1);
    MailInfo mi2 = new MailInfo(c2, mc2);

    @BeforeEach
    void setUp() {
    }

    @Test
    void getClient() {
        assertEquals(mi1.getClient(), c1);
        assertEquals(mi2.getClient(), c2);
    }

    @Test
    void getMailCode() {
        assertEquals(mi1.getMailCode(), mc1);
        assertEquals(mi2.getMailCode(), mc2);
    }
}