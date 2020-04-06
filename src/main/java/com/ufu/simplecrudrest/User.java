package com.ufu.simplecrudrest;
  
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
  
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "user")
@Getter
@Setter
public class User implements Serializable {
  
    private static final long serialVersionUID = 1L;
  
    @XmlAttribute(name = "id")
    private int id;
  
    @XmlAttribute(name="uri")
    private String uri;
  
    @XmlElement(name = "firstName")
    private String firstName;
  
    @XmlElement(name = "lastName")
    private String lastName;
  
    @XmlElement(name = "address")
    private String address;
  
   
}