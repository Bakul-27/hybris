/**
 *
 */
package de.hybris.platform.cuppytrail.facades;

/**
 * @author Admin
 *
 */
import de.hybris.platform.cuppytrail.data.StadiumData;

import java.util.List;


public interface StadiumFacade
{
	StadiumData getStadium(String name);

	List<StadiumData> getStadiums();

}
