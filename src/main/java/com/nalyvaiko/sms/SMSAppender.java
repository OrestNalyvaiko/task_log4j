package com.nalyvaiko.sms;

import org.apache.logging.log4j.core.*;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.*;
import org.apache.logging.log4j.core.layout.PatternLayout;

import java.io.Serializable;

@Plugin(name = "sms", category = "Core", elementType = "appender", printObject = true)
public class SMSAppender extends AbstractAppender {

  protected SMSAppender(String name, Filter filter,
      Layout<? extends Serializable> layout, boolean ignoreExceptions) {
    super(name, filter, layout, ignoreExceptions);
  }

  public void append(LogEvent logEvent) {
    try {
      ExampleSMS.send(new String(getLayout().toByteArray(logEvent)));
    } catch (Exception e) {
    }
  }

  @PluginFactory
  public static SMSAppender createAppender(
      @PluginAttribute("name") String name,
      @PluginElement("Layout") Layout<? extends Serializable> layout,
      @PluginElement("Filter") final Filter filter,
      @PluginAttribute("otherAttribute") String otherAttribute) {
    if (name == null) {
      LOGGER.error("No name");
      return null;
    }
    if (layout == null) {
      layout = PatternLayout.createDefaultLayout();
    }
    return new SMSAppender(name, filter, layout, true);
  }
}

