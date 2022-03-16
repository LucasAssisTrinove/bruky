/*package com.api.bruky.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.bruky.models.ParkingSportModel;
import com.api.bruky.repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	final ParkingSpotRepository parkingSpotRepository;
	
	public ParkingSpotService (ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}
	
	
	@Transactional // segurança caso a transção não der certo, volte ao normal
	public ParkingSportModel save(ParkingSportModel parkingSpotMobel) {
		
		return parkingSpotRepository.save(parkingSpotMobel);
	}
}
*/