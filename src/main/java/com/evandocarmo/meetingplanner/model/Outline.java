package com.evandocarmo.meetingplanner.model;

import org.hibernate.validator.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "outlines")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
                      allowGetters = true)

public class Outline implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank
  private String title;

  @NotNull
  private Integer outlineNumber;

  @Temporal(TemporalType.TIMESTAMP)
  private Date lastGivenAt;

  // private Speaker lastGivenBy;

  @Column(nullable = false, updatable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @CreatedDate
  private Date createdAt;

  @Column(nullable = false)
  @Temporal(TemporalType.TIMESTAMP)
  @LastModifiedDate
  private Date updatedAt;
  
  public String getTitle(){
	  return this.title;
  }
  
  public void setTitle(String title) {
	  this.title = title;
  }
  public Integer getOutlineNumber(){
	  return this.outlineNumber;
  }
  
  public void setOutlineNumber(Integer number) {
	  this.outlineNumber = number;
  }
  
}
