package br.com.dynamiccheckbox.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dynamiccheckbox.entity.CheckBoxes;

@Repository
public interface CheckboxRepo extends JpaRepository<CheckBoxes, Integer> {}
