package ch.home.tschungsbot.core;

import javax.security.auth.login.LoginException;

import ch.home.tschungsbot.util.STATIC;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;

public class Main {

	public static void main(String[] args) {

		JDABuilder builder = new JDABuilder(AccountType.BOT);

		builder.setToken(STATIC.TOKEN);
		builder.setAutoReconnect(true);
		builder.setStatus(OnlineStatus.ONLINE);

		try {
			JDA jda = builder.buildBlocking();
		} catch (LoginException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
