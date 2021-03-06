package at.ac.tuwien.big.stl.codegen.lib.util;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import at.ac.tuwien.big.stl.simulation.SimulationModel;

public class ModelStore {

	/**
	 * Stores the provided SimulationModel element in an STL simulation model at the
	 * provided path
	 * 
	 * @param simModel
	 *            SimulationModel element that should be stored
	 * @param path
	 *            Path at which the STL simulation model should be stored
	 */
	public static void store(SimulationModel simModel, String path) {
		// TODO
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("stl", new XMIResourceFactoryImpl());
		m.put("stlsimulation", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		URI fileUri = createURI(path);
		
		Resource resource = resourceSet.createResource(fileUri);
		
		resource.getContents().add(simModel);
		
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Use this method to create an URI.
	 * 
	 * @param path
	 *            Path for which an URI should be created
	 * @return returns URI for the provided path
	 */
	private static URI createURI(String path) {
		return URIConverter.INSTANCE.normalize(URI.createURI(path));
	}
}
