package at.ac.tuwien.big.stl.codegen.lib.util;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import at.ac.tuwien.big.stl.STLPackage;
import at.ac.tuwien.big.stl.simulation.STLSimulationPackage;
import at.ac.tuwien.big.stl.simulation.SimulationModel;

public class ModelLoader {

	/**
	 * Loads the STL simulation model located in the specified path.
	 * 
	 * @param path
	 *            Path of the STL simulation model that should be loaded
	 * @return the SimulationModel element defined in the STL simulation model
	 *         located in the specified path
	 */
	public static SimulationModel load(String path) {
		// TODO
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("stl", new XMIResourceFactoryImpl());
		m.put("stlsimulation", new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		resourceSet.getPackageRegistry().put(STLPackage.eINSTANCE.getNsURI(),STLPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(STLSimulationPackage.eINSTANCE.getNsURI(),STLSimulationPackage.eINSTANCE);
		
		URI fileUri = createURI(path);
		
		Resource resource = resourceSet.getResource(fileUri, true);
		
		return (SimulationModel) resource.getContents().get(0);
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
