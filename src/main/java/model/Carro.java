
package model;

import java.util.Date;

public class Carro 
{
    private String placa;
    private String dono;
    private String marca;
    private String modelo;
    private Date entrada;
    private Date saida;
    private String comentarios;
    private int id;
    private boolean local1;
    private boolean local2;
    private boolean local3;
    private boolean local4;

    public Carro()
    {
        this.placa = null;
        this.dono = null;
        this.marca = null;
        this.modelo = null;
        this.entrada = null;
        this.saida = null;
        this.comentarios = null;
        this.local1 = false;
        this.local2 = false;
        this.local3 = false;
        this.local4 = false;
    }

    public boolean isLocal1()
    {
        return local1;
    }
    public void setLocal1(boolean local1)
    {
        this.local1 = local1;
    }
    public boolean isLocal2()
    {
        return local2;
    }
    public void setLocal2(boolean local2)
    {
        this.local2 = local2;
    }
    public boolean isLocal3()
    {
        return local3;
    }
    public void setLocal3(boolean local3)
    {
        this.local3 = local3;
    }
    public boolean isLocal4()
    {
        return local4;
    }
    public void setLocal4(boolean local4)
    {
        this.local4 = local4;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) 
    {
        this.dono = dono;
    }

    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    } 
    
    public Date getEntrada() 
    {
        return entrada;
    }

    public void setEntrada(Date entrada) 
    {
        this.entrada = entrada;
    }

    public Date getSaida() 
    {
        return saida;
    }

    public void setSaida(Date saida) 
    {
      this.saida = saida;
    }
      
}
