
package model;

import java.util.Date;

public class Tarefa
{
    private Date datatarefa;
    private String titulo;
    private String texto;
    private String placa;
    
    public Date getDatatarefa()
    {
        return datatarefa;
    }
    public void setDatatarefa(Date datatarefa)
    {
        this.datatarefa = datatarefa;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    public String getTexto()
    {
        return texto;
    }
    public void setTexto(String texto)
    {
        this.texto = texto;
    }
    public String getPlaca()
    {
        return placa;
    }
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
}
