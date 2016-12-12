/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataModel.BrukerDataModel;
import Database.Bruker;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Inneholder "business logic" til metoder relatert
 * til brukere i datamodellen som kjøres fra klienten via et interface.
 * 
 * Klassen lagrer informasjon i databasen ved
 * å bruke EntityManager.persist til å gjennomføre spørringer i
 * brukerklassen i package Database. Det har noe med "persistence context"
 * å gjøre. Jeg vet ikke riktig helt hvordan dette fungerer.
 * 
 * Da dette er en stateless session bean har den ikke en aktiv kobling
 * mot noe klient. De kjører med andre ord uavhengig av hverandre
 * før det gjennomføres en spørring fra klienten.
 * @author Adam
 */
@Stateless
public class BrukerSessionBean implements BrukerSessionBeanRemote {
    
    @PersistenceContext(unitName = "slit-server-ejbPU")
    private EntityManager em;
    


    @Override
    public BrukerDataModel getBrukerFromBId(int b_Id) {
        Bruker bruker = em.find(Bruker.class, b_Id);
        
        return convertBruker(bruker);
    }
    
    private BrukerDataModel convertBruker(Bruker bruker){
        
        BrukerDataModel brukerDM = new BrukerDataModel();
        
        brukerDM.setbId(bruker.getBID());
        brukerDM.setbFnavn(bruker.getBFnavn());
        brukerDM.setbEnavn(bruker.getBEnavn());
        brukerDM.setbEmail(bruker.getBEmail());
        brukerDM.setbPassord(bruker.getBPassord());
        brukerDM.setbType(bruker.getBType());
                
        return brukerDM;
    }
    
    private Bruker convertBrukerDataModel(BrukerDataModel bdm){
        
        Bruker bruker = new Bruker();
        bruker.setBFnavn(bdm.getbFnavn());
        bruker.setBEnavn(bdm.getbEnavn());
        bruker.setBEmail(bdm.getbEmail());
        bruker.setBPassord(bdm.getbPassord());
        bruker.setBType(bdm.getbType());
        
        return bruker;
        
    }
    
    public void persist(Object object) {
        em.persist(object);
    }  
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    

    @Override
    public BrukerDataModel brukerLogin(String epost, String passord) {
        BrukerDataModel loginModel = new BrukerDataModel();
        
        
        try{
            Query query = em.createNamedQuery("Bruker.brukerLogin", Bruker.class);
            
            query.setParameter("bEmail", epost);
            query.setParameter("bPassord", passord);
            
            Bruker bruker = (Bruker)query.getSingleResult();
            
            loginModel = this.convertBruker(bruker);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //Brukes til testing
        System.out.println("Etter Query: " + loginModel.getbEmail());
        System.out.println("Etter Query: " + loginModel.getbPassord());
        
        return loginModel;
    }
    
    
    public void newBruker(BrukerDataModel bdm)
    {
        
        Bruker newB = convertBrukerDataModel(bdm);
 
        em.persist(newB);
    }
    
    
    @Override
    public List<BrukerDataModel> getAllBrukere() {
        
        List<BrukerDataModel> bDmList = new ArrayList<>();
        List<Bruker> bList = em.createNamedQuery("Bruker.findAll").getResultList();
        
        for (Bruker b : bList)
        {
            BrukerDataModel bdm = convertBruker(b);
            bDmList.add(bdm);
            System.out.println(b.getBFnavn() + "" + b.getBEnavn());
        }
                
        return bDmList;
    }
    /*
    @Override
    public String getBrukerFNavnFromId(int bId) {
        return em.find(Bruker.class, bId).getBFnavn();
    }
    

    @Override
    public String getBrukerENavnFromId(int bId) {
        return em.find(Bruker.class, bId).getBEnavn();
    }

    @Override
    public String getBrukerEmailFromId(int bId) {
        return em.find(Bruker.class, bId).getBEmail();
    }

    @Override
    public String getBrukerPassordFromId(int bId) {
        return em.find(Bruker.class, bId).getBPassord();
    }

    @Override
    public int getBrukerTypeFromId(int bId) {
        return em.find(Bruker.class, bId).getBType();
    */
    
}
