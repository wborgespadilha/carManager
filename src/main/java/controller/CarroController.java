
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.List;

import model.Carro;

import util.ConnectionFactory;

//CRUD do sistema

public class CarroController 
{
    public void save(Carro car)
    {
        String sql = "INSERT INTO carros (placa,dono,marca,modelo,entrada,saida,comentarios,local1,local2,local3,local4) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try
        {
            connection = ConnectionFactory.getConnection();//Realiza a conexão
            statement = connection.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1, car.getPlaca());//Define os parâmetros
            statement.setString(2, car.getDono());
            statement.setString(3, car.getMarca());
            statement.setString(4, car.getModelo());
            Date sqldatein = new java.sql.Date(car.getEntrada().getTime());
            statement.setDate(5, sqldatein);
            if(car.getSaida() != null)
            {
                Date sqldateout = new java.sql.Date(car.getSaida().getTime());
                statement.setDate(6, sqldateout);
            }
            else
            {
                /*
                
                Aqui se a data de saída for vazia, setamos ela como 21/12/1969
                Depois, em DataSaidaConsulta fazemos uma verificação,
                Se bater com essa data não exibimos nada.
                
                */
                Date data = new Date(0);
                statement.setDate(6, data);
            }
            statement.setString(7, car.getComentarios());
            statement.setBoolean(8, car.isLocal1());
            statement.setBoolean(9, car.isLocal2());
            statement.setBoolean(10, car.isLocal3());
            statement.setBoolean(11, car.isLocal4());
            statement.execute();//Executa o comando SQL

        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao cadastrar o veículo " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(connection, statement);//Encerra a conexão e fecha o statement
        }
    }
     
    public void update(Carro car)
    {
        String sql = "UPDATE carros "
                + "SET placa = ?,"
                + "dono = ?,"
                + "marca = ?,"
                + "modelo = ?,"
                + "entrada = ?,"
                + "saida = ?,"
                + "comentarios = ?,"
                + "local1 = ?,"
                + "local2 = ?,"
                + "local3 = ?,"
                + "local4 = ? "
                + "WHERE ID = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        try
        {
            connection = ConnectionFactory.getConnection();//Realiza a conexão
            statement = connection.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1, car.getPlaca());//Define os parâmetros
            statement.setString(2, car.getDono());
            statement.setString(3, car.getMarca());
            statement.setString(4, car.getModelo());
            Date sqldatein = new java.sql.Date(car.getEntrada().getTime());
            statement.setDate(5, sqldatein);
            if(car.getSaida() != null)
            {
                Date sqldateout = new java.sql.Date(car.getSaida().getTime());
                statement.setDate(6, sqldateout);
            }
            else
            {
                /*
                
                Aqui se a data de saída for vazia, setamos ela como 21/12/1969
                Depois, em DataSaidaConsulta fazemos uma verificação,
                Se bater com essa data não exibimos nada.
                
                */
                Date data = new Date(0);
                statement.setDate(6, data);
            }
            statement.setString(7, car.getComentarios());
            statement.setBoolean(8, car.isLocal1());
            statement.setBoolean(9, car.isLocal2());
            statement.setBoolean(10, car.isLocal3());
            statement.setBoolean(11, car.isLocal4());
            statement.setInt(12, car.getId());
            statement.execute();//Executa o comando SQL
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao atualizar o veículo " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(connection, statement);//Encerra a conexão e fecha o statement
        }
    }
    
    public void removeById(int CarroID)
    {
        String sql = "DELETE FROM carros WHERE ID = ?";
        Connection con = null;
        PreparedStatement statement = null;
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setInt(1, CarroID);//Muda o ? para o id do carro
            statement.execute();//Executa o comando SQL
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao deletar o veículo " + e.getMessage(), e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement);//Encerra a conexão e fecha o statement
        }
    }
    
    public void delete(Carro carro)
    {
        String sql = "DELETE FROM carros WHERE ID = ?";
        Connection con = null;
        PreparedStatement statement = null;
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setInt(1, carro.getId());//Muda o ? para o id do carro
            statement.execute();//Executa o comando SQL
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao deletar o veículo " + e.getMessage(), e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement);//Encerra a conexão e fecha o statement
        }
    }
    
    public Carro getById(int idCarro)
    {
        String sql = "SELECT * FROM carros WHERE ID = ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        Carro car = new Carro();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setInt(1,idCarro);//Coloca o ID de referência
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar o veículo " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return car;//Retorna o carro
    }
    
    public List<Carro> getByPlaca(String Placa)
    {
        String sql = "SELECT * FROM carros WHERE placa LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do mêtodo acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1,Placa);//Coloca a string de referência
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
    public List<Carro> getByDono(String Dono)
    {
        String sql = "SELECT * FROM carros WHERE dono LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1,Dono);//Coloca a string de referência
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
    public List<Carro> getByMarca(String Marca)
    {
        String sql = "SELECT * FROM carros WHERE marca LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1,Marca);//Coloca a string de referência
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
    public List<Carro> getByModelo(String Modelo)
    {
        String sql = "SELECT * FROM carros WHERE modelo LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1,Modelo);//Coloca a string de referência
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
    public List<Carro> getByEntrada(String Entrada)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "SELECT * FROM carros WHERE entrada LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            java.util.Date dataUtil = format.parse(Entrada);//Converte a string para util.Date
            Date sqldate = new Date(dataUtil.getTime());//Converte a data para sql.Date
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setDate(1,sqldate);//Coloca a string de referência
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veéculos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
    public List<Carro> getBySaida(String Saida)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "SELECT * FROM carros WHERE saida LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            java.util.Date dataUtil = format.parse(Saida);//Converte a string para util.Date
            Date sqldate = new Date(dataUtil.getTime());//Converte a data para sql.Date
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setDate(1,sqldate);//Coloca a data de referência
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
    public List<Carro> getByLocal1()
    {
        String sql = "SELECT * FROM carros WHERE local1 = 1";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
    public List<Carro> getByLocal2()
    {
        String sql = "SELECT * FROM carros WHERE local2 = 1";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
    public List<Carro> getByLocal3()
    {
        String sql = "SELECT * FROM carros WHERE local3 = 1";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
    public List<Carro> getByLocal4()
    {
        String sql = "SELECT * FROM carros WHERE local4 = 1";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Carro car = new Carro();
                car.setId(resultSet.getInt("ID"));//Pega todos os dados
                car.setPlaca(resultSet.getString("placa"));
                car.setDono(resultSet.getString("dono"));
                car.setMarca(resultSet.getString("marca"));
                car.setModelo(resultSet.getString("modelo"));
                car.setEntrada(resultSet.getDate("entrada"));
                car.setSaida(resultSet.getDate("saida"));
                car.setComentarios(resultSet.getString("comentarios"));
                car.setLocal1(resultSet.getBoolean("local1"));
                car.setLocal2(resultSet.getBoolean("local2"));
                car.setLocal3(resultSet.getBoolean("local3"));
                car.setLocal4(resultSet.getBoolean("local4"));
                carro.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veéculos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return carro;//Retorna a LISTA
    }
    
}
