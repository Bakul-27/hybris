//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.23 at 07:13:05 PM CEST 
//


package de.hybris.platform.cuppy.ws.openligadb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTeamsByLeagueSaisonResult" type="{http://msiggi.de/Sportsdata/Webservices}ArrayOfTeam" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder =
{ "getTeamsByLeagueSaisonResult" })
@XmlRootElement(name = "GetTeamsByLeagueSaisonResponse")
@SuppressWarnings("PMD")
public class GetTeamsByLeagueSaisonResponse
{

	@XmlElement(name = "GetTeamsByLeagueSaisonResult")
	protected ArrayOfTeam getTeamsByLeagueSaisonResult;

	/**
	 * Gets the value of the getTeamsByLeagueSaisonResult property.
	 * 
	 * @return possible object is {@link ArrayOfTeam }
	 * 
	 */
	public ArrayOfTeam getGetTeamsByLeagueSaisonResult()
	{
		return getTeamsByLeagueSaisonResult;
	}

	/**
	 * Sets the value of the getTeamsByLeagueSaisonResult property.
	 * 
	 * @param value
	 *           allowed object is {@link ArrayOfTeam }
	 * 
	 */
	public void setGetTeamsByLeagueSaisonResult(final ArrayOfTeam value)
	{
		this.getTeamsByLeagueSaisonResult = value;
	}

}
