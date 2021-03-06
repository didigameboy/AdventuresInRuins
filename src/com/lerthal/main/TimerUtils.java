package com.lerthal.main;

import java.util.Timer;
import java.util.TimerTask;

public class TimerUtils {

	public static void runTaskTimer(int segundos, Runnable task) {

		javax.swing.Timer timer = new javax.swing.Timer(segundos * 1000, e -> {
			task.run();
		});

		timer.start();
	}

	public static void runLater(int segundos, TimerTask task) {
		new Timer().schedule(task, segundos * 1000);
	}

}
