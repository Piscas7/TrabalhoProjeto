package BaseDados;
// Generated 7/jun/2017 21:44:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Encomenda generated by hbm2java
 */
public class Encomenda  implements java.io.Serializable {


     private BigDecimal codigo;
     private Funcionario funcionario;
     private double valortotal;
     private Date datarecebida;
     private Date datapedido;
     private Set linhaencomendas = new HashSet(0);

    public Encomenda() {
    }

	
    public Encomenda(BigDecimal codigo, Funcionario funcionario, double valortotal, Date datarecebida, Date datapedido) {
        this.codigo = codigo;
        this.funcionario = funcionario;
        this.valortotal = valortotal;
        this.datarecebida = datarecebida;
        this.datapedido = datapedido;
    }
    public Encomenda(BigDecimal codigo, Funcionario funcionario, double valortotal, Date datarecebida, Date datapedido, Set linhaencomendas) {
       this.codigo = codigo;
       this.funcionario = funcionario;
       this.valortotal = valortotal;
       this.datarecebida = datarecebida;
       this.datapedido = datapedido;
       this.linhaencomendas = linhaencomendas;
    }
   
    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    public double getValortotal() {
        return this.valortotal;
    }
    
    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }
    public Date getDatarecebida() {
        return this.datarecebida;
    }
    
    public void setDatarecebida(Date datarecebida) {
        this.datarecebida = datarecebida;
    }
    public Date getDatapedido() {
        return this.datapedido;
    }
    
    public void setDatapedido(Date datapedido) {
        this.datapedido = datapedido;
    }
    public Set getLinhaencomendas() {
        return this.linhaencomendas;
    }
    
    public void setLinhaencomendas(Set linhaencomendas) {
        this.linhaencomendas = linhaencomendas;
    }




}


