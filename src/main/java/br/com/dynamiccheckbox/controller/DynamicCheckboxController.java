package br.com.dynamiccheckbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dynamiccheckbox.entity.CheckedOptions;
import br.com.dynamiccheckbox.impl.CheckboxImpl;

/*
+-+-+-+-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+-+-+-+-+
|C|r|e|a|t|e|d|B|y| |D|e|v|P|r|o|V|i|c|e|n|t|
+-+-+-+-+-+-+-+-+-+ +-+-+-+-+-+-+-+-+-+-+-+-+
devprovicente@gmail.com | yyyymmdd:20242101 
*/
@RestController
@RequestMapping("/checkbox")
public class DynamicCheckboxController {

	@Autowired
	CheckboxImpl repo;

	@SuppressWarnings("rawtypes")
	@CrossOrigin
	@GetMapping("/all-selected")
	public ResponseEntity getSelected() {
		
		try {
			
			return ResponseEntity.status(HttpStatus.OK).body(repo.findAllChecked());
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{ 'MESSAGE': 'Houve um erro no processamento dos dados'");
		}
	}
	
	
	@SuppressWarnings("rawtypes")
	@CrossOrigin
	@GetMapping("/all-options")
	public ResponseEntity getCheckboxOptions() {
		
		try {
			
			return ResponseEntity.status(HttpStatus.OK).body(repo.findAll());
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{ 'MESSAGE': 'Houve um erro no processamento dos dados'");
		}
		
	}
	
	
	@SuppressWarnings("rawtypes")
	@CrossOrigin
	@PostMapping("/save")
	public ResponseEntity getSaveSelected(@RequestBody CheckedOptions requestBody) {

		try {

			return ResponseEntity.status(HttpStatus.CREATED).body(repo.saveSelected(requestBody));

		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{ 'MESSAGE': 'Houve um erro no processamento dos dados'");
		}
		
	}

}
