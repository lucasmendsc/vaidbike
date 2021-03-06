/*MIT License

Copyright (c) 2018 Milena dos Santos Macedo, Carlos André Cordeiro da Silva,
Adrielly Calado Sales, Lucas Mendes Cavalcanti.

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
package br.edu.ifpe.model.validation;

import br.edu.ifpe.model.classes.Bike;
import br.edu.ifpe.model.classes.Endereco;
import br.edu.ifpe.model.classes.Locacao;
import br.edu.ifpe.model.classes.Pagamento;
import br.edu.ifpe.model.classes.Usuario;
import br.edu.ifpe.model.hibernate.LocacaoHibernate;
import br.edu.ifpe.model.hibernate.UsuarioHibernate;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Milena Macedo <milenasantosmcd@gmail.com>
 */
public class PagamentoModelTest {
    /*
    private static final PagamentoModel PAGAMENTOMODEL = new PagamentoModel();
    
    private static final Endereco ENDERECO = new Endereco("estado", "cidade",
            "cep", "bairro", "logradouro");

    private static final Endereco ENDERECO1 = new Endereco("e", "c",
            "cc", "b", "l");

    private static final Usuario USUARIO1 = new Usuario(
            "login", "senha", "nome", "28961303066", "sexo",
            LocalDate.now(), ENDERECO1, "telefone", "email",
            new ArrayList<Bike>());

    private static final Usuario USUARIO2 = new Usuario(
            "login1", "senha1", "nome1", "28952871049", "sexo1",
            LocalDate.now(), ENDERECO, "telefone1", "email1",
            new ArrayList<Bike>());

    private static final Locacao LOCACAO
            = new Locacao(USUARIO1, USUARIO2, LocalDate.now(), LocalDate.now()); 

    private static Pagamento PAGAMENTO = 
            new Pagamento("tipo", new BigDecimal("20.00"),LOCACAO);

      @BeforeClass
    public static void deveInserirNoBD() throws Exception {
        UsuarioHibernate.getInstance().inserir(USUARIO1);
        UsuarioHibernate.getInstance().inserir(USUARIO2);
        LocacaoHibernate.getInstance().inserir(LOCACAO);
        PAGAMENTOMODEL.inserir(PAGAMENTO);
    }

    @Test
    public void deveRecuperarDoBD() throws Exception{
        assertEquals("TC001",PAGAMENTO,PAGAMENTOMODEL.recuperar(1));
    }

    @Test
    public void deveRecuperarTodosOsPagamentosDoBd() throws Exception {
        List<Pagamento> pagamentos = new ArrayList();
        pagamentos.add(PAGAMENTO);
        
        assertEquals("TC002",pagamentos,PAGAMENTOMODEL.listarTodos());
    }
    
    @AfterClass
    public static void deveLimparOBancoDados() {
        PAGAMENTOMODEL.deletar(PAGAMENTO);
    } 
    */
}
