package mail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    Client c1 = new Client("Tania", 18, Gender.FEMALE);
    Client c2 = new Client("Such", 21, Gender.MALE);

    MailCode mc1 = MailCode.COMPLAINT;
    MailCode mc2 = MailCode.GREETING;

    MailInfo mi1 = new MailInfo(c1, mc1);
    MailInfo mi2 = new MailInfo(c2, mc2);

    MailBox mx = new MailBox();

    @BeforeEach
    void setUp() {
        mx.addMailInfo(mi1);
        mx.addMailInfo(mi2);
    }

    @Test
    void addMailInfo() {
        assertEquals(mx.getInfos().get(0), mi1);
        assertEquals(mx.getInfos().get(1), mi2);
    }
}