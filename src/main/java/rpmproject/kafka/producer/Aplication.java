package rpmproject.kafka.producer;

import lombok.extern.slf4j.Slf4j;
import rpmproject.kafka.producer.eventos.ProdutorEvento;

@Slf4j
public class Aplication {

    public static void main(String[] args) {
        Aplication aplicacao = new Aplication();
        aplicacao.iniciar();
    }

    private void iniciar() {
        log.info("Iniciando a aplicação");
        ProdutorEvento produtor = new ProdutorEvento();
        produtor.executar();
    }
}
