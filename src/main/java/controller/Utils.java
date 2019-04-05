package controller;

import java.awt.*;
import java.util.Random;

public class Utils {
	public static double mapNumber(double x, double in_min, double in_max, double out_min, double out_max) {
		return (x - in_min) * ((out_max - out_min) / (in_max - in_min)) + out_min;
	}

	public static void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
		FontMetrics metrics = g.getFontMetrics(font);
		int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
		int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
		g.setFont(font);
		g.drawString(text, x, y);
	}

	public final static Random rnd = new Random();
}
