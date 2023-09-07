package model;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class test{
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACa4fe50a9405f7b7d155a65825a7d941a";
    public static final String AUTH_TOKEN = "1574c9aa47cc15fe66469460a34b02cd";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+243975799040"),
                new com.twilio.type.PhoneNumber("+16184183882"),
                "bonjour mr cedrick musonda")
            .create();

        System.out.println(message.getSid());
    }
}
