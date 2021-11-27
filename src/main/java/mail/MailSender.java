package mail;

public class MailSender {
    public void sendMail(MailInfo mailInfo) {
        System.out.println("Mail is sent to " + mailInfo.getClient().getName() + ", type of mail: " + mailInfo.getMailCode());
    }
}
