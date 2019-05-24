package org.springframework.samples.petclinic.service;

public interface OfferService {
	
	public void saveOffer (Offer offer);
	public void deleteOffer (Offer offer);
	public Offer getOffer (Integer id);
	public void updateOffer (Offer offer);
}
