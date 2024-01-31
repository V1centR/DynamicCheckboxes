package br.com.dynamiccheckbox.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dynamiccheckbox.entity.CheckBoxes;
import br.com.dynamiccheckbox.entity.CheckedOptions;
import br.com.dynamiccheckbox.repo.CheckboxRepo;
import br.com.dynamiccheckbox.repo.CheckedOptionsRepo;
import br.com.dynamiccheckbox.service.CheckboxService;

@Service("checkboxImpl")
public class CheckboxImpl implements CheckboxService {
	
	@Autowired
	CheckboxRepo repo;
	
	@Autowired
	CheckedOptionsRepo repoChecked;
	
	public List<CheckBoxes> findAll() {
		return repo.findAll();
	}
	
	public List<CheckedOptions> findAllChecked() {
		return repoChecked.findAll();
	}
	
	public CheckedOptions saveSelected(CheckedOptions requestBody) {
		
		return repoChecked.save(requestBody);
	}

}
