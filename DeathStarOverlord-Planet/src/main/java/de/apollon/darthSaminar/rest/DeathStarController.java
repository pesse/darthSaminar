/**
 *
 */
package de.apollon.darthSaminar.rest;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.apollon.darthSaminar.service.DeathStarService;

/**
 * @author snitsche
 *
 */
@RestController("/rest/deathstar")
public class DeathStarController
{
	@Autowired
	private DeathStarService service;

	@RequestMapping(method = RequestMethod.HEAD)
	public void whatToDo(HttpServletRequest request, HttpServletResponse response)
	{
		response.addHeader("link", "/rest/deathstar/fire");
	}

	@RequestMapping(value = "/rest/deathstar/fire", method = RequestMethod.POST)
	public void fire()
	{
		service.fireDeathStar();
	}
}
