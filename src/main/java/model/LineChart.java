package model;

import java.util.Arrays;
import java.util.Collections;

public class LineChart extends BasicChart {
	private double[] xValues;
	private double[] yValues;

	public double getHighestXValue() {
		if (xValues.length > 0) {
			return Arrays.stream(xValues).max().getAsDouble();
		}
		return 0;
	}

	public double getLowestXValue() {
		if (xValues.length > 0) {
			return Arrays.stream(xValues).min().getAsDouble();
		}
		return 0;
	}

	public double getHighestYValue() {
		if (xValues.length > 0) {
			return Arrays.stream(yValues).max().getAsDouble();
		}
		return 0;
	}

	public double getLowestYValue() {
		if (xValues.length > 0) {
			return Arrays.stream(yValues).min().getAsDouble();
		}
		return 0;
	}

	public double[] getxValues() {
		return xValues;
	}

	public void setxValues(double[] xValues) {
		this.xValues = xValues;
	}

	public double[] getyValues() {
		return yValues;
	}

	public void setyValues(double[] yValues) {
		this.yValues = yValues;
	}
}
