import model.Gerente;
import model.Operador;
import model.RegistroPonto;
import model.Secretaria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {

        Gerente gerente = new Gerente();
        gerente.setLogin("thainarabi");
        gerente.setSenha("thainara123");
        gerente.setNome("Thainara");
        gerente.setIdFunc(1);
        gerente.setEmail("thainara@gmail.com");
        gerente.setDocumento("123.456.789-10");

        Secretaria secretaria = new Secretaria();
        secretaria.setTelefone("33323-5545");
        secretaria.setRamal("553");
        secretaria.setNome("Lucia");
        secretaria.setIdFunc(2);
        secretaria.setEmail("lulu@gmail.com");
        secretaria.setDocumento("321.654.987-01");

        Operador operador = new Operador();
        operador.setValorHora(5.5);
        operador.setNome("Jose");
        operador.setIdFunc(3);
        operador.setEmail("joseph@gmail.com");
        operador.setDocumento("240.114.254-25");

        RegistroPonto gerentePonto = new RegistroPonto();
        RegistroPonto secretariaPonto = new RegistroPonto();
        RegistroPonto operadorPonto = new RegistroPonto();

        System.out.println("###########################");
        gerentePonto.setFunc(gerente);
        gerentePonto.setDataRegistro(LocalDate.now());
        gerentePonto.setHoraEntrada(LocalDateTime.now());
        gerentePonto.apresentarRegistroPonto();
        Thread.sleep(2000);

        System.out.println("###########################");
        secretariaPonto.setFunc(secretaria);
        secretariaPonto.setDataRegistro(LocalDate.now());
        secretariaPonto.setHoraEntrada(LocalDateTime.now());
        secretariaPonto.apresentarRegistroPonto();
        Thread.sleep(2000);

        System.out.println("###########################");
        operadorPonto.setFunc(operador);
        operadorPonto.setDataRegistro(LocalDate.now());
        operadorPonto.setHoraEntrada(LocalDateTime.now());
        operadorPonto.apresentarRegistroPonto();
        Thread.sleep(2000);

        //SAIDAS
        System.out.println("###########################");
        gerentePonto.getFunc();
        gerentePonto.getDataRegistro();
        gerentePonto.getHoraEntrada();
        gerentePonto.setHoraSaida(LocalDateTime.now());
        gerentePonto.apresentarRegistroPonto();
        Thread.sleep(2000);

        System.out.println("###########################");
        secretariaPonto.getFunc();
        secretariaPonto.getDataRegistro();
        secretariaPonto.getHoraEntrada();
        secretariaPonto.setHoraSaida(LocalDateTime.now());
        secretariaPonto.apresentarRegistroPonto();
        Thread.sleep(2000);

        System.out.println("###########################");
        operadorPonto.getFunc();
        operadorPonto.getDataRegistro();
        operadorPonto.getHoraEntrada();
        operadorPonto.setHoraSaida(LocalDateTime.now());
        operadorPonto.apresentarRegistroPonto();
        Thread.sleep(2000);
    }
}