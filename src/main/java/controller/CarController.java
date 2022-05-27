
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.List;

import model.Car;

import util.ConnectionFactory;

//CRUD do sistema

public class CarController 
{
    public void create(Car car)
    {
        String sql = "INSERT INTO carros (placa,dono,marca,modelo,entrada,saida,comentarios,local1,local2,local3,local4) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try
        {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, car.getPlate());
            statement.setString(2, car.getOwner());
            statement.setString(3, car.getBrand());
            statement.setString(4, car.getModel());
            
            Date sqldatein = new java.sql.Date(car.getEntrance().getTime());
            statement.setDate(5, sqldatein);
            
            if(car.getExit() != null)
            {
                Date sqldateout = new java.sql.Date(car.getExit().getTime());
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
            
            statement.setString(7, car.getComments());
            statement.setBoolean(8, car.isInFirstLocal());
            statement.setBoolean(9, car.isInSecondLocal());
            statement.setBoolean(10, car.isInThirdLocal());
            statement.setBoolean(11, car.isInFourthLocal());
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
     
    public void update(Car car)
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
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, car.getPlate());
            statement.setString(2, car.getOwner());
            statement.setString(3, car.getBrand());
            statement.setString(4, car.getModel());
            
            Date sqldatein = new java.sql.Date(car.getEntrance().getTime());
            statement.setDate(5, sqldatein);
            
            if(car.getExit() != null)
            {
                Date sqldateout = new java.sql.Date(car.getExit().getTime());
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
            
            statement.setString(7, car.getComments());
            statement.setBoolean(8, car.isInFirstLocal());
            statement.setBoolean(9, car.isInSecondLocal());
            statement.setBoolean(10, car.isInThirdLocal());
            statement.setBoolean(11, car.isInFourthLocal());
            statement.execute();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao atualizar o veículo " + e.getMessage(), e);
        }
        finally
        {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void removeById(int carID)
    {
        String sql = "DELETE FROM carros WHERE ID = ?";
        Connection con = null;
        PreparedStatement statement = null;
        
        try
        {
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            statement.setInt(1, carID);
            
            statement.execute();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao deletar o veículo " + e.getMessage(), e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement);
        }
    }
    
    public void delete(Car car)
    {
        String sql = "DELETE FROM carros WHERE ID = ?";
        Connection con = null;
        PreparedStatement statement = null;
        
        try
        {
            con = ConnectionFactory.getConnection();
            statement = con.prepareStatement(sql);
            statement.setInt(1, car.getId());
            statement.execute();
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao deletar o veículo " + e.getMessage(), e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement);
        }
    }
    
    public Car getById(int carID)
    {
        String sql = "SELECT * FROM carros WHERE ID = ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        Car car = new Car();
        
        try
        {
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            statement.setInt(1,carID);
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar o veículo " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return car;
    }
    
    public List<Car> getByPlate(String plate)
    {
        String sql = "SELECT * FROM carros WHERE placa LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Car> carList = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            statement.setString(1,plate);
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;
    }
    
    public List<Car> getByOwner(String owner)
    {
        String sql = "SELECT * FROM carros WHERE dono LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Car> carList = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            statement.setString(1,owner);
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;
    }
    
    public List<Car> getByBrand(String brand)
    {
        String sql = "SELECT * FROM carros WHERE marca LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Car> carList = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            statement.setString(1,brand);
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;
    }
    
    public List<Car> getByModel(String model)
    {
        String sql = "SELECT * FROM carros WHERE modelo LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Car> carList = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();
            statement = con.prepareStatement(sql);
            statement.setString(1,model);
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;
    }
    
    public List<Car> getByEntrance(String entrance)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "SELECT * FROM carros WHERE entrada LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Car> carList = new ArrayList<>();
        
        try
        {
            java.util.Date dataUtil = format.parse(entrance);
            Date sqldate = new Date(dataUtil.getTime());
            
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            statement.setDate(1,sqldate);
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veéculos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;
    }
    
    public List<Car> getByExit(String exit)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "SELECT * FROM carros WHERE saida LIKE ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; 
        
        List<Car> carList = new ArrayList<>();
        
        try
        {
            java.util.Date dataUtil = format.parse(exit);
            Date sqldate = new Date(dataUtil.getTime());
            
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            statement.setDate(1,sqldate);
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;
    }
    
    public List<Car> getByFirstLocal()
    {
        String sql = "SELECT * FROM carros WHERE local1 = 1";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; 

        List<Car> carList = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;//Retorna a LISTA
    }
    
    public List<Car> getBySecondLocal()
    {
        String sql = "SELECT * FROM carros WHERE local2 = 1";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; 
        
        List<Car> carList = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();
            statement = con.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;
    }
    
    public List<Car> getByThirdLocal()
    {
        String sql = "SELECT * FROM carros WHERE local3 = 1";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Car> carList = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veículos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;
    }
    
    public List<Car> getByFourthLocal()
    {
        String sql = "SELECT * FROM carros WHERE local4 = 1";
        
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Car> carList = new ArrayList<>();
        
        try
        {
            con = ConnectionFactory.getConnection();
            
            statement = con.prepareStatement(sql);
            resultSet = statement.executeQuery();
            
            while(resultSet.next())
            {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setPlate(resultSet.getString("placa"));
                car.setOwner(resultSet.getString("dono"));
                car.setBrand(resultSet.getString("marca"));
                car.setModel(resultSet.getString("modelo"));
                car.setEntrance(resultSet.getDate("entrada"));
                car.setExit(resultSet.getDate("saida"));
                car.setComments(resultSet.getString("comentarios"));
                car.setInFirstLocal(resultSet.getBoolean("local1"));
                car.setInSecondLocal(resultSet.getBoolean("local2"));
                car.setInThirdLocal(resultSet.getBoolean("local3"));
                car.setInFourthLocal(resultSet.getBoolean("local4"));
                carList.add(car);
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException("Erro ao carregar os veéculos " + e.getMessage() ,e);
        }
        finally 
        {
            ConnectionFactory.closeConnection(con, statement, resultSet);
        }
        return carList;
    }
    
}
