package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.ufac.sgcm.model.Profissional;
import br.ufac.sgcm.model.Unidade;

public class ProfissionalDao implements IDao<Profissional> {

        private Connection conexao;
        private PreparedStatement ps;
        private ResultSet rs;
        private EspecialidadeDao especialidadeDao;
        private UnidadeDao UnidadeDao;
        public ProfissionalDao() {
            conexao = ConexaoDB.getConexao();
            especialidadeDao = new EspecialidadeDao();
            UnidadeDao = new UnidadeDao();
        }

    @Override
    public List<Profissional> getAll() {
        // TODO Auto-generated method stub
        List<Profissional> registro = new ArrayList<>();
        String sql = "SELECT * FROM Profissional";
        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
           while(rs.next()) {
                registro.setId(rs.getLong("id"));
                registro.setNome(rs.getString("nome"));
                registro.setRegistroConselho(rs.getString("registro_conselho"));
                registro.setEspecialidade(especialidadeDao.getById(rs.getLong("especialidade_id")));
                registro.setUnidades(unidadesDao.getById(rs.getLong("unidades_id")));
                registro.setEmail(rs.getString("email"));
                registro.setTelefone(rs.getString("telefone"));
                listaRegistro.add(registro);

           }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return registro;
    }

    @Override
    public Profissional getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Profissional> getByAll(String termodeBusca) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(Profissional objeto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(Profissional objeto) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
