package wsb.email.wsb_email;

import lombok.Data;

@Data
public class Mail {

    private String recipient;
    private String subject;
    private String content;
}
