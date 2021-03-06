package BaseDados;
// Generated 7/jun/2017 21:44:56 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {
    

     private BigDecimal codigo;
     private BigDecimal nif;
     private String nome;
     private String genero;
     private String observacao;
     private Set produtos = new HashSet(0);
     private Set vendaprodutoses = new HashSet(0);
     private Set vendaservicoses = new HashSet(0);
     private Set marcacaos = new HashSet(0);
     private Set servicos = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(BigDecimal codigo, BigDecimal nif, String nome, String genero, String observacao) {
        this.codigo = codigo;
        this.nif = nif;
        this.nome = nome;
        this.genero = genero;
        this.observacao = observacao;
    }
    public Cliente(BigDecimal codigo, BigDecimal nif, String nome, String genero, String observacao, Set produtos, Set vendaprodutoses, Set vendaservicoses, Set marcacaos, Set servicos) {
       this.codigo = codigo;
       this.nif = nif;
       this.nome = nome;
       this.genero = genero;
       this.observacao = observacao;
       this.produtos = produtos;
       this.vendaprodutoses = vendaprodutoses;
       this.vendaservicoses = vendaservicoses;
       this.marcacaos = marcacaos;
       this.servicos = servicos;
    }
   
    public BigDecimal getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
    }
    public BigDecimal getNif() {
        return this.nif;
    }
    
    public void setNif(BigDecimal nif) {
        this.nif = nif;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Set getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Set produtos) {
        this.produtos = produtos;
    }
    public Set getVendaprodutoses() {
        return this.vendaprodutoses;
    }
    
    public void setVendaprodutoses(Set vendaprodutoses) {
        this.vendaprodutoses = vendaprodutoses;
    }
    public Set getVendaservicoses() {
        return this.vendaservicoses;
    }
    
    public void setVendaservicoses(Set vendaservicoses) {
        this.vendaservicoses = vendaservicoses;
    }
    public Set getMarcacaos() {
        return this.marcacaos;
    }
    
    public void setMarcacaos(Set marcacaos) {
        this.marcacaos = marcacaos;
    }
    public Set getServicos() {
        return this.servicos;
    }
    
    public void setServicos(Set servicos) {
        this.servicos = servicos;
    }




}


