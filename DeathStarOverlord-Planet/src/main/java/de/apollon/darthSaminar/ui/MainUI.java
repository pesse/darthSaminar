/**
 *
 */
package de.apollon.darthSaminar.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import de.apollon.darthSaminar.service.DeathStarService;
import de.apollon.darthSaminar.service.DeathStarService.DeathStarFireListener;

/**
 * @author snitsche
 *
 */
@SpringUI(path = "")
@Theme("deathstar")
@Push
public class MainUI extends UI
{
	@Autowired
	private DeathStarService service;

	private Image planetImage;

	private DeathStarFireListener deathStarFireListener;

	@Override
	protected void init(VaadinRequest request)
	{

		VerticalLayout layout = new VerticalLayout();
		layout.setSizeFull();

		setContent(layout);

		Label lbl = new Label("Nananana Deathstar - you won't hurt us!");

		layout.addComponent(lbl);
		layout.setComponentAlignment(lbl, Alignment.MIDDLE_CENTER);

		planetImage = new Image(null, new ThemeResource("img/planet.gif"));

		layout.addComponent(planetImage);
		layout.setComponentAlignment(planetImage, Alignment.MIDDLE_CENTER);
		layout.setExpandRatio(planetImage, 1);

		Button btn = new Button("Shoot", e -> shoot());

		// layout.addComponent(btn);
	}

	@Override
	public void attach()
	{
		super.attach();

		deathStarFireListener = new DeathStarFireListener()
		{

			@Override
			public void fire()
			{
				if (isAttached())
					access(() -> destroyPlanet());
			}
		};

		service.addFireListener(deathStarFireListener);
	}

	@Override
	public void detach()
	{
		// Important thing to remove the Listener, otherwise we will have a
		// memory leak AND stale/unattached UIs in the listener set
		service.removeFireListener(deathStarFireListener);

		super.detach();
	}

	protected void shoot()
	{
		service.fireDeathStar();
	}

	protected void destroyPlanet()
	{
		planetImage.setSource(new ThemeResource("img/planet_destroy.gif"));
	}

}
