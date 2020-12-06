package br.com.brasoccerclub.soccerplayers.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brasoccerclub.soccerplayers.dto.PlayerDTO;
import br.com.brasoccerclub.soccerplayers.entities.Player;
import br.com.brasoccerclub.soccerplayers.repositories.PlayerRepository;
import br.com.brasoccerclub.soccerplayers.services.exceptions.EntityNotFoundException;
import br.com.brasoccerclub.soccerplayers.services.exceptions.ResourceNotFoundException;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository repository;
	
	@Transactional(readOnly = true)
	public Page<PlayerDTO> findAllPaged(PageRequest pageRequest) {
		Page<Player> list = repository.findAll(pageRequest);
		return list.map(x -> new PlayerDTO(x));
	}
	
	@Transactional(readOnly = true)
	public PlayerDTO findById(Long id) {
		Optional<Player> obj = repository.findById(id);
		Player entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new PlayerDTO(entity);
	}
	
	@Transactional
	public PlayerDTO insert(PlayerDTO dto) {
		Player entity = new Player();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new PlayerDTO(entity);
	}
	
	@Transactional
	public PlayerDTO update(Long id, PlayerDTO dto) {
		try {
			Player entity = repository.getOne(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new PlayerDTO(entity);
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
	
	private void copyDtoToEntity(PlayerDTO dto, Player entity) {
		entity.setName(dto.getName());
		entity.setJerseyNumber(dto.getJerseyNumber());
		entity.setBirthDate(dto.getBirthDate());
		entity.setTeam(dto.getTeam());
		entity.setPosition(dto.getPosition());
	}
}
