package com.selimhorri.app.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "credentials")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public final class Credential implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "credential_id", unique = true, nullable = false)
	private Integer credentialId;
	
	@Column(unique = true)
	private String username;
	
	private String password;
	
	private String role;
	
	@Column(name = "is_enabled")
	private Boolean isEnabled;
	
	@Column(name = "is_account_non_expired")
	private Boolean isAccountNonExpired;
	
	@Column(name = "is_account_non_locked")
	private Boolean isAccountNonLocked;
	
	@Column(name = "is_credentials_non_expired")
	private Boolean isCredentialsNonExpired;
	
	@JsonIgnore
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "credential")
	private Set<VerificationToken> verificationTokens;
	
	@CreatedDate
	@Column(name = "created_at")
	private Instant createdAt;
	
	@LastModifiedDate
	@Column(name = "updated_at")
	private Instant updatedAt;
	
}








