package application;

import controller.ChartGenerator;
import model.LineChart;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String ... args) throws IOException {
		LineChart lineChart = new LineChart();
		lineChart.setChartOffset(200);
		lineChart.setImageWidth(5000);
		lineChart.setImageHeight(5000);
		lineChart.setChartMinX(1000);
		lineChart.setChartMinY(1000);
		lineChart.setChartMaxX(4000);
		lineChart.setChartMaxY(4000);
		lineChart.setFont(new Font("TimesRoman", Font.PLAIN, 25*5));
		lineChart.addValue(0,1*Math.PI);
		lineChart.addValue(1,2*Math.PI);
		lineChart.addValue(5,3*Math.PI);
		lineChart.addValue(2,4*Math.PI);
		lineChart.addValue(8,5*Math.PI);
		lineChart.addValue(9,6*Math.PI);
		lineChart.addValue(4,7*Math.PI);
		lineChart.addValue(2,8*Math.PI);
		lineChart.addValue(10,9*Math.PI);
		lineChart.addValue(3,10*Math.PI);
		lineChart.addValue(6,11*Math.PI);
		lineChart.addValue(11,12*Math.PI);
		lineChart.addValue(12,13*Math.PI);
		BufferedImage chart = ChartGenerator.drawChart(lineChart);
		ImageIO.write(chart,"png",new File("chart.png"));
	}
}
