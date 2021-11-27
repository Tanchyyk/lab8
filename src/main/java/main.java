import mail.*;

public class main {
    public static void main(String[] args) {
        Client c1 = new Client("Tania", 18, Gender.FEMALE);
        Client c2 = new Client("Such", 21, Gender.MALE);

        MailCode mc1 = MailCode.COMPLAINT;
        MailCode mc2 = MailCode.GREETING;

        MailInfo mi1 = new MailInfo(c1, mc1);
        MailInfo mi2 = new MailInfo(c2, mc2);

        MailBox mx = new MailBox();
        mx.addMailInfo(mi1);
        mx.addMailInfo(mi2);

        MailSender ms = new MailSender();

        ms.sendMail(mi1);
        ms.sendMail(mi2);
    }
}
