package at.ac.tuwien.big.stl.henshin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.UnitApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.interpreter.impl.EngineImpl;
import org.eclipse.emf.henshin.interpreter.impl.UnitApplicationImpl;
import org.eclipse.emf.henshin.model.Module;
import org.eclipse.emf.henshin.model.Unit;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;

public class HenshinRunner {
	private static final String MODEL_DIR = "models";
	private static final String MODULE_PATH = "../henshin/stl.henshin";
	private static final String MODEL_EXTENSION = "xmi";

	public void applyTransformation(String modelName, String ruleName) {
		HenshinResourceSet resourceSet = new HenshinResourceSet(MODEL_DIR);

		// Load the module:
		Module module = resourceSet.getModule(MODULE_PATH, false);

		// Manually initialize the package registry:
		for (EPackage ePackage : module.getImports()) {
			resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		}

		// Prepare the engine:
		Engine engine = new EngineImpl();

		// Load the example model into an EGraph:
		EGraph graph = new EGraphImpl(resourceSet.getResource(modelName + "." + MODEL_EXTENSION));

		// Find the unit to be applied:
		Unit unit = module.getUnit(ruleName);

		UnitApplication application = new UnitApplicationImpl(engine, graph, unit, null);
		if (!application.execute(null)) {
			throw new RuntimeException("Error appling the HenshinTransformation");
		}

		resourceSet.saveEObject(graph.getRoots().get(0), modelName + "_transformed." + MODEL_EXTENSION);

	}

	public static void main(String[] args) throws CoreException {
		if (args.length % 2 != 0) {
			System.out.println(
					"Invalid number of arguments. The HenshinRunner requires a <ModelName> and a <RuleName> as arguments");
		}
		try {
			for (int i = 0; i < args.length - 1; i += 2) {
				new HenshinRunner().applyTransformation(args[i], args[i + 1]);
				System.out.println("The transformation of the model " + args[i] + "was sucessfull!");
			}

		} catch (RuntimeException e) {
			e.printStackTrace();
			System.err.println("The transformation of the model " + args[0] + "was not sucessfull!");
		}

	}

}
