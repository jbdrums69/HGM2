package com.example.hellogooglemaps;

import java.util.ArrayList;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapView;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public class Lot extends ItemizedOverlay<Spot> {
	private ArrayList<Spot> spots;
	private int selectedIndex = -1;
	
	private Context mContext;
	private int zoomLevel;

	private int lotId;
	private String name;

	private int centerLat;
	private int centerLong;
	
	private MapView mapView;
	private boolean dirty = true;

	public Lot(Drawable defaultMarker, Context context, int lotId, String name,
			int centerLat, int centerLong, int zoom, MapView mv) {

		super(boundCenter(defaultMarker));
		mContext = context;
		this.mapView = mv;

		this.lotId = lotId;
		this.name = name;
		this.centerLat = centerLat;
		this.centerLong = centerLong;
		this.zoomLevel = zoom;
		this.spots = new ArrayList<Spot>();
	}

	@Override
	protected Spot createItem(int i) {
		return spots.get(i);
	}

	@Override
	public int size() {
		return spots.size();
	}

	public void addSpot(Spot spot) {
		spots.add(spot);
		populate();
	}

	public Spot getSpot(int spotNumber) {
		return spots.get(spotNumber);
	}

	public ArrayList<Spot> getAllSpots() {
		return spots;
	}

	@Override
	protected boolean onTap(int index) {
		
		for(Spot spot : spots)
		{
			spot.setSelected(false);
			spot.refreshOverlay(zoomLevel);
		}
		
		Spot spot = spots.get(index);
		spot.setSelected(true);
		selectedIndex = index;

		AlertDialog.Builder dialog = new AlertDialog.Builder(mContext);
		dialog.setTitle(spot.getTitle());
		dialog.setMessage(spot.getSnippet() + "\nZoomLevel: " + zoomLevel
				+ "\nI-height: " + spot.getMarker(0).getIntrinsicHeight()
				+ "\nI-width: " + spot.getMarker(0).getIntrinsicWidth()
				+ "\nWidth: " + spot.getWidth()
				+ "\nHeight: " + spot.getHeight()
				+ "\nCenterLat:" + spot.getCenterLatString()
				+ "\nCenterLong:" + spot.getCenterLongString());

		dialog.show();
		
		mapView.invalidate();
		
		return true;
	}
	
	public Spot getSelectedSpot()
	{
		if(selectedIndex != -1)
			return spots.get(selectedIndex);
		return null;
	}

	@Override
	public void draw(Canvas canvas, MapView mapView, boolean shadow) {
		if (dirty || zoomLevel != mapView.getZoomLevel()) {
			dirty = false;
			zoomLevel = mapView.getZoomLevel();
			for (Spot spot : spots) {
				spot.refreshOverlay(zoomLevel);
			}
		}

		super.draw(canvas, mapView, false);
	}

	public int getLotId() {
		return lotId;
	}

	public String getName() {
		return name;
	}

	public int getCenterLat() {
		return centerLat;
	}

	public int getCenterLong() {
		return centerLong;
	}
	
	public int getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(int zoomLevel) {
		this.zoomLevel = zoomLevel;
	}

	public int getSelectedIndex() {
		return selectedIndex;
	}

	public void setSelectedIndex(int selectedIndex) {
		this.selectedIndex = selectedIndex;
	}
}
