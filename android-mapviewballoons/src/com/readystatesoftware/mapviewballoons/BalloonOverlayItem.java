package com.readystatesoftware.mapviewballoons;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.OverlayItem;

public class BalloonOverlayItem extends OverlayItem {

	protected boolean showBalloon = true;

	public BalloonOverlayItem(GeoPoint geoPoint, String title, String subTitle) {
		super(geoPoint, title, subTitle);
	}
	
	protected boolean showBalloon() {
		return showBalloon;
	}

	protected void setShowBalloon(boolean showBalloon) {
		this.showBalloon = showBalloon;
	}
}
