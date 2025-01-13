package oop.class_object.clone;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException{
        Agent agent = new Agent("Mr. Smith");
//        Agent clone = (Agent) agent.clone();
        Agent[] agents = make1000Clones(agent);
        for (Agent clone : agents) {
            System.out.println(clone);

        }

    }

    public static Agent[] make1000Clones (Agent agent) throws CloneNotSupportedException {
        Agent[] agents = new Agent[1000];
        for (int i = 0; i < 1000; i++) {
            agents[i] = (Agent) agent.clone();
        }
        return agents;
    }
}
