package mail;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class MailBox {
    private ArrayList<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        MailSender sender = new MailSender();
        for (MailInfo info: infos){
            sender.sendMail(info);
        }
    }
}
