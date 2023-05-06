package com.thiruacademy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="my_table100")
public class DBTable {
	@Id
	private Long id;
	private String col1;
	private String col2;
	private String col3;
}
