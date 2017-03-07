/**
 *
 */
package de.apollon.darthSaminar.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.apollon.darthSaminar.model.JediMemorial;
import de.apollon.darthSaminar.service.repository.JediMemorialRepository;

/**
 * @author snitsche
 *
 */
@Service
public class JediService
{
	@Autowired
	private JediMemorialRepository repository;

	@Transactional
	public List<JediMemorial> findAll()
	{
		return repository.findAll();
	}
}
