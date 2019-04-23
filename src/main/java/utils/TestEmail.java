package utils;

import domain.Student;

import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class TestEmail {
	public void send(Student student) throws MessagingException {
	try{
			// 0.1 服务器的设置
			Properties props = new Properties();
			props.setProperty("mail.host", "smtp.qq.com");
			props.setProperty("mail.smtp.auth", "true");
			// 0.2 账号和密码
			Authenticator authenticator = new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {
				//发件人的账号密码
				return new PasswordAuthentication("1378930391@qq.com", "glxqccgfdcrticic");
				}
			};

			Session session = Session.getDefaultInstance(props, authenticator);

			// 2 编写邮件：Message
			Message message = new MimeMessage(session);
			// 2.1 发件人（模拟账号）
			message.setFrom(new InternetAddress("1378930391@qq.com"));

			String email = student.getStu_tel();
			//System.out.println(email + "************************");
			// 2.2 收件人 , to:收件人 ， cc ：抄送，bcc：暗送（密送）。（模拟账号）
			message.setRecipient(RecipientType.TO, new InternetAddress(email + "@qq.com"));
			// 2.3 主题
			message.setSubject("预约成功");
			Date date = student.getStu_exam_id().getExam_date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			date=simpleDateFormat.parse(date.toString());

			String subject = student.getStu_exam_id().getExam_subject();
			String room = student.getStu_exam_id().getExam_room();
			message.setContent("你预约了"+date+"在"+room+"的"+subject+"考试,请准时参加" , "text/html;charset=UTF-8");

			// 3 将消息进行发送：Transport
			Transport.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (ParseException e) {
		e.printStackTrace();
	}
	}
}
