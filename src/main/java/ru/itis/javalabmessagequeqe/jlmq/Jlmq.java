package ru.itis.javalabmessagequeqe.jlmq;


public class Jlmq {

    public static ConnectorBuilder connector(){
        return new ConnectorBuilder();
    }



    public static class ConnectorBuilder {
        private String port = "8080";

        public ConnectorBuilder port(String port){
            this.port = port;
            return this;
        }

        public JlmqConnector connect(){
            return JlmqConnector.builder().port(port).build();
        }
    }
}
