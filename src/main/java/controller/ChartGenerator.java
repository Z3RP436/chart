package controller;

import model.BasicChart;
import model.LineChart;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ChartGenerator {
	public static BufferedImage drawChart(BasicChart chart) {
		switch (chart.getClass().getSimpleName()) {
		case "LineChart":
			return drawLineChart((LineChart) chart);
		default:
			return null;
		}
	}

	private static BufferedImage drawLineChart(LineChart lineChart) {
		int width = lineChart.getImageWidth();
		int height = lineChart.getImageHeight();
		int offset = lineChart.getChartOffset();
		int minX = lineChart.getChartMinX();
		int maxX = lineChart.getChartMaxX();
		int minY = lineChart.getChartMinY();
		int maxY = lineChart.getChartMaxY();

		double maxXValue = lineChart.getHighestXValue();
		double minXValue = lineChart.getLowestXValue();
		double maxYValue = lineChart.getHighestYValue();
		double minYValue = lineChart.getLowestYValue();

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics2D = image.createGraphics();
		graphics2D.setFont(lineChart.getFont());

		for (int i = 0; i < 10; i++) {
			int mappedXPos = (int) Utils.mapNumber(i, 0, 9, minX + offset, maxX - offset);

			graphics2D.setStroke(new BasicStroke(width / 1000));
			graphics2D.setPaint(Color.LIGHT_GRAY);
			graphics2D.drawLine(mappedXPos, minY - offset / 2, mappedXPos, maxY + offset / 2);
			Utils.drawCenteredString(graphics2D, lineChart.getDecimalFormat().format(Utils.mapNumber(i, 0, 9, minXValue, maxXValue)),
					new Rectangle(mappedXPos - offset / 2, maxY + offset / 2, offset, offset), lineChart.getFont());

			int mappedYPos = (int) Utils.mapNumber(i, 0, 9, minY + offset, maxY - offset);

			graphics2D.setStroke(new BasicStroke(width / 1000));
			graphics2D.setPaint(Color.LIGHT_GRAY);
			graphics2D.drawLine(minX - offset / 2, mappedYPos, maxX + offset / 2, mappedYPos);
			Utils.drawCenteredString(graphics2D, lineChart.getDecimalFormat().format(Utils.mapNumber(i, 9, 0, minYValue, maxYValue)),
					new Rectangle((int)(minX - offset * 1.5), mappedYPos - offset / 2, offset, offset), lineChart.getFont());
		}

		for(int i = 0 ; i< lineChart.getxValues().length;i++){
			if(i > 0) {
				int oldX = (int)Utils.mapNumber(lineChart.getxValues()[i-1],lineChart.getLowestXValue(),lineChart.getHighestXValue(),minX+offset,maxX-offset);
				int oldY = (int)Utils.mapNumber(lineChart.getyValues()[i-1],lineChart.getLowestYValue(),lineChart.getHighestYValue(),maxY-offset,minY+offset);
				int curX = (int)Utils.mapNumber(lineChart.getxValues()[i],lineChart.getLowestXValue(),lineChart.getHighestXValue(),minX+offset,maxX-offset);
				int curY = (int)Utils.mapNumber(lineChart.getyValues()[i],lineChart.getLowestYValue(),lineChart.getHighestYValue(),maxY-offset,minY+offset);

				graphics2D.setPaint(Color.BLACK);
				graphics2D.drawLine(oldX, oldY, curX, curY);
			}
		}

		graphics2D.setStroke(new BasicStroke(width / 1000));
		graphics2D.setPaint(Color.BLACK);
		graphics2D.drawRect(minX, minY, maxX - minX, maxY - minY);
		graphics2D.dispose();
		return image;
	}
}
