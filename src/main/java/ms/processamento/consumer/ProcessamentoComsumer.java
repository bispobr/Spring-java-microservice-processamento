package ms.processamento.consumer;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import ms.processamento.dto.PedidoDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class ProcessamentoComsumer {

    @RabbitListener(queues = "${broker.queue.processamento.name}")
    public void listenerProcessamentoQueue(@Valid PedidoDTO pedidoDTO){

        System.out.println(pedidoDTO.descricao());
    }
}
