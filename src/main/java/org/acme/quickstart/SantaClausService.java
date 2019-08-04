package org.acme.quickstart;

import org.acme.quickstart.dto.GiftDto;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SantaClausService {

    @Inject
    EntityManager em;

    @Transactional
    public void createGift(GiftDto giftDto) {
        Gift gift = new Gift();
        gift.setName(giftDto.getName());
        em.persist(gift);
    }

    public List<Gift> getAllGifts(){
        return em.createNamedQuery("Gift.getAllGifts").getResultList();
    }
}
