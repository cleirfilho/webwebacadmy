package br.ufac.sgcm;

import java.util.List;

import br.ufac.sgcm.dao.ProfissionalDao;

public class teste {
    
    public static void main(String[] args){

        ProfissionalDao dao = new ProfisionalDao();
        List<Profissional> profissionais = dao.getALL();

        for(Profissional profissional : profissionais){

            System.out.println(profissional.getNome());
            
        }
    }
}
