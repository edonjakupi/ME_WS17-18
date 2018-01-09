package shelfsawingproductionline.server;

import java.io.File;
import java.io.IOException;
	
import at.ac.tuwien.big.stl.codegen.lib.server.Server.SimpleServer;
import at.ac.tuwien.big.stl.codegen.lib.util.ModelLoader;
import at.ac.tuwien.big.stl.simulation.SimulationModel;
	
public class ShelfSawingProductionLineServer {
		
	public static void main(String[] args) throws IOException {
		SimulationModel simModel = ModelLoader.load("file:/D:/Master/04/188.923/Lab4/at.ac.tuwien.big.stl.codegen/models/shelf-sawing-production-line.stlsimulation");
		File outputDir = new File("src-gen/shelfsawingproductionline/html");
		SimpleServer server = new SimpleServer(simModel, null, 8888, outputDir, false);
		server.configSimulatorAndRun();
		server.start();
	}
}
