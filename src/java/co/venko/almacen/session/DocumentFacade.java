/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.venko.almacen.session;

import co.venko.almacen.entities.Document;
import co.venko.almacen.entities.Users;
import co.venko.almacen.vo.DocumentVO;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
@Stateless
public class DocumentFacade extends AbstractFacade<Document> {

    @PersistenceContext(unitName = "VerifiquesePremiumAlmacenPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocumentFacade() {
        super(Document.class);
    }

    public void createDocument(DocumentVO documentVO) throws Exception {
            Document document = new Document();
            document.setBirthdate(documentVO.getBirthDate());
            document.setBloodRh(documentVO.getBloodRH());
            document.setBloodType(documentVO.getBloodType());
            document.setCitizenId(documentVO.getCitizenID());
            document.setCountry(documentVO.getCountry());
            document.setCreationDate(new Date());
            document.setDocumentType(documentVO.getDocumentType());
            document.setFirstName(documentVO.getFirstName());
            document.setFirstSurname(documentVO.getFirstSurname());
            document.setSecondName(documentVO.getSecondName());
            document.setSecondSurname(documentVO.getSecondSurname());
            document.setUserName(new Users(documentVO.getUser()));
            document.setReadingDate(documentVO.getReadingDate());
            document.setLatitud(documentVO.getLatidud());
            document.setLongitud(documentVO.getLongitud());
            create(document);
    }

    public int countFindByUser(String user) {
        Query q = getEntityManager().createQuery("SELECT COUNT(d) FROM Document d WHERE d.userName.userName = :user");
        q.setParameter("user", user);
        return ((Long) q.getSingleResult()).intValue();
    }

    public List findRangeUser(int[] i, String user) {
        Query q = getEntityManager().createQuery("SELECT d FROM Document d WHERE d.userName.userName = :user ORDER BY d.idDocument DESC");
        q.setParameter("user", user);
        q.setMaxResults(i[1] - i[0] + 1);
        q.setFirstResult(i[0]);
        return q.getResultList();
    }

}
