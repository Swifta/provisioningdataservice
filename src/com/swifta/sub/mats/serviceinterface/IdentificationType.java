package com.swifta.sub.mats.serviceinterface;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for identificationType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="identificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSP"/>
 *     &lt;enumeration value="DRLCS"/>
 *     &lt;enumeration value="SOCS"/>
 *     &lt;enumeration value="IDCD"/>
 *     &lt;enumeration value="EMID"/>
 *     &lt;enumeration value="NRIN"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "identificationType")
@XmlEnum
public enum IdentificationType {

	PASSP(1), DRLCS(2), SOCS(3), IDCD(4), EMID(5), NRIN(6), OTHR(7);

	private int value;

	private IdentificationType(int v) {
		value = v;
	}

	public int returnIntvalue() {
		return value;
	}

}
