package com.nalyvaiko.sms;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class ExampleSMS {

  public static final String ACCOUNT_SID = "AC8dfcb714dcc4b09dfde9710e542f8501";
  public static final String AUTH_TOKEN = "df25f2d874f5d8095d63eeecf2a11389";

  public static void send(String str) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    Message message = Message.creator(new PhoneNumber("+380675840397"),
        new PhoneNumber("+1 669 201 8894"), str).create();
  }
}
