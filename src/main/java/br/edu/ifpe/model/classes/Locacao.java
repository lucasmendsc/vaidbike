/*MIT License

Copyright (c) 2018 Milena dos Santos Macedo, Carlos André Cordeiro da Silva, 
Adrielly Calado Sales, Luciano Campos de Lima Júnior.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package br.edu.ifpe.model.classes;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Milena Macedo - milenasantosmcd@gmail.com
 */
@Entity
public class Locacao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locacao")
    private Integer codigo;
    @OneToOne
    @JoinColumn(name = "cod_cliente")
    private Usuario cliente;
    @OneToOne
    @JoinColumn(name = "cod_locatario")
    private Usuario locatario;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date retirada;
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date devolucao;

    @Deprecated
    public Locacao() {
    }

    public Locacao(Usuario cliente, Usuario locatario,
            Date retirada, Date devolucao) {
        this.cliente = cliente;
        this.locatario = locatario;
        this.retirada = retirada;
        this.devolucao = devolucao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public Usuario getLocatario() {
        return locatario;
    }

    public Date getRetirada() {
        return retirada;
    }

    public void setRetirada(Date retirada) {
        this.retirada = retirada;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

    @Override
    public int hashCode() {
        final int HASH = 11;
        int result = 1;
        result = (HASH * result) + codigo.hashCode();
        result = (HASH * result) + cliente.hashCode();
        result = (HASH * result) + locatario.hashCode();
        result = (HASH * result) + retirada.hashCode();
        return (HASH * result) + devolucao.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Locacao))
            return false;
        
        if(!((Locacao) obj).codigo.equals(this.codigo))
            return false;
        
        if(!((Locacao) obj).cliente.equals(this.cliente))
            return false;
        
        if(!((Locacao) obj).locatario.equals(this.locatario))
            return false;
        
        if(!((Locacao) obj).retirada.equals(this.retirada))
            return false;
        
        return (((Locacao) obj).devolucao.equals(this.devolucao));
    }

    @Override
    public String toString() {
        return "Locacao{" + "codigo=" + codigo + ", cliente="
                + cliente + ", locatario=" + locatario +
                    ", retirada=" + retirada + ", devolucao=" + devolucao + '}';
    }  
}