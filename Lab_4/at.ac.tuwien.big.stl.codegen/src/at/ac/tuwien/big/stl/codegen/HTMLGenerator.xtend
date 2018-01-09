package at.ac.tuwien.big.stl.codegen

import at.ac.tuwien.big.stl.System
import java.io.File
import java.io.FileInputStream
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccessExtension3
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.stl.Area
import at.ac.tuwien.big.stl.Component

class HTMLGenerator implements IGenerator {

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val EObject root = input.contents.get(0)
		generateFiles(root, fsa)
	}
	
	def dispatch generateFiles(System system, IFileSystemAccess fsa) {
		// copy static HTML resources: images, JavaScript, CSS
		copyFiles(new File("html"), system.outputDir + "/" + "html" + File.separator, fsa);
		
		// TODO generate index.html; consider the helpers defined below
		fsa.generateFile('''«system.name.toAlphaNumerical.toLowerCase»/html/index.html''',
		'''
		<!doctype html>
		<html lang="de">
		<head>
			<meta charset="utf-8">
			<title>BIG Smart Production Control Panel - Components</title>
			<link rel="stylesheet" href="styles/style.css">
			<script src="script/jquery-3.2.1.js" ></script>
			<script src="script/connect.js" ></script>
			<script type="text/javascript">
				$(function() {
					getTotalStatus();
					webSocket(null);
				});
			</script>
		</head>
		<body>
			<header aria-labelledby="bannerheadline">
				<a href="index.html"><img class="title-image" src="images/big-logo-small.png" alt="BIG Smart Production logo"></a>
				<h1 class="header-title" id="bannerheadline">BIG Smart Production Control Panel</h1>  
				<nav>
			    	<ul class="navigation-list">
			    		<li class="nav-items">
			        		<ul>
			        			<li><a href="#" onclick="restartSimulation()" class="button" accesskey="2">Start</a></li>
			        		</ul>
			      		</li>
			      	</ul>
				</nav>  
			</header>
			<div class="main-container">
				<aside class="sidebar" aria-labelledby="serverinfoheadline">
					<div class="production-info-container">
						<h2 class="accessibility" id="serverinfoheadline">Production Status</h2>
						<dl class="production-data properties">
							<dt class="accessibility">Production status:</dt>
							<dd class="production-status">Production status:</dd>
							<dt>System Costs</dt>
							<dd>
								<span>«calculateCost(system).formatInteger» €</span>
							</dd>
							<dt>Finished Products</dt>
							<dd>
								<span id="status_produced">0</span>
							</dd>
						</dl>
					</div>
				</aside>
		
				<main aria-labelledby="devicesheadline">
					<h2 class="main-headline" id="devicesheadline">Components</h2>
					«FOR Area a: system.areas»
						<h3>«a.name»</h3>
						<div class="devices">
						«FOR Component c: a.components»
								<div class="device-outer">
									<a href="details_«c.name.toAlphaNumerical».html" class="device" title="More information about this component">
										<div class="device-image-container">
											<img class="device-image" width="180" height="180" src="images/«c.eClass.name.toAlphaNumerical.toLowerCase».png" alt="Component image">
										</div>
										<dl class="device-properties">
											<dt>Name</dt>
											<dd class="device-displayname">«c.name»</dd>
											<dt>Type</dt>
											<dd class="visible device-type">«c.eClass.name»</dd>
											<dt class="visible">Utilization</dt>
											<dd id="device_RawShelfProducer_utilisation" class="visible device-utilisation">0<dd>
											«IF c.eClass.name.equals("Buffer") || c.eClass.name.equals("ProductStore") || c.eClass.name.equals("WasteStore")»
												<dt class="visible">Elements</dt>
												<dd id="device_«c.name.toAlphaNumerical»_elements" class="visible device-utilisation">0<dd>
											«ENDIF»
										</dl>
									</a>
						«ENDFOR»
						</div>
					«ENDFOR»
				</main>
			</div>
			<footer>
			  © 2017 BIG Smart Production
			</footer>
		</body>
		''');
		
		// TODO generate details pages details_*.html for components; consider the helpers defined below
		for (a: system.areas) {
			for (c: a.components) {
				fsa.generateFile('''«system.name.toAlphaNumerical.toLowerCase»/html/details_«c.name.toAlphaNumerical».html''',
					'''
					<!doctype html>
					<html lang="de">
					<head>
						<meta charset="utf-8">
						<title>BIG Smart Production Control Panel - Details «c.name»</title>
						<meta name="viewport" content="width=device-width, initial-scale=1">
						<link rel="stylesheet" href="styles/style.css">
						<script src="script/chart.bundle.js"></script>
						<script src="script/moment.min.js" ></script>
						<script src="script/jquery-3.2.1.js" ></script>
						<script src="script/connect.js" ></script>
						<script type="text/javascript">
							$(function() {
								createChart();
								getTotalStatus();
								webSocket("«c.name»","«c.name.toAlphaNumerical»");
							});
						</script>
					</head>
					<body>
						<header aria-labelledby="bannerheadline">
							<a href="index.html"><img class="title-image" src="images/big-logo-small.png" alt="BIG Smart Production logo"></a>
							<h1 class="header-title" id="bannerheadline">BIG Smart Production Control Panel</h1>
							<nav aria-labelledby="navigationheadline">
								<h2 class="accessibility" id="navigationheadline">Navigation</h2>
								<ul class="navigation-list">
									<li class="nav-items">
										<ul>
											<li><a href="#" onclick="restartSimulation()" class="button" accesskey="2">Start</a></li>
										</ul>
									</li>
						 		</ul>
							</nav>
						</header>
						<div class="main-container">
							<main aria-labelledby="deviceheadline" class="details-container">
								<div class="details-headline">
									<h2 class="main-headline" id="deviceheadline">«c.name»</h2>
								</div>
								<div class="details-holder">
									<div class="details-outer">
										<div class="details-image-container">
											<canvas id="utilisationChart" width="500" height="200" />
										</div>
										«IF c.eClass.name.equals("Buffer") || c.eClass.name.equals("ProductStore") || c.eClass.name.equals("WasteStore")»
											<div class="details-image-container">
												<canvas id="storeChart" width="500" height="200" />
											</div>
										«ENDIF»
										<div class="device-kpi">
											<dl class="properties">
												<dd>Cost: </dd>
												<dt>«c.cost.formatInteger» €</dt>
												<dd>Production time: </dd>
												<dt>«((c.services.get(0).processingTime) / 1000.0).formatDouble» s</dt>
												<dd>Error-rate: </dd>
												<dt>«((1 - c.services.get(0).reliability) * 100).formatDouble» %</dt>
												<dd>Average Utilization: </dd>
												<dt id="device_«c.name.toAlphaNumerical»_utilisation">0 %</dt>
												«IF c.eClass.name.equals("Buffer") || c.eClass.name.equals("ProductStore") || c.eClass.name.equals("WasteStore")»
													<dd>Stored Elements: </dd>
													<dt id="device_«c.name.toAlphaNumerical»_elements" class="device-utilisation">0<dt>
												«ENDIF»
											</dl>
										</div>
									</div>
								</div>
							</main>
						</div>
						<footer>
							© 2017 BIG Smart Home
						</footer>
					</body>
					</html>
					'''
				);
			}
		}
	}
	
	def dispatch generateFiles(EObject object, IFileSystemAccess access) {
		println("HTMLGenerator: Ignoring model element: " + object)
	}

	private def void copyFiles(File sourceFolder, String targetFolder, IFileSystemAccess fsa) {
		for (File sub : sourceFolder.listFiles) {
			val subName = targetFolder + sub.name;
			if (sub.isDirectory) {
				copyFiles(sub, subName + File.separator, fsa);
			} else {
				val fis = new FileInputStream(sub);
				(fsa as IFileSystemAccessExtension3).generateFile(subName, fis);
				fis.close();
			}
		}
	}

	/**
	 * Formats an Integer by introducing thousands separator.
	 * 
	 * @param i Integer that should be formatted
	 * @return formatted Integer value as String
	 */
	private def formatInteger(int i) {
		var ic = i
		var ret = ""
		while (ic >= 1000) {
			var part = "" + (ic % 1000)
			while (part.length < 3) {
				part = "0" + part
			}
			ret = "." + part + ret
			ic = ic / 1000
		}
		ret = ic + ret
		ret
	}

	/**
	 * Formats a double value by introducing floating point.
	 * 
	 * @param d double value that should be formatted
	 * @return formatted double value as String
	 */
	private def formatDouble(double d) {
		if (d == Math.round(d)) {
			return String.valueOf(d as long)
		}
		val ret = Math.round(d * 10);
		ret / 10 + "," + (ret % 10)
	}

	/**
	 * Returns a String which is stripped of all non alpha-numerical values. 
	 * This is needed for computing the identifiers (id) of HTML elements as well as 
	 * the file names for details pages.
	 * 
	 * @param string String for which non alpha-numerical values should be removed
	 * @return String with removed non alpha-numerical values
	 */
	private def toAlphaNumerical(String string) {
		string.replaceAll("[^A-Za-z0-9]", "")
	}
	
	/**
	 * Computes the output directory in which the generated HTML files should be places.
	 * 
	 * @param system STL system for which HTML code is generated
	 * @return name of the output directory in which the generated HTML files should be placed
	 */
	private def getOutputDir(System system) {
		val systemName = system?.name
		val systemNameInLowerCase = systemName.toLowerCase
		val systemNameWithoutSpaces = systemNameInLowerCase.replace(" ", "")
		systemNameWithoutSpaces
	}
	
	private def calculateCost(System system) {
		var int cost = 0;
		for (a: system.areas) {
			for (c: a.components) {
				cost += c.cost;
			}
		}
		cost
	}
}
