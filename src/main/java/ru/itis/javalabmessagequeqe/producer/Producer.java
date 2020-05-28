package ru.itis.javalabmessagequeqe.producer;

import ru.itis.javalabmessagequeqe.jlmq.Jlmq;
import ru.itis.javalabmessagequeqe.jlmq.JlmqConnector;
import ru.itis.javalabmessagequeqe.jlmq.JlmqProducer;

import java.util.Scanner;

public class Producer {
    public static void main(String[] args) {
        JlmqConnector connector = Jlmq.connector().port("8080").connect();
        JlmqProducer jlmqProducer = connector.producer()
                .toQueue("documents_for_generate")
                .create();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.next();
            jlmqProducer.send(message);
        }
    }
}
