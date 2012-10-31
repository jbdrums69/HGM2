package com.example.hellogooglemaps;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class LotMap extends MapActivity
{
	private boolean showSatelliteView = true;
	private MapView mapView;
	private MapController mapController;
	private Lot lot;
	
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
        
    	mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        mapView.setSatellite(showSatelliteView);
                
        Drawable defaultMarker = this.getResources().getDrawable(R.drawable.androidmarker);
        lot = new Lot(defaultMarker, this, 1, "Lot 1", 35654125, -97473500, 20, mapView);
        mapView.getOverlays().add(lot);

        mapController = mapView.getController();
        mapController.setCenter(new GeoPoint(lot.getCenterLat(), lot.getCenterLong()));
        mapController.setZoom(lot.getZoomLevel());
        
        // Row 1
        int rowLat = 35654538;
        int colOneLong = -97473800;
        int colOffset = 30;
        int rotation = 45;
        lot.addSpot(new Spot(101, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 4, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(102, "OCCUPIED", "none", "COMMUTER", rowLat - 2, colOneLong + colOffset * 5, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(103, "AVAILABLE", "none", "COMMUTER", rowLat - 4, colOneLong + colOffset * 6, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(104, "OCCUPIED", "none", "COMMUTER", rowLat - 6, colOneLong + colOffset * 7, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(105, "AVAILABLE", "none", "COMMUTER", rowLat - 8, colOneLong + colOffset * 8, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(106, "OCCUPIED", "none", "COMMUTER", rowLat - 10, colOneLong + colOffset * 9, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(107, "AVAILABLE", "none", "COMMUTER", rowLat - 12, colOneLong + colOffset * 10, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(108, "OCCUPIED", "none", "COMMUTER", rowLat - 14, colOneLong + colOffset * 11, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(109, "AVAILABLE", "none", "FACULTY", rowLat - 16, colOneLong + colOffset * 12, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(110, "OCCUPIED", "none", "COMMUTER", rowLat - 18, colOneLong + colOffset * 13, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(111, "AVAILABLE", "none", "COMMUTER", rowLat - 20, colOneLong + colOffset * 14, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(112, "OCCUPIED", "none", "COMMUTER", rowLat - 22, colOneLong + colOffset * 15, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(113, "AVAILABLE", "none", "COMMUTER", rowLat - 24, colOneLong + colOffset * 16, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(114, "OCCUPIED", "none", "FACULTY", rowLat - 26, colOneLong + colOffset * 17, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(115, "AVAILABLE", "none", "FACULTY", rowLat - 28, colOneLong + colOffset * 18, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(116, "OCCUPIED", "none", "COMMUTER", rowLat - 30, colOneLong + colOffset * 19, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(117, "AVAILABLE", "none", "COMMUTER", rowLat - 32, colOneLong + colOffset * 20, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(118, "OCCUPIED", "none", "COMMUTER", rowLat - 34, colOneLong + colOffset * 21, rotation, lot.getZoomLevel()));
        
        // Row 2
        rowLat = 35654388;
        colOneLong = -97473825;
        rotation = 0;
        lot.addSpot(new Spot(201, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 0, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(202, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 1, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(203, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 2, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(204, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 3, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(205, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 4, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(206, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 5, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(207, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 6, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(208, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 7, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(209, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 8, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(210, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 9, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(211, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 10, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(212, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 11, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(213, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 12, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(214, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 13, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(215, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 14, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(216, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 15, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(217, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 16, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(218, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 17, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(219, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 18, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(220, "AVAILABLE", "none", "FACULTY", rowLat, colOneLong + colOffset * 19, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(221, "OCCUPIED", "none", "FACULTY", rowLat, colOneLong + colOffset * 20, rotation, lot.getZoomLevel()));
        // Row 3
        rowLat = 35654330;
        colOneLong = -97473825;
        rotation = 0;
        lot.addSpot(new Spot(301, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 0, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(302, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 1, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(303, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 2, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(304, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 3, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(305, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 4, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(306, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 5, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(307, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 6, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(308, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 7, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(309, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 8, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(310, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 9, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(311, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 10, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(312, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 11, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(313, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 12, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(314, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 13, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(315, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 14, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(316, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 15, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(317, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 16, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(318, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 17, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(319, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 18, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(320, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 19, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(321, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 20, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(322, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 21, rotation, lot.getZoomLevel()));
        
        // Row 4
        rowLat = 35654218;
        colOneLong = -97473825;
        rotation = 90;
        lot.addSpot(new Spot(401, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 2, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(402, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 3, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(403, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 4, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(404, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 5, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(405, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 6, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(406, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 7, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(407, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 8, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(408, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 9, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(409, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 10, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(410, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 11, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(411, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 12, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(412, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 13, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(413, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 14, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(414, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 15, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(415, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 16, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(416, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 17, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(417, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 18, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(418, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 19, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(419, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 20, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(420, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 21, rotation, lot.getZoomLevel()));
        // Row 5
        rowLat = 35654168;
        colOneLong = -97473825;
        rotation = 90;
        lot.addSpot(new Spot(501, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 2, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(502, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 3, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(503, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 4, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(504, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 5, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(505, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 6, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(506, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 7, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(507, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 8, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(508, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 9, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(509, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 10, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(510, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 11, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(511, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 12, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(512, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 13, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(513, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 14, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(514, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 15, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(515, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 16, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(516, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 17, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(517, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 18, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(518, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 19, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(519, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 20, rotation, lot.getZoomLevel()));

        // Row 6
        rowLat = 35654049;
        colOneLong = -97473797;
        rotation = 0;
        lot.addSpot(new Spot(601, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 0, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(602, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 1, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(603, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 2, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(604, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 3, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(605, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 4, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(606, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 5, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(607, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 6, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(608, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 7, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(609, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 8, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(610, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 9, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(611, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 10, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(612, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 11, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(613, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 12, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(614, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 13, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(615, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 14, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(616, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 15, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(617, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 16, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(618, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 17, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(619, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 18, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(620, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 19, rotation, lot.getZoomLevel()));
	    // Row 7
        rowLat = 35653994;
        colOneLong = -97473797;
        lot.addSpot(new Spot(701, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 0, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(702, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 1, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(703, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 2, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(704, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 3, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(705, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 4, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(706, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 5, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(707, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 6, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(708, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 7, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(709, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 8, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(710, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 9, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(711, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 10, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(712, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 11, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(713, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 12, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(714, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 13, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(715, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 14, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(716, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 15, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(717, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 16, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(718, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 17, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(719, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 18, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(720, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 19, rotation, lot.getZoomLevel()));
     
        // Row 8
        rowLat = 35653877;
        colOneLong = -97473785;
        lot.addSpot(new Spot(801, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 2, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(802, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 3, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(803, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 4, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(804, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 5, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(805, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 6, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(806, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 7, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(807, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 8, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(808, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 9, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(809, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 10, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(810, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 11, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(811, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 12, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(812, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 13, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(813, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 14, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(814, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 15, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(815, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 16, rotation, lot.getZoomLevel()));
        // Row 9
        rowLat = 35653820;
        colOneLong = -97473785;
        lot.addSpot(new Spot(901, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 2, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(902, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 3, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(903, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 4, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(904, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 5, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(905, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 6, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(906, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 7, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(907, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 8, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(908, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 9, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(909, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 10, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(910, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 11, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(911, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 12, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(912, "AVAILABLE", "none", "COMMUTER", rowLat, colOneLong + colOffset * 13, rotation, lot.getZoomLevel()));
        lot.addSpot(new Spot(913, "OCCUPIED", "none", "COMMUTER", rowLat, colOneLong + colOffset * 14, rotation, lot.getZoomLevel()));
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
        MenuInflater oMenu = getMenuInflater();
        oMenu.inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    		case R.id.mapStreetView:
    			mapView.setSatellite(false);
    			mapView.invalidate();
    			return true;
	
    		case R.id.mapSatView:
    			mapView.setSatellite(true);
    			mapView.invalidate();
    			return true;
    			
    		case R.id.showRouteWithMaps:
    			// Shows route, but no navigation
    			Intent intentMaps = new Intent(Intent.ACTION_VIEW, 
    								Uri.parse("http://maps.google.com/maps?" 
    								+ "saddr=35.466682,-97.414251&"
    								+ "daddr="
    								+ lot.getSelectedSpot().getCenterLatString() + ","
    								+ lot.getSelectedSpot().getCenterLongString()));
    			intentMaps.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
    			this.startActivity(intentMaps);
    			return true;
    			
    		case R.id.launchNavigation:
    			// Navigation Beta version in emulator, warns you not to use while driving.
    			// Not Beta on real devices?
    			Intent intentNavBeta = new Intent(Intent.ACTION_VIEW, 
    									Uri.parse("google.navigation:q="
    									+ lot.getSelectedSpot().getCenterLatString() + ","
    									+ lot.getSelectedSpot().getCenterLongString()));
    			this.startActivity(intentNavBeta);
    			return true;
    	}
    	return false;
    }

    @Override
    protected boolean isRouteDisplayed()
    {
    	return false;
    }
}
