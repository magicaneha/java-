import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendMailSSL
 {

	static public void sendMail(  final String mailFrom, final String password  ,final String mailTo, String subject , String data ) throws Exception
	{


//Get the session object
  Properties props = new Properties();
  props.put("mail.smtp.host", "smtp.gmail.com");
  props.put("mail.smtp.socketFactory.port", "465");
  props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.port", "465");
 
  Session session = Session.getDefaultInstance(props,   new javax.mail.Authenticator() 
	{
		   protected PasswordAuthentication getPasswordAuthentication() {
		   return new PasswordAuthentication(mailFrom,password);//change accordingly
	   }
	  });
 
//compose message
	  try 
	{
 		  MimeMessage message = new MimeMessage(session);
		   message.setFrom(new InternetAddress(mailFrom));//change accordingly
		   message.addRecipient(Message.RecipientType.TO,new InternetAddress(mailTo));
		   message.setSubject(subject);
		   message.setText(data);
   
		   //send message
		   Transport.send(message);

		   System.out.println("message sent successfully");
 
	  }
	 catch (MessagingException e)
	 {
		throw new RuntimeException(e);
	}
 
 }


	 public static void main(String[] args) 
	{
		
		try
		{
	
			sendMail(args[0],args[1],args[2],args[3],args[4]);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}