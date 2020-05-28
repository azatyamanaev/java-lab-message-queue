package ru.itis.javalabmessagequeqe.jlmq;

import ru.itis.javalabmessagequeqe.models.Message;

public interface MessageReceiver{
    void receive(Message message);
}