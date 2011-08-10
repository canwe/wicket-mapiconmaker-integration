package com.vk.mapiconmaker.simple;

import com.vk.mapiconmaker.GMapExampleApplication;
import com.vk.mapiconmaker.LatLngGenerator;
import com.vk.mapiconmaker.RandomColor;
import com.vk.mapiconmaker.WicketExamplePage;
import org.apache.wicket.ajax.AjaxRequestTarget;
import wicket.contrib.gmap.GMap2;
import wicket.contrib.gmap.api.GColoredMarker;
import wicket.contrib.gmap.api.GLatLng;
import wicket.contrib.gmap.event.LoadListener;
import wicket.contrib.gmap.mapiconmaker.IconMakerHeaderContributor;

/**
 * SimplePage for the wicket-contrib-gmap2 project
 */
public class SimplePage extends WicketExamplePage
{

	private static final long serialVersionUID = 1L;

	public SimplePage()
	{
		final GMap2 map = new GMap2("map", GMapExampleApplication.get().getGoogleMapsAPIkey());
		map.setCenter(new GLatLng(52.37649, 4.888573));
        map.setZoom(0);
        map.add(new IconMakerHeaderContributor());

        map.add(new LoadListener() {
            @Override
            protected void onLoad(AjaxRequestTarget target) {
                for (int i = 0; i < 100; i++) {
                    GColoredMarker m = new GColoredMarker(LatLngGenerator.next(), RandomColor.randomColor());
                    map.addOverlay(m);
                }
            }
        });
		add(map);
	}
}
