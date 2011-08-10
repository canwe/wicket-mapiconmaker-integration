package wicket.contrib.gmap.mapiconmaker;

import org.apache.wicket.ResourceReference;
import org.apache.wicket.behavior.HeaderContributor;
import org.apache.wicket.markup.html.IHeaderContributor;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.markup.html.resources.JavascriptResourceReference;
import wicket.contrib.gmap.GMap2;

/**
 * Created by victor.konopelko
 */
public class IconMakerHeaderContributor extends HeaderContributor
{
	private static final long serialVersionUID = 1L;

	// We have some custom Javascript.
	private static final ResourceReference ICON_MAKER_JS = new JavascriptResourceReference(
			IconMakerHeaderContributor.class, "mapiconmaker.js");

	public IconMakerHeaderContributor()
	{
		super(new IHeaderContributor()
		{
			private static final long serialVersionUID = 1L;

			/**
			 * @see org.apache.wicket.markup.html.IHeaderContributor#renderHead(org.apache.wicket.markup.html.IHeaderResponse)
			 */
			public void renderHead(IHeaderResponse response)
			{
				response.renderJavascriptReference(ICON_MAKER_JS);
			}
		});
	}
}
