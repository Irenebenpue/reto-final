package org.springframework.samples.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.Role;
import org.springframework.samples.petclinic.model.User;
import org.springframework.samples.petclinic.repository.OfferRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OfferServiceImpl implements OfferService {

	@Autowired
	private OfferRepository offerRepository;
	
	@Override
    public void saveOffer(Offer offer) {
        offerRepository.save(offer);
    }
	
	@Override
	public void deleteOffer(Offer offer) {
		offerRepository.delete(offer);
	}
	
	@Override
	public Offer getOffer(Integer id) {
		return offerRepository.findOne(id);
	}
	
	@Override
	public void updateOffer(Offer offer) {
		offerRepository.update(offer);
	}
}
