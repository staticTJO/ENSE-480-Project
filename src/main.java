
public class main {

	public static void main(String[] args) {
        NeuralNetwork nn = new NeuralNetwork(2, 4, 1);
        int maxRuns = 50000;
        double minErrorCondition = 0.001;
        nn.run(maxRuns, minErrorCondition);

	}

}
