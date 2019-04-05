package application;

import controller.ChartGenerator;
import model.LineChart;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String ... args) throws IOException {
		LineChart lineChart = new LineChart();
		lineChart.setChartOffset(50);
		lineChart.setImageWidth(1000);
		lineChart.setImageHeight(1000);
		lineChart.setChartMinX(200);
		lineChart.setChartMinY(200);
		lineChart.setChartMaxX(800);
		lineChart.setChartMaxY(800);
		lineChart.setxValues(new double[]{1,2,3,4,5,6,7,13});
		lineChart.setyValues(new double[]{0.2,0.5,0.7,0.3,0.6,1,0.3,1});
		BufferedImage chart = ChartGenerator.drawChart(lineChart);
		ImageIO.write(chart,"png",new File("chart.png"));
	}
}
