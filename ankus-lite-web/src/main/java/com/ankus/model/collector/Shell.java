/**
 * This file is part of ankus.
 *
 * ankus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ankus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ankus.  If not, see <http://www.gnu.org/licenses/>.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.21 at 10:54:40 오전 KST 
//


package com.ankus.model.collector;

import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workingDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="program" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.openankus.org/schema/collector}args" minOccurs="0"/>
 *         &lt;element ref="{http://www.openankus.org/schema/collector}envs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "workingDirectory",
    "program",
    "args",
    "envs"
})
@XmlRootElement(name = "shell")
public class Shell implements Serializable {

    @XmlElement(required = true)
    protected String workingDirectory;
    @XmlElement(required = true)
    protected String program;
    protected Args args;
    protected Envs envs;

    /**
     * Gets the value of the workingDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * Sets the value of the workingDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkingDirectory(String value) {
        this.workingDirectory = value;
    }

    /**
     * Gets the value of the program property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the value of the program property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgram(String value) {
        this.program = value;
    }

    /**
     * Gets the value of the args property.
     * 
     * @return
     *     possible object is
     *     {@link Args }
     *     
     */
    public Args getArgs() {
        return args;
    }

    /**
     * Sets the value of the args property.
     * 
     * @param value
     *     allowed object is
     *     {@link Args }
     *     
     */
    public void setArgs(Args value) {
        this.args = value;
    }

    /**
     * Gets the value of the envs property.
     * 
     * @return
     *     possible object is
     *     {@link Envs }
     *     
     */
    public Envs getEnvs() {
        return envs;
    }

    /**
     * Sets the value of the envs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Envs }
     *     
     */
    public void setEnvs(Envs value) {
        this.envs = value;
    }

}