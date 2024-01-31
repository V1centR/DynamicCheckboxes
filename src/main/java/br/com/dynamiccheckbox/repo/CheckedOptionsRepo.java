package br.com.dynamiccheckbox.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dynamiccheckbox.entity.CheckedOptions;

@Repository
public interface CheckedOptionsRepo extends JpaRepository<CheckedOptions, Long> {}
