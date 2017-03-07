/**
 *
 */
package de.apollon.darthSaminar.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import de.apollon.darthSaminar.model.JediMemorial;
import de.apollon.darthSaminar.service.JediService;

/**
 * @author snitsche
 *
 */
@SpringUI(path = "")
@Theme("deathstar")
public class MainUI extends UI
{

	@Autowired
	private JediService service;

	private Label textArea;

	@Override
	protected void init(VaadinRequest request)
	{

		VerticalLayout layout = new VerticalLayout();
		layout.setSizeFull();

		setContent(layout);

		textArea = new Label();
		textArea.setStyleName("memorial");
		textArea.setContentMode(ContentMode.HTML);

		layout.addComponent(textArea);
		layout.setComponentAlignment(textArea, Alignment.MIDDLE_CENTER);
		layout.setExpandRatio(textArea, 1);

		// layout.addComponent(btn);

		refresh();
	}

	public void refresh()
	{
		final StringBuffer sb = new StringBuffer();
		List<JediMemorial> list = service.findAll();
		if (list != null)
		{
			list.stream().forEach(l -> sb.append(
					"<b>" + l.getName() + "</b> died " + l.getDeathDateString() + " to " + l.getReason() + "<br/>"));
		}

		textArea.setValue(sb.toString());
	}

}
