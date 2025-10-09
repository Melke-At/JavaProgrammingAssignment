package dao;

import entity.Currency_Converter;
import jakarta.persistence.*;

import java.util.List;

public class CurrencyDao {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("currencyPU");

    public List<Currency_Converter> getAllCurrencies() {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            return em.createQuery("SELECT c FROM Currency_Converter c", Currency_Converter.class)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("❌ Error fetching currencies: " + e.getMessage());
            return List.of();
        } finally {
            if (em != null) em.close();
        }
    }

    public double getExchangeRate(String code) {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            Currency_Converter c = em.createQuery(
                            "SELECT c FROM Currency_Converter c WHERE c.code = :code",
                            Currency_Converter.class)
                    .setParameter("code", code)
                    .getSingleResult();
            return c.getRateToUSD();
        } catch (NoResultException e) {
            System.out.println("⚠ Currency not found: " + code);
            return -1;
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            return -1;
        } finally {
            if (em != null) em.close();
        }
    }

    public void insertCurrency(Currency_Converter currency) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        try {
            tx.begin();
            em.persist(currency);
            tx.commit();
        } catch (Exception e) {
            System.out.println("❌ Error inserting currency: " + e.getMessage());
            if (tx.isActive()) tx.rollback();
        } finally {
            em.close();
        }
    }
}
