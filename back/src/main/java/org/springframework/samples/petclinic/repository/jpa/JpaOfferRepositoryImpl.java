
package org.springframework.samples.petclinic.repository.jpa;

@Repository
@Profile("jpa")
public class JpaOfferRepositoryImpl implements OfferRepository {

    @PersistenceContext
    private EntityManager em;


    @Override
    public void save(Offer offer) {
        if (offer.getId() == null) {
            this.em.persist(offer);
        } else {
            this.em.merge(offer);
        }

    }

	@Override
	public void delete(Offer offer) throws DataAccessException {
		this.em.remove(this.em.contains(offer) ? owner : this.em.merge(offer));
	}

}
