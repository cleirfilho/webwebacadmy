package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.ufac.sgcm.model.Especialidade;

public class EspecialidadeDao implements IDao<Especialidade> {

    private Connection conexao;
    private PreparedStatement ps;
    public EspecialidadeDao() {
        conexao = ConexaoDB.getConexao();
    }
    @Override
    public List<Especialidade> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Especialidade getById(Long id) {
        Especialidade registro = new Especialidade();
        String sql = "SELECT * FROM especialidade WHERE id = ?";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setLong(1, id);
            ps.executeQuery();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return registro;
    }

    @Override
    public List<Especialidade> getByAll(String termodeBusca) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(Especialidade objeto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Especialidade objeto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

   

  
}
