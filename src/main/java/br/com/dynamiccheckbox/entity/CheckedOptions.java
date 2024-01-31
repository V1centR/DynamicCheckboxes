package br.com.dynamiccheckbox.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CHECKEDOPTIONS")
public class CheckedOptions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "data_sequence2")
	@SequenceGenerator(name = "data_sequence2", sequenceName = "data_sequence_custom2",initialValue = 1, allocationSize = 3)
    @Column(name = "ID", nullable = false)
    private Long id;
	
	@Column(name = "CHECKED", length = 50, nullable = false)
    private String checked;

}
