package com.oncontrolsysv001.driver;

import com.oncontrolsysv001.model.Impressora;
import com.oncontrolsysv001.model.Manutencao;
import com.oncontrolsysv001.util.JpaUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author itccolina
 */
public class ManutencaoPersistData {
    public static void main(String[] args) {
        
        Impressora impressora001 = new Impressora("impressora termica bematech", "MP-4200 TH", "101000800000155332");
        Impressora impressora002 = new Impressora("impressora termica bematech", "MP-4200 TH", "101000800000548785");
        Impressora impressora003 = new Impressora("impressora termica bematech", "MP-4200 TH", "101000800000374589");
        Impressora impressora004 = new Impressora("impressora termica bematech", "MP-4200 TH", "101000800000175495");
        Impressora impressora005 = new Impressora("impressora termica bematech", "MP-4200 TH", "101000800000578438");
        
        List<Impressora> impressoras = new ArrayList<>();
        impressoras.add(impressora001);
        impressoras.add(impressora002);
        impressoras.add(impressora003);
        impressoras.add(impressora004);
        impressoras.add(impressora005);

        EntityManager em = JpaUtil.openConnetion();
        em.getTransaction().begin();
        
        Manutencao manutencao = new Manutencao();
        manutencao.setImpressoras(impressoras);
        manutencao.setCaixaRetirada("caixa fisico 008");
        manutencao.setNota("Retirada para a assist tecnic");
        em.persist(manutencao);
        
        em.getTransaction().commit();
        
        JpaUtil.closeConnection();
        
    }
}
