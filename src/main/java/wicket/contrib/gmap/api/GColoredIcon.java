package wicket.contrib.gmap.api;

import java.awt.*;

import static java.lang.Integer.toHexString;

/**
 * Created by victor.konopelko
 */
public class GColoredIcon extends GIcon {

    private Color color;

    public GColoredIcon(Color color) {
        this.color = color;
    }

    public String getJSconstructor() {
        StringBuffer buffer = new StringBuffer();
		buffer.append("(function() {\n");
		buffer.append("var icon = MapIconMaker.createMarkerIcon({width: 32, height: 32");
        if (color != null) {
            buffer.append(", primaryColor: \"");
            buffer.append("#");
            buffer.append(toHexString(color.getRed()));
            buffer.append(toHexString(color.getGreen()));
            buffer.append(toHexString(color.getBlue()));
        } else {
            buffer.append(", primaryColor: \"");
            buffer.append("#ffffff"); //white
        }
        buffer.append("\"});\n");
		buffer.append("return icon;\n");
		buffer.append("})()\n");
		return buffer.toString();
    }

    @Override
    public GColoredIcon clone() {
        return new GColoredIcon(color != null ? new Color(color.getRGB()) : null);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		GColoredIcon other = (GColoredIcon) obj;
		if (color == null) {
			if (other.color != null) {
				return false;
			}
		} else if (!color.equals(other.color)) {
			return false;
		}
		return true;
	}
}
