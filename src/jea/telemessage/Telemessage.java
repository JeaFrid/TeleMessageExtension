package jea.telemessage;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class Telemessage extends AndroidNonvisibleComponent {

  public Telemessage(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction(description = "Send a message to any user from the Telegram bot.")
  public String SendMessage(String BotToken, String UserID, String Message) {

    String HTTPS = "https://api.telegram.org/bot";
    String HTTPS2 = "/sendmessage?chat_id=";
    String HTTPS3 = "&text=";

    return HTTPS+BotToken+HTTPS2+UserID+HTTPS3+Message;
  }

}
