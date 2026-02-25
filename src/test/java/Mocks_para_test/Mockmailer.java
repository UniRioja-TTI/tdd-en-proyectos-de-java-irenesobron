package Mocks_para_test;

import com.tt1.test.Imailer;
import com.tt1.test.MailerStub;

import java.util.ArrayList;
import java.util.List;

public class Mockmailer implements Imailer {
    private final List<MailerStub> correosEnviados = new ArrayList<>();
    private MailerStub stub = new MailerStub("FF@gmail.com", "FFFFF");

    @Override
    public boolean enviarCorreo() {
        correosEnviados.add(stub);
        return true;
    }
}
