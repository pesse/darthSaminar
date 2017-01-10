/**
 *
 */
package de.apollon.darthSaminar.ui;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import de.apollon.darthSaminar.force.Force;

/**
 * @author snitsche
 *
 */
@SpringUI
@Theme("valo")
public class MainUI extends UI
{

	@Autowired
	private Force force;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.vaadin.ui.UI#init(com.vaadin.server.VaadinRequest)
	 */
	@Override
	protected void init(VaadinRequest request)
	{
		VerticalLayout layout = new VerticalLayout();
		layout.setWidth("100%");
		layout.setMargin(true);
		layout.setSpacing(true);

		setContent(layout);

		Button triggerButton = new Button("Create Disturbance", e -> force.createDisturbance());

		layout.addComponent(triggerButton);
		layout.setComponentAlignment(triggerButton, Alignment.MIDDLE_CENTER);

		HorizontalLayout hl = new HorizontalLayout();

		layout.addComponent(hl);
		layout.setExpandRatio(hl, 1);
		layout.setComponentAlignment(hl, Alignment.MIDDLE_CENTER);

		final Image luke = new Image(null, new ExternalResource("/img/luke.jpg"));

		force.addForceSensitiveObject(() -> luke.setCaption("I am disturbed"));

		hl.addComponent(luke);
		Image han = new Image(null, new ExternalResource("/img/han.jpg"));

		hl.addComponent(han);

		final Image yoda = new Image(null, new ExternalResource("/img/yoda.jpg"));

		force.addForceSensitiveObject(() -> yoda.setCaption("Disturbed I am"));

		hl.addComponent(yoda);

	}

}
