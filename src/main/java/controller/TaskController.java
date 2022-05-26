
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.List;

import model.Car;
import model.Task;

import util.ConnectionFactory;

//CRUD do sistema
public class TaskController
{    
     public void saveTask(Task task)
    {
        String sql = "INSERT INTO tarefas (placa,data,titulo,texto) "
                + "VALUES (?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try
        {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, task.getPlate());
            
            Date sqldate = new java.sql.Date(task.getTaskDate().getTime());
            statement.setDate(2, sqldate);
            
            statement.setString(3, task.getTitle());
            statement.setString(4, task.getText());
            statement.execute();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao cadastrar o veículo " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
     
    public void updateTask(Task task)
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
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            Date sqldate = new java.sql.Date(task.getTaskDate().getTime());
            statement.setDate(1, sqldate);
            
            statement.setString(2, task.getText());
            statement.setString(3, task.getPlate());
            statement.setString(4, task.getTitle());
            statement.execute();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao atualizar a tarefa " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void deleteTaskByPlate(String plate)
    {
       String sql = "DELETE FROM tarefas WHERE placa = ?";
        Connection con = null;
        PreparedStatement statement = null;
        
        try
        {
            con = ConnectionFactory.getConnection();
            statement = con.prepareStatement(sql);
            
            statement.setString(1, plate);
            statement.execute();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao deletar as tarefas " + e.getMessage(), e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement);
        } 
    }
    
    public void deleteTask(Task task)
    {
        String sql = "DELETE FROM tarefas WHERE placa = ? AND titulo = ?";
        Connection con = null;
        PreparedStatement statement = null;

        try
        {
            con = ConnectionFactory.getConnection();
            statement = con.prepareStatement(sql);
            
            statement.setString(1, task.getPlate());
            statement.setString(2, task.getTitle());
            statement.execute();
        }
        catch (Exception e)
        {
            throw new RuntimeException("Erro ao deletar a tarefa " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(con, statement);
        }
    }

     public List<Task> getTasksByPlate(String plate)
    {
        String sql = "SELECT * FROM tarefas WHERE placa = ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Task> taskList = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();
            statement = con.prepareStatement(sql);
            
            statement.setString(1, plate);
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Task task = new Task();
                task.setPlate(resultSet.getString("placa"));
                task.setTaskDate(resultSet.getDate("data"));
                task.setTitle(resultSet.getString("titulo"));
                task.setText(resultSet.getString("texto"));
                taskList.add(task);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar as tarefas " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return taskList;//Retorna a LISTA
    }
     
    public List<Car> getCarByTask(String task)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "SELECT placa FROM tarefas WHERE data LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Car> carList = new ArrayList<>();
        String lastCar = "0";
        
        String sql2 = "SELECT * FROM carros WHERE placa LIKE ?";
        PreparedStatement statement2 = null;
        ResultSet resultSet2 = null;
        Connection con2 = null;
        
        try
        {
            java.util.Date dataUtil = format.parse(task);
            Date sqldate = new Date(dataUtil.getTime());
            
            con = ConnectionFactory.getConnection();
            statement = con.prepareStatement(sql);
            
            statement.setDate(1,sqldate);
            resultSet = statement.executeQuery();

            while(resultSet.next())
            {
                con2 = ConnectionFactory.getConnection();
                statement2 = con2.prepareStatement(sql2);
                statement2.setString(1,resultSet.getString("placa"));
                resultSet2 = statement2.executeQuery();
                
                while(resultSet2.next())
                {
                    //Para evitar que retorne duas vezes o mesmo carro
                    if(!lastCar.equals(resultSet2.getString("placa")))
                    {
                        Car car = new Car();
                        car.setId(resultSet2.getInt("ID"));
                        car.setPlate(resultSet2.getString("placa"));
                        lastCar = resultSet2.getString("placa");
                        car.setOwner(resultSet2.getString("dono"));
                        car.setBrand(resultSet2.getString("marca"));
                        car.setModel(resultSet2.getString("modelo"));
                        car.setEntrance(resultSet2.getDate("entrada"));
                        car.setEntrance(resultSet2.getDate("saida"));
                        car.setComments(resultSet2.getString("comentarios"));
                        car.setInFirstLocal(resultSet2.getBoolean("local1"));
                        car.setInSecondLocal(resultSet2.getBoolean("local2"));
                        car.setInThirdLocal(resultSet2.getBoolean("local3"));
                        car.setInFourthLocal(resultSet2.getBoolean("local4"));
                        carList.add(car);
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
            ConnectionFactory.closeConnection(con, statement, resultSet);
            ConnectionFactory.closeConnection(con2, statement2, resultSet2);
        }
        return carList;
    }
     
}
