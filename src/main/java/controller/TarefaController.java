
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.List;

import model.Carro;
import model.Tarefa;

import util.ConnectionFactory;

//CRUD do sistema
public class TarefaController
{    
     public void saveTarefa(Tarefa tarefa)
    {
        String sql = "INSERT INTO tarefas (placa,data,titulo,texto) "
                + "VALUES (?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try
        {
            connection = ConnectionFactory.getConnection();//Realiza a conexão
            statement = connection.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1, tarefa.getPlaca());//Define os parâmetros
            Date sqldate = new java.sql.Date(tarefa.getDatatarefa().getTime());
            statement.setDate(2, sqldate);
            statement.setString(3, tarefa.getTitulo());
            statement.setString(4, tarefa.getTexto());
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
     
    public void updateTarefa(Tarefa tarefa)
    {
        String sql = "UPDATE tarefas "
                + "SET data = ?,"
                + "texto = ? "
                + "WHERE placa = ? "
                + "AND titulo = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        try
        {
            connection = ConnectionFactory.getConnection();//Realiza a conexão
            statement = connection.prepareStatement(sql);//Prepara o comando sql
            Date sqldate = new java.sql.Date(tarefa.getDatatarefa().getTime());
            statement.setDate(1, sqldate);//Define os parâmetros
            statement.setString(2, tarefa.getTexto());
            statement.setString(3, tarefa.getPlaca());
            statement.setString(4, tarefa.getTitulo());
            statement.execute();//Executa o comando SQL
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao atualizar a tarefa " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(connection, statement);//Encerra a conexão e fecha o statement
        }
    }
    
    public void deleteTarefa(String placa)
    {
       String sql = "DELETE FROM tarefas WHERE placa = ?";
        Connection con = null;
        PreparedStatement statement = null;
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1, placa);//Muda o ? para o id da tarefa
            statement.execute();//Executa o comando SQL
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao deletar as tarefas " + e.getMessage(), e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement);//Encerra a conexão e fecha o statement
        } 
    }
    
    public void deleteSpecificTarefa (Tarefa tarefa)
    {
        String sql = "DELETE FROM tarefas WHERE placa = ? AND titulo = ?";
        Connection con = null;
        PreparedStatement statement = null;

        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1, tarefa.getPlaca());//Muda o ? para o id da tarefa
            statement.setString(2, tarefa.getTitulo());
            statement.execute();//Executa o comando SQL
        }
        catch (Exception e)
        {
            throw new RuntimeException("Erro ao deletar a tarefa " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(con, statement);//Encerra a conexão e fecha o statement
        }
    }

     public List<Tarefa> getTarefasByPlaca(String placa)
    {
        String sql = "SELECT * FROM tarefas WHERE placa = ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de tarefas que será devolvida quando a chamado do método acontecer
        List<Tarefa> lista = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setString(1,placa);//Coloca a string de referência
            resultSet = statement.executeQuery();//Valor retornado pela execução da query
            
            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                Tarefa tarefa = new Tarefa();
                tarefa.setPlaca(resultSet.getString("placa"));
                tarefa.setDatatarefa(resultSet.getDate("data"));
                tarefa.setTitulo(resultSet.getString("titulo"));
                tarefa.setTexto(resultSet.getString("texto"));
                lista.add(tarefa);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar as tarefas " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
        }
        return lista;//Retorna a LISTA
    }
     
    public List<Carro> getCarByTarefa(String Tarefa)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "SELECT placa FROM tarefas WHERE data LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; // Guarda o retorno do banco de dados
        
        //Lista de carros que será devolvida quando a chamado do método acontecer
        List<Carro> carro = new ArrayList<>();
        String lastCarro = "0";
        
        String sql2 = "SELECT * FROM carros WHERE placa LIKE ?";
        PreparedStatement statement2 = null;
        ResultSet resultSet2 = null;
        Connection con2 = null;
        
        try
        {
            java.util.Date dataUtil = format.parse(Tarefa);//Converte a string para util.Date
            Date sqldate = new Date(dataUtil.getTime());//Converte a data para sql.Date
            con = ConnectionFactory.getConnection();//Realiza a conexão
            statement = con.prepareStatement(sql);//Prepara o comando sql
            statement.setDate(1,sqldate);//Coloca a data de referência
            resultSet = statement.executeQuery();//Valor retornado pela execução da query

            while(resultSet.next())//Enquanto houverem valores a serem percorridos no resultSet
            {
                con2 = ConnectionFactory.getConnection();
                statement2 = con2.prepareStatement(sql2);
                statement2.setString(1,resultSet.getString("placa"));
                resultSet2 = statement2.executeQuery();
                
                while(resultSet2.next())
                {
                    if(!lastCarro.equals(resultSet2.getString("placa")))//Para evitar que retorne duas vezes o mesmo carro
                    {
                        Carro car = new Carro();
                        car.setId(resultSet2.getInt("ID"));//Pega todos os dados
                        car.setPlaca(resultSet2.getString("placa"));
                        lastCarro = resultSet2.getString("placa");
                        car.setDono(resultSet2.getString("dono"));
                        car.setMarca(resultSet2.getString("marca"));
                        car.setModelo(resultSet2.getString("modelo"));
                        car.setEntrada(resultSet2.getDate("entrada"));
                        car.setSaida(resultSet2.getDate("saida"));
                        car.setComentarios(resultSet2.getString("comentarios"));
                        carro.add(car);
                    }
                }
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veiculos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);//Encerra a conexão e fecha o statement
            ConnectionFactory.closeConnection(con2, statement2, resultSet2);
        }
        return carro;//Retorna a LISTA
    }
     
}
