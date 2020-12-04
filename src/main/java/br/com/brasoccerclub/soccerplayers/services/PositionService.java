package br.com.brasoccerclub.soccerplayers.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brasoccerclub.soccerplayers.dto.PositionDTO;
import br.com.brasoccerclub.soccerplayers.entities.Position;
import br.com.brasoccerclub.soccerplayers.repositories.PositionRepository;

@Service
public class PositionService {
	
	@Autowired
	private PositionRepository repository;
	
	public List<PositionDTO> findAll() {
		List<Position> list = repository.findAll();
		return list.stream().map(x -> new PositionDTO(x)).collect(Collectors.toList());
	}
}
