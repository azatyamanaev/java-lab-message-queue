package ru.itis.javalabmessagequeqe.consumer;

import ru.itis.javalabmessagequeqe.jlmq.Jlmq;
import ru.itis.javalabmessagequeqe.jlmq.JlmqConnector;
import ru.itis.javalabmessagequeqe.jlmq.JlmqConsumer;

public class Consumer {
    public static void main(String[] args) {
        JlmqConnector connector = Jlmq.connector().port("8080").connect();
        JlmqConsumer jlmqConsumer = connector.consumer()
                .subscribe("documents_for_generate")
                .onReceive(message -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                    System.out.println(message);
                })
                .create();
    }
}
