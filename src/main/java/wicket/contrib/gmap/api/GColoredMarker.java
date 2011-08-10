package wicket.contrib.gmap.api;

import java.awt.*;

/**
* @author victor.konopelko
*         Date: 09.06.11
*/
public class GColoredMarker extends GMarker {

    //color: (optional) specifies a 24-bit color (example: color=0xFFFFCC)
    private Color color;

    public GColoredMarker(GLatLng gLatLng) {
        super(gLatLng);
    }

    public GColoredMarker(GLatLng gLatLng, final Color color) {
        super(gLatLng, new GMarkerOptions("", new GColoredIcon(color)));
        this.color = color;
    }

    public GColoredMarker(GLatLng gLatLng, GMarkerOptions options) {
        super(gLatLng, options);
        if (options.getIcon() instanceof GColoredIcon) {
            GColoredIcon icon = (GColoredIcon) options.getIcon();
            this.color = icon.getColor();
        }
    }

    public Color getColor() {
        return color;
    }
}
