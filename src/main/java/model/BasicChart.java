package model;

import java.awt.*;
import java.text.DecimalFormat;

public abstract class BasicChart {
	protected int imageWidth = 5000;
	protected int imageHeight = 5000;
	protected int chartMinX = 1000;
	protected int chartMaxX = 4000;
	protected int chartMinY = 1000;
	protected int chartMaxY = 4000;
	protected int chartOffset = 100;
	protected Font font = new Font("TimesRoman", Font.PLAIN, 25);
	protected DecimalFormat decimalFormat = new DecimalFormat("0.0");


	public int getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}

	public int getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}

	public int getChartMinX() {
		return chartMinX;
	}

	public void setChartMinX(int chartMinX) {
		this.chartMinX = chartMinX;
	}

	public int getChartMaxX() {
		return chartMaxX;
	}

	public void setChartMaxX(int chartMaxX) {
		this.chartMaxX = chartMaxX;
	}

	public int getChartMinY() {
		return chartMinY;
	}

	public void setChartMinY(int chartMinY) {
		this.chartMinY = chartMinY;
	}

	public int getChartMaxY() {
		return chartMaxY;
	}

	public void setChartMaxY(int chartMaxY) {
		this.chartMaxY = chartMaxY;
	}

	public int getChartOffset() {
		return chartOffset;
	}

	public void setChartOffset(int chartOffset) {
		this.chartOffset = chartOffset;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	public DecimalFormat getDecimalFormat() {
		return decimalFormat;
	}

	public void setDecimalFormat(DecimalFormat decimalFormat) {
		this.decimalFormat = decimalFormat;
	}
}
