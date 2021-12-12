package com.selimhorri.app.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = {"subCategories", "parentCategory", "products"})
@Data
@Builder
public final class Category extends AbstractMappedEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id", unique = true, nullable = false, updatable = false)
	private Integer categoryId;
	
	@Column(name = "category_title")
	private String categoryTitle;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@JsonIgnore
	@OneToMany(mappedBy = "parentCategory", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Category> subCategories;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "parent_category_id")
	private Category parentCategory;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Product> products;
	
}










