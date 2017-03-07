/**
 *
 */
package de.apollon.darthSaminar.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author snitsche
 *
 */
@Entity
@Table(schema = "MM_HIVE", name = "VW_JEDI_MEMORIAL")
public class JediMemorial
{
	@Id
	@Column
	private Long id;

	@Column
	private String name;

	@Column
	private String reason;

	@Column
	private Date deathDate;

	/**
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return the reason
	 */
	public String getReason()
	{
		return reason;
	}

	/**
	 * @return the deathDate
	 */
	public Date getDeathDate()
	{
		return deathDate;
	}

	public String getDeathDateString()
	{
		SimpleDateFormat df = new SimpleDateFormat("d.M.y");

		return df.format(deathDate);
	}

}
