package br.com.brasoccerclub.soccerplayers.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brasoccerclub.soccerplayers.entities.Position;
import br.com.brasoccerclub.soccerplayers.services.PositionService;

@RestController
@RequestMapping(value = "/positions")
public class PositionResource {
	
	@Autowired
	private PositionService service;
	
	@GetMapping
	public ResponseEntity<List<Position>> findAll() {
		List<Position> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
