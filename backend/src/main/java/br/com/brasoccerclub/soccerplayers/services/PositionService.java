package br.com.brasoccerclub.soccerplayers.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brasoccerclub.soccerplayers.dto.PositionDTO;
import br.com.brasoccerclub.soccerplayers.entities.Position;
import br.com.brasoccerclub.soccerplayers.repositories.PositionRepository;
import br.com.brasoccerclub.soccerplayers.services.exceptions.EntityNotFoundException;
import br.com.brasoccerclub.soccerplayers.services.exceptions.ResourceNotFoundException;

@Service
public class PositionService {
	
	@Autowired
	private PositionRepository repository;
	
	@Transactional(readOnly = true)
	public Page<PositionDTO> findAllPaged(PageRequest pageRequest) {
		Page<Position> list = repository.findAll(pageRequest);
		return list.map(x -> new PositionDTO(x));
	}
	
	@Transactional(readOnly = true)
	public PositionDTO findById(Long id) {
		Optional<Position> obj = repository.findById(id);
		Position entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new PositionDTO(entity);
	}
	
	@Transactional
	public PositionDTO insert(PositionDTO dto) {
		Position entity = new Position();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new PositionDTO(entity);
	}
	
	@Transactional
	public PositionDTO update(Long id, PositionDTO dto) {
		try {
			Position entity = repository.getOne(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new PositionDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found: " + id);
		}
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found: " + id);
		}
	}
	
	private void copyDtoToEntity(PositionDTO dto, Position entity) {
		entity.setName(dto.getName());
		entity.setFieldArea(dto.getFieldArea());
	}
}
